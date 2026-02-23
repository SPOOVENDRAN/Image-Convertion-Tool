import {useState , useEffect} from "react";
import Mainpage from "./Mainpage.jsx";
import {useParams} from "react-router-dom";
import axios from "axios";

function MainpageData(){
    let [detail , setDetail] = useState({
        "name":"poove",
        "designation":"employee",
        "experience":4
    });
    let {empId} = useParams();
    console.log(empId);
    async function dataTrans(){
            try{
                let response = await axios.get("http://localhost:8080/in?empid="+empId)
                setDetail(response.data)
            }catch (error){
                console.log(error)
            }
    }

    return(
        <Mainpage details={detail} dataTrans={dataTrans}/>
    )
}

export default MainpageData;
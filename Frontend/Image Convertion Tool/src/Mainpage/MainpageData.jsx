import {useState , useEffect} from "react";
import Mainpage from "./Mainpage.jsx";

function MainpageData(){
    let [detail , setDetail] = useState({
        "name":"poove",
        "role":"employee",
        "presentDays":4
    });
    function dataTrans(){
            fetch("http://localhost:8080/in")
                .then((response) => response.json())
                .then((data) => setDetail(data))
    }

    return(
        <Mainpage details={detail} dataTrans={dataTrans}/>
    )
}

export default MainpageData;
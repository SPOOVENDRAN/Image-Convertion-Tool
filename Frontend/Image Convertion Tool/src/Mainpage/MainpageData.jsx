import {useState, useEffect, use} from "react";
import Mainpage from "./Mainpage.jsx";
import {useParams} from "react-router-dom";
import axios from "axios";

function MainpageData(){
    let [message,setMessage] = useState("Please Upload a Image")  ;
    async function printImgInSpring(file){
        let form = new FormData();
        form.append("imgFile",file);
        let text = await axios.post("http://localhost:8080/postimg",form,
            {
                headers:{
                    "Content-Type":"multipart/form-data"
                }
            }
        );
        setMessage(text);
    }

    return(
        <Mainpage printImgInSpring={printImgInSpring} message = {message}/>
    )
}

export default MainpageData;
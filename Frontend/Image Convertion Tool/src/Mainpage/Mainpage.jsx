import './Mainpage.css'
import uploadpic from '../assets/uploadpic.png'
import { useState } from 'react';

function Mainpage(){
    let [image , setImage] = useState(null);
    let [isDragging , setIsDragging] = useState(false);
    let [format , setFormat] = useState('png');
    let [initialName , setInitialName] = useState('Panda.jpg')

    function handleFile(file){
        if(!file.type.startsWith('image/')){
            alert("Please upload image format contents")
            return;
        }
        if(!(Math.round((file.size) / 1000000),2) < 10.0){
            console.log((Math.round((file.size) / 1000000),2) < 10.0)
            alert("Please upload file size below 10MB")
            return;
        }
        if(file){
            setInitialName(file.name);
            let imgurl = URL.createObjectURL(file);
            setImage(imgurl);
        }
    }

    function handleImg(event){
        let file = event.target.files[0];
        console.log(file)
        handleFile(file);
    }

    function dragStarts(event){
        event.preventDefault();
        setIsDragging(true);
    }

    function dragEnds(event){
        event.preventDefault();
        setIsDragging(false);
    }

    function dragDrops(event){
        event.preventDefault();
        setIsDragging(false);
        let file = event.dataTransfer.files[0];
        handleFile(file);
    }

    return(
        <div className='mainpage'>

            <nav className='navbar'>
                <h3>Image Converter</h3>
            </nav>

            <div className='outer-div'>
                <div className='inner-div'>

                    <h4>Upload Your Image Here</h4>

                    <label className={`upload-box ${isDragging ? "dragging" : "" }`} onDragOver={dragStarts} onDragEnd={dragEnds} onDrop={dragDrops}>
                        <img src={uploadpic} alt="" className='uploadimg' />
                         Drag & Drop or Click to Browse the images
                        <input type="file" name="img" hidden onChange={(e) => handleImg(e)}/>
                        
                    </label>
                    
                </div>
                <div className='progress-bar'>

                </div>
                <div className="image-selection">

                    <div className="left-section">
                        <img src={image} alt="preview" className="previewimg" />
                    </div>

                    <div className="middle-section">

                        <p className="initial-name">{initialName[0].toUpperCase() + initialName.slice(1,initialName.length)}</p>

                        <p className="initial-format">{initialName?.split('.').pop()?.toUpperCase()}</p>

                        <span className="arrow">↓</span>
                        <select value={format}onChange={(e) => setFormat(e.target.value)}className="inner-drop">
                            <option value="PNG">PNG</option>
                            <option value="ICO">ICO</option>
                            <option value="JPG">JPG</option>
                        </select>
                        <button type="button"  className='convert-btn'>Covert</button>
                    </div>

                    <div className="right-section">
                        <img src={image} alt="preview" className="previewimg" />
                    </div>
                </div>


            </div>
            
        </div>
    )
}

export default Mainpage;
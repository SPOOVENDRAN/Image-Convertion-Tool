import './App.css'
import {createBrowserRouter , RouterProvider} from 'react-router-dom'
import Mainpage from './Mainpage/Mainpage'
import MainpageData from "./Mainpage/MainpageData.jsx";

let router = createBrowserRouter([
    {
      path:"/",
      element:<MainpageData/>
    }
]);

function App() {

  return  <RouterProvider router = {router}/>;

}

export default App

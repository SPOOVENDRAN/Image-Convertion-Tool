import './App.css'
import {createBrowserRouter , RouterProvider} from 'react-router-dom'
import Mainpage from './Mainpage/Mainpage'

let router = createBrowserRouter([
    {
      path:"/",
      element:<Mainpage/>
    }
]);

function App() {

  return  <RouterProvider router = {router}/>;

}

export default App

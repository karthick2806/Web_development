import './App.css'
import Course from './Component_creation/Course.jsx';
import Component from './Component_creation/Component.jsx';
import Footer from './Component_creation/Footer.jsx';
import External_module from './Styles/Css_module_styling/External_module.jsx';
import Inline_and_internal from './Styles/Inline_and_internal.jsx';
import External from './Styles/External_css/External.jsx';


function App() {
  return (
    <>                {/* We Cant add more than one class so wrapping up two functions in one empty tag  */}
    <Component/> {/*step 3:import the default exported there in component.jsx  */}
    <Course/>
    <Footer/>
    <External_module/>
    <Inline_and_internal/>
    <External/>
    </>
  );
}

export default App

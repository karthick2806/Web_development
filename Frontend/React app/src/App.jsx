import './App.css'
import Course from './Component_creation/Course.jsx';
import Component from './Component_creation/Component.jsx';
import Footer from './Component_creation/Footer.jsx';
import External_module from './Styles/Css_module_styling/External_module.jsx';
import Inline_and_internal from './Styles/Inline_and_internal.jsx';
import External from './Styles/External_css/External.jsx';
import Course_card from './Props_creation/props_example.jsx';


function App() {
  return (
    <>                {/* We Cant add more than one class so wrapping up two functions in one empty tag  */}
    <Component/> {/*step 3:import the default exported there in component.jsx  */}
    <Course/>
    <Footer/>
    <External_module/>
    <Inline_and_internal/>
    <External/>

    {/*repeatative usage of props with a single template like structure*/}
    <Course_card name="HTML" price="$334" show = {true}/>
    <Course_card name="CSS" price="$364" show = {false} />
    <Course_card show = {true}/>   {/*this value is given by default props*/} 



    </>
  );
}

export default App

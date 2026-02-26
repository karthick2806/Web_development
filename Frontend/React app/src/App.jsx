import './App.css'
import Course from './Course.jsx';
import Navbar from './Navbar.jsx';
import Footer from './Footer.jsx';
import External from './Styles/external.jsx';
import Internal from './Styles/internal.jsx';

function App() {
  return (
    <>                {/* We Cant add more than one class so wrapping up two functions in one empty tag  */}
    <Navbar/>
    <Course/>
    <Footer/>
    <External/>
    <Internal/>
    </>
  );
}

export default App

const course1 ="HTML"
// This is a comment line outside of the function

function Course(){
    return(
       <div className = "card">   /{/* Here class can be mistook as class coz class is a reserved keyword by JS so we are using className */}
        <img src="" alt=""/>
        <h3>{course1}</h3>  {/* The curly braces kinda works like console.log */}   
        <h4>{6+5+3+6+5+3}</h4>
        {/* This is a comment line inside of a jsx file */}
        <p>This is a HTML course</p>    
       </div> 
    );
}

export default Course
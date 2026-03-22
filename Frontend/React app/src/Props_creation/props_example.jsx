import "./props_example_css.css"

function Course_card({name="JAVA" , price="$654",show="yes" }){    {/*These are the default values*/}

    if (show == true){     {/*condition rendering renders the return html only the props value is true*/}
        
    return(
        <div className="Course_template">
            <img src=""/>
            <h3>{name}</h3>  {/*creating a simple template where we can simply change the contents on app.jsx*/}
            <p>{price}</p>
        </div>
    );
    }
    else{
        return(
            <div className="Course_template">
            <img src=""/>
            <h3>Course not available</h3> 
            </div>
        );

    }
} 

/*
Course_card.defaultProps = {
    name:"JAVA",        //default value if we didnt give the value for the props but we are giving it inside the function as argument i think 
    price:"$456",     
}
*/    

export default Course_card
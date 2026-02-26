
function Internal(){

    const styles = {
        backgroundColor : "red"
    };


return(
    <>  
    <p style = {{ backgroundColor: "yellow" }}> This Text is styled using Inline css</p>  
    <h3 style ={styles}>This Text is styled using Internal css  </h3>
   
    </>
    );
}


export default Internal
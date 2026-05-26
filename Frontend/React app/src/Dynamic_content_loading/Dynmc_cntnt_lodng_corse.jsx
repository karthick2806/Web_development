import "./Dynamc_contnt_lodng_corse_css.css"

function Dynmc_cntnt_lodng_corse({names,price,description}){

    return(
        <div className = "card_1">   {/* Here class can be mistook as class coz class is a reserved keyword by JS so we are using className */}
        <h3>{names}</h3>  
        <h4>{price}</h4>
        <p>{description}</p>    
       </div> 
    );
}

export default Dynmc_cntnt_lodng_corse;
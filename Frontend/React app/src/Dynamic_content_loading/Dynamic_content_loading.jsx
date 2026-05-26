import Dynmc_cntnt_lodng_corse  from "./Dynmc_cntnt_lodng_corse";



function Dynamic_content_loading() {
    const courses = [             //saving all those datas in a list called courses
        {
            name : "Java full course",
            price : "$287",
            description :"Click to purchase"
        },
        {
            name : "S/W testing course",    //actually this is a artificial data but we can get from a API
            price : "$387",
            description :"Click to purchase"
        },
        {
            name : "Dev Ops course",
            price : "$237",
            description :"Click to purchase",
        },
    ];
    
      console.log(courses);  

    const courselist = courses.map((Dynmc_cntnt_lodng_corse,index) => (        
        <Dynamc_contnt_lodng_corse 
        key={index}
        names={Dynmc_cntnt_lodng_corse.names}        // issa template for the no of list elements above mentioned
        price = {Dynmc_cntnt_lodng_corse.price} 
        description = {Dynmc_cntnt_lodng_corse.description}/>
    ));

   
        
    return(<>{courselist}</>);
}
export default Dynamic_content_loading;
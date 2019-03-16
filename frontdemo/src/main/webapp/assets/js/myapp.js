$(function() {
	//solving active menu problem
	switch(menu)
	{
	
	case 'About Us':
	$('#about').addClass('active');
	break;
	
	case 'Contact Us':
    $('#contact').addClass('active');
	break;
	
	case 'All Products':
		
    $('#listProducts').addClass('active');
    break;
	
	default:
		if(menu=="Home") break;
     $('#listProducts').addClass('active');
	 $('#a_'+menu).addClass('active');
	break;
	
	
	}
	



//jquery data table

//var products=[
	           ['1','ABC'],
	           ['2','ABz'],
	           ['3','AdC'],
	           ['4','AeC'],
	           ['5','AfC'],
	           ['6','AgC'],
	           ['7','AvC'],
	           ['8','AmC']
	           ];
	
	
 //var $table = $('#productListTable');
 //execute below code only where we have table
 
 //if($table.length)
// {
	 
 //}
 
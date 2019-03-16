$(function() {
	// solving active menu problem
	switch (menu) {

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
		if (menu == "Home")
			break;
		$('#listProducts').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}

	// jquery data table

	var $table = $('#productListTable');
	// execute below code only where we have table

	if ($table.length) {
		// console.log('Inside the table');

		var jsonUrl = '';
		if (window.categoryId=='') {
			jsonUrl = window.contextRoot+'/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId+'/products';

		}

		$table.DataTable({
			lengthmenu : [ [ 3, 5, 10, -1 ],
					[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			columns : [

			{

				'data' : 'name'

			},

			{

				'data' : 'brand'

			}, 
			
			{

				'data' : 'unitPrice'

			},

			{

				'data' : 'quantity'

			}

			]

		})
	}

})

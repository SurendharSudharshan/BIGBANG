$(function() {
	// solving active menu problem
	switch (menu) {

	case 'About Us':
		$('.nav-item').addClass('active');
		break;

	case 'Contact Us':
		$('.nav-item').addClass('active');
		break;

	case 'All Products':

		$('.nav-item').addClass('active');
		break;
		
	case 'Product Manager':

		$('.nav-item').addClass('active');
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
		if (window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';

		}

		$table
				.DataTable({
					lengthmenu : [ [ 3, 5, 10, -1 ],
							[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
					pageLength : 5,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [

							{
								data : 'code',
								mRender : function(data, type, row) {
									return '<img src="' + window.contextRoot
											+ '/resources/images/' + data
											+ '.jpg" style="width:200px;"/>';
								}

							},

							{

								data : 'name'

							},

							{

								data : 'brand'

							},

							{

								data : 'unitPrice',
								mRender : function(data, type, row) {
									return '&#8377; ' + data;
								}

							},

							{

								data : 'quantity',
								mRender : function(data, type, row) {
									if (data < 1) {
										return '<span style="color:red">Out of Stock!</span>';
									}

									return data;
								}

							},

							{

								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {
									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/show/'
											+ data
											+ '/product" class="btn btn-primary"><i class="fas fa-eye"></i></a> &#160;';

									if (row.quantity < 1) {
										str += ' <a href="javascript:void(0)" class="btn btn-success disabled"><i class="fas fa-cart-plus"></i></a>';

									} else {
										str += '<a href="'
												+ window.contextRoot
												+ '/cart/add/'
												+ data
												+ '/product" class="btn btn-success"><i class="fas fa-cart-plus"></i></a>';
									}
									return str;
								}

							}

					]

				})
	}
	
	//dismissing the alert
	var $alert=$('.alert');
	if($alert.length)
		{
	setTimeout(function(){
		
		$alert.fadeOut('slow');
	} ,3000)
		}
	
	//.......
	
var $productsTable = $('#productsTable');
	
	
	if($productsTable.length) {
		
		var jsonUrl = window.contextRoot + '/json/data/admin/all/products';
		console.log(jsonUrl);
		
		$productsTable.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ], [ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 30,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [		
					           	{data: 'id'},


					           	{data: 'code',
					           	 bSortable: false,
					           		mRender: function(data,type,row) {
					           			return '<img src="' + window.contextRoot
										+ '/resources/images/' + data
										+ '.jpg" class="dataTableImg"/>';					           			
					           		}
					           	},
					           	{
									data : 'name'
								},
								{
									data : 'brand'
								},
								{
									data : 'quantity',
									mRender : function(data, type, row) {

										if (data < 1) {
											return '<span style="color:red">Out of Stock!</span>';
										}

										return data;

									}
								},
								{
									data : 'unitPrice',
									mRender : function(data, type, row) {
										return '&#8377; ' + data
									}
								},
								{
									data : 'active',
									bSortable : false,
									mRender : function(data, type, row) {
										var str = '';
										if(data) {											
											str += '<label class="switch"> <input type="checkbox" value="'+row.id+'" checked="checked">  <div class="slider round"> </div></label>';
											
										}else {
											str += '<label class="switch"> <input type="checkbox" value="'+row.id+'">  <div class="slider round"> </div></label>';
										}
										
										return str;
									}
								},
								{
									data : 'id',
									bSortable : false,
									mRender : function(data, type, row) {

										var str = '';
										str += '<a href="'
												+ window.contextRoot
												+ '/manage/'
												+ data
												+ '/product" class="btn btn-success"><i class="fa fa-edit" style="font-size:24px;color:black"></i></a> &#160;';

										return str;
									}
								}					           	
					],
					
					
					initComplete: function () {
						var api = this.api();
						api.$('.switch input[type="checkbox"]').on('change' , function() {							
							var dText = (this.checked)? 'You want to activate the Product?': 'You want to de-activate the Product?';
							var checked = this.checked;
							var checkbox = $(this);
						
						    bootbox.confirm({
						    	size: 'medium',
						    	title: 'Product Activation/Deactivation',
						    	message: dText,
						    	callback: function (confirmed) {
							        if (confirmed) {
							            $.ajax({							            	
							            	type: 'GET',
							            	url: window.contextRoot + '/manage/product/'+checkbox.prop('value')+'/activation',
							        		timeout : 100000,
							        		success : function(data) {
							        			bootbox.alert(data);							        										        			
							        		},
							        		error : function(e) {
							        			bootbox.alert('ERROR: '+ e);
							        			//display(e);
							        		}						            	
							            });
							        }
							        else {							        	
							        	checkbox.prop('checked', !checked);
							        }
						    	}
						    
						    
						    });																											
						});
							
					}
				});
	}	
	// validating the product form element	
	// fetch the form element
	function errorPlacement(error, element) {
		// Add the 'help-block' class to the error element
		error.addClass("help-block");
		
		// add the error label after the input element
		error.insertAfter(element);
		
		
		// add the has-feedback class to the
		// parent div.validate in order to add icons to inputs
		element.parents(".validate").addClass("has-feedback");	

	}	
	
	
	
	// validating the product form element	
	// fetch the form element
	var $categoryForm = $('#categoryForm');
	
	if($categoryForm.length) {
		
		$categoryForm.validate({			
				rules: {
					name: {
						required: true,
						minlength: 3
					},
					description: {
						required: true
											
					}				
				},
				messages: {					
					name: {
						required: 'Please enter category name!',
						minlength: 'Please enter atleast three characters'
					},
					description: {
						required: 'Please enter Description!'
					
					}					
				},
				errorElement : "em",
				errorPlacement : function(error, element) {
					errorPlacement(error, element);
				}				
			}
		
		);
		
	}
	
	/*validating the loginform*/
	
	// validating the product form element	
	// fetch the form element
	$loginForm = $('#loginForm');
	
	if($loginForm.length) {
		
		$loginForm.validate({			
				rules: {
					username: {
						required: true,
						email: true
						
					},
					password: {
						required: true
					}				
				},
				messages: {					
					username: {
						required: 'Please enter your email!',
						email: 'Please enter a valid email address!'
					},
					password: {
						required: 'Please enter your password!'
					}					
				},
				errorElement : "em",
				errorPlacement : function(error, element) {
					// Add the 'help-block' class to the error element
					error.addClass("help-block");
					
					// add the error label after the input element
					error.insertAfter(element);
				}				
			}
		
		);
		
	}
})

/*
 * columns: [ { data: 'code', mRender: function(data, type, row){ return '<img
 * src="'+window.contextRoot+'/resources/images/'+data+'.jpg"class
 * ="dataTableImg"/>'; } }, { data: 'name'
 *  }, { data: 'brand'
 *  }, { data: 'unitPrice', mRender:function(data, type, row){ return '&#8377;'
 * +data }
 *  }, { data: 'quantity', mRender:function(data,type,row){
 * 
 * 
 * id(data < 1) { return '<span style ="color:red"> Out Of Stock</span>'; }
 * 
 * return data; }
 *  }, { data: 'id', bSortable: false, mRender: function(data, type, row){ var
 * str = ''; str += '<a href ="'+window.contextRoot+ '/show/'
 * +data+'/product"class ="btn btn-primary"><span class ="glyphicon
 * glyphicon-eye-open"></span></a> &#160;';
 * 
 * if(row.quantity < 1) { str += '<a href = "javascript:void(0)" class ="btn
 * btn-success disabled"><span class ="glyphicon glyphicon-shopping-cart "></span></a>'; }
 * else { str += '<a href ="'+window.contextRoot+ '/cart/add/'
 * +data+'/product"class ="btn btn-success"><span class ="glyphicon
 * glyphicon-shopping-cart"></span></a>'; }
 * 
 * return str; } } ]
 *  }) }
 */


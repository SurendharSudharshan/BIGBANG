<div class="container">


	<div class="row">

		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>


		</div>
		<!--Display breadcrumb -->
		<div class="col-md-9">


			<div class="row">
			
			
			
			</div>

				<div class="col-lg-12">
					<c:if test="${UserClickAllProducts==true}">
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/homepage">Home</a></li>

							<li class=" breadcrumb-item active">All Products</li>






						</ol>
					</c:if>
					
					<c:if test="${UserClickCategoryProducts==true}">
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/homepage">Home</a></li>

							<li class="breadcrumb-item">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>






						</ol>
					</c:if>
					




				</div>




			</div>
		</div>



	
	         <div class="row">
	              <div class="col-xs-12">
	              
	              <table id="productListTable" class="table table-striped table-borderd">
	              
	              
	                 <thead>
	                 
	                 <tr>
	                   <th>ID</th>
	                   <th>Name</th>
	                 
	                 
	                 </tr>
	                 
	                 
	                 
	                 </thead>
	              
	              </table>
	              
	              
	              
	              </div>
	              
	         
	         
	         </div>
	
	
	
	</div>




</div>




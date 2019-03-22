<div class="container">


	<div class="row">

		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>


		</div>
		<!--Display breadcrumb -->
		<div class="col-md-9">


			<div class="row">

				<div class="col-lg-12">
					<c:if test="${UserClickAllProducts==true}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a
								href="${contextRoot}/homepage">Home</a></li>

							<li class=" breadcrumb-item active">All Products</li>






						</ol>
					</c:if>

					<c:if test="${UserClickCategoryProducts==true}">
					<script>
					   window.categoryId = '${category.id}';
					</script>
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a
								href="${contextRoot}/homepage">Home</a></li>

							<li class="breadcrumb-item">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>






						</ol>
					</c:if>





				</div>




			</div>






			<div class="row">
				<div class="col-lg-12 col-xs-12">

					<table id="productListTable"
						class="table table-bordered">


						<thead class="thead-dark">

							<tr>
							  <th scope="col"></th>
								<th scope="col">Name</th>
								<th scope="col">Brand</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col"></th>



							</tr>



						</thead>
						
					</table>



				</div>
			</div>



		</div>



	</div>
</div>











<!--  
     <nav class="navbar navbar-inverse" role="navigation">
      <div class="container">
      <div class="navbar-header">
       <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
       
        <a class="navbar-brand" href="${contextRoot}/homepage"> Online Shopping</a>
      </div>
       <!--   <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>-->
     <!--    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav mr-auto">
           <!--   <li class="nav-item active">
              <a class="nav-link" href="${pageContext.request.contextPath}/addprodpage">Add Products
                
              </a>
            </li> -->
      <!--       <li id="about">
              <a class="nav-link" href="${contextRoot}/about">About</a>
            </li>
            <li id="listproducts">
              <a class="nav-link" href="${contextRoot}/ListProducts">View Products</a>
            </li>
            <li id="contact">
              <a class="nav-link" href="${contextRoot}/contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav> -->
    
 <nav class="navbar navbar-expand-lg navbar-light navbar fixed-top justify-content-between" id="nav" style="background-color:#25335e;">
  <a class="navbar-brand" href="${contextRoot}/homepage"><h4><b>Online Shopping</b></h4></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse">
    <ul class="navbar-nav">
      <li id="about" class="nav-item">
        <a class="nav-link" href="${contextRoot}/about"> <h5 class="text-white">About Us</h5></a>
      </li>
      
      <li id="contact" class="nav-item">
        <a class="nav-link " href="${contextRoot}/contact"> <h5 class="text-white">Contact Us</h5></a>
      </li>
      
      <li id="listProducts" class="nav-item">
        <a class="nav-link " href="${contextRoot}/show/all/products"> <h5 class="text-white">View Products</h5></a>
      </li>
      
        <li id="manageProducts" class="nav-item">
        <a class="nav-link" href="${contextRoot}/manage/products"> <h5 class="text-white">Manage Products</h5></a>
      </li>
    <!--   <li class="nav-item">
        <a class="nav-link disabled" href="#"> <h5 class="text-white">Home</h5></a>
      </li>-->
    </ul>
  </div>
 
</nav>
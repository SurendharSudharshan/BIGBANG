<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>


<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>
<link href="${css}/myapp.css" rel="stylesheet">


<!-- Bootstrap core CSS -->
<!--   <link href="${css}/bootstrap.min.css" rel="stylesheet">-->

<!-- Custom styles for this template -->
<%-- <link href="${css}/jquery.dataTables.css" rel="stylesheet"> --%>
<%-- <link href="${css}/dataTables.bootstrap4.css" rel="stylesheet"> --%>

<%-- <link href="${css}/darklight.css" rel="stylesheet"> --%>



<%-- <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!--  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script> -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
 <link rel="stylesheet" href="${css}/buttons.dataTables.css">
 --%>
 
 <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' >
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
 
 </head>

<body class="c-container / t--light">
	<div class="wrapper">
		<!-- navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<div class="content">
			<!-- Page Content -->
			<!-- loading the home content -->
			<c:if test="${UserClickHome == true }">
				<%@include file="homepage.jsp"%>
			</c:if>
			<!-- load only when user clicks about -->
			<c:if test="${UserClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>
			<!-- loads only when user clicks contact -->
			<c:if test="${UserClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>

			<c:if
				test="${UserClickAllProducts == true or UserClickCategoryProducts==true }">
				<%@include file="listProducts.jsp"%>
			</c:if>
			
			<c:if
				test="${userClickShowProduct == true }">
				<%@include file="singleProduct.jsp"%>
			</c:if>
			
			<c:if
				test="${userClickManageProducts == true }">
				<%@include file="manageProducts.jsp"%>
			</c:if>
			
		</div>
		<!-- Footer comes here-->

		<%@include file="./shared/footer.jsp"%>
		<!-- Bootstrap core JavaScript -->
		<%-- <%-- <%-- <script src="${js}/jquery.js"></script>
		<!-- <script src="${js}/bootstrap.min.js"></script>
    <!-- Self coded Js -->
		
		<!--   <script src="${js}/dataTables.buttons.js"></script>-->--> --%>
		
		
		
		<%--  <script src="${js}/dataTables.bootstrap4.js"></script>  
		<script src="${js}/jquery.dataTables.js"></script> --%> 
		<%-- <script src="${js}/theme.js"></script> --%>
		
		<script src="//cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script
	src="//https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
	
	<script src="${js}/bootbox.min.js"></script>
		
     
     
      <script src="${js}/jquery.validate.js"></script>
      <script src="${js}/myapp.js"></script>
      
	</div>

</body>

</html>

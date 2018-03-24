<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Shopping cart</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>

<%@include file="header/header_page_links.jsp"%>
  </head>
<body>
<div id="header">
<div class="container">
		<%@include file="header/header_welcome.jsp"%>
		<%@include file="header/header_navbar.jsp"%>
</div>
</div>
<!-- Header End====================================================================== -->
<div id="mainBody">
	<div class="container">
	<div class="row">
<!-- Sidebar ================================================== -->
	<%@include file="header/right_menu.jsp"%>
<!-- Sidebar end=============================================== -->
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active"> SHOPPING CART</li>
    </ul>
	<h3>  SHOPPING CART <span id="count-cart-shoping"> <button type="button" class="btn btn-success">Success <span class="badge">3</span></button></span><a href="" id="clear-cart"class="btn btn-large pull-right"><i class=""></i> Clear Cart </a></h3>	
	<hr class="soft"/>

				<table class="table table-bordered">
              <thead>
                <tr>
                  <th>Product Image</th>
                  <th>Quantity/Update</th>
              
				  <th>Price</th>
                  
                  
				</tr>
              </thead>
        			</table>
					<div class="list-group" style="list-style-type:none" id="show-cart">
						<ul id="show-cart">
						</ul>
					</div>
					<div></div>
					<a href="<c:url value="/index"/>" class="btn btn-large"><i class="icon-arrow-right"></i> Continue Shipping </a>
					<a href="" class="btn btn-large pull-right">Total Cart $:<span id="total-cart"></span > </a>
	
</div>
</div></div>
</div>
<!-- MainBody End ============================= -->
<script src="<c:url value="/resources/js/cartfunction.js" />"></script>
	<%@include file="header/footer.jsp"%>

</body>
</html>
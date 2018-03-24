<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
   
    <title>Products</title>
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
	
	<div class="row">	  
		<div class="span9">
    <ul class="breadcrumb">
		<li><a href="<c:url value=""/>">Home</a> <span class="divider">/</span></li>
		<li class="active"><a href="<c:url value='/products/${getengineDetailes.se_id}'/> ">Products Name</a></li>
		<li class="active"><a href="<c:url value=""/> "></a></li>
    </ul>
	
	<form class="form-horizontal span6">
		<div class="control-group">
		  <label class="control-label alignL">Sort By </label>
			<select>
              <option>Priduct name A - Z</option>
              <option>Priduct name Z - A</option>
              <option>Priduct Stoke</option>
              <option>Price Lowest first</option>
            </select>
		</div>
	  </form>

<br class="clr"/>
<div class="tab-content">
	<div class="tab-pane  active" id="listView">
		<div class="row">
			
		  <c:forEach var="getmanuals" items="${getManuals}" varStatus="status">
			<div class="span2">
				<a href="<c:url value='/product_details/${getmanuals.m_id}'/>"><img src=" <c:url value="${getmanuals.m_photo_path}" /> " alt=" "/></a>
			</div>
			<div class="span4">
				
				<h5>${getmanuals.m_name} </h5>
				<p>
				Nowadays the lingerie industry is one of the most successful business spheres.We always stay in touch with the latest fashion tendencies - 
				that is why our goods are so popular..
				</p>
				<a class="btn btn-small pull-right" href="<c:url value='/product_details/${getmanuals.m_id}'/> ">View Details</a>
				<br class="clr"/>
			</div>
			<div class="span3 alignR">
			<form class="form-horizontal qtyFrm">
			<h3> $${getmanuals.price}</h3>
			<label class="checkbox">
				<input type="checkbox">  Adds product to compair
			</label><br/>
			
			  <a href="#" class="btn btn-large btn-primary add-to-cart"  data-name="${getmanuals.m_name}" data-photo="<img src='<c:url value="${getmanuals.m_photo_path}" /> '/>" data-price="${getmanuals.price}"  > Add to <i class=" icon-shopping-cart"></i></a>
			 
			  
			
				</form>
			</div>
			
			</c:forEach>
		</div>
		
	</div>

</div>

	<a href="compair.html" class="btn btn-large pull-right">Compair Product</a>
	
			<br class="clr"/>
</div>
			
	</div>
</div>
</div>
</div>

 
<script type="text/javascript" src="<c:url value="/resources/js/cartfunction.js"/>"> </script>
	<%@include file="header/footer.jsp"%>
	
</body>
</html>
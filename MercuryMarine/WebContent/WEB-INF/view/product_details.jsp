<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
   
    <title>Products Detailes</title>
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
				<div id="gallery" class="span3">
					<ul class="breadcrumb">
						<li><a href="http://localhost:8281/MercuryMarine/">Home</a> <span
							class="divider">/</span></li>
						<c:forEach var="getname" items="${bean}" varStatus="status1">
							<li class="active">${getManualDeatiles.m_name}</li>
						</c:forEach>
					</ul>
				<c:forEach var="getManualDeatiles" items="${getManualDeatiles}" varStatus="status">
            <a href="<c:url value="${getManualDeatiles.m_photo_path}" />" title="${getManualDeatiles.m_name}">
				<img src="<c:url value="${getManualDeatiles.m_photo_path}" />" style="width:100%" alt=" Camera"/>
            </a>
			<div id="differentview" class="moreOptopm carousel slide">
               
             
              </div>
			
			</div>
			<div class="span6">
				<h3>${getManualDeatiles.m_name}  </h3>
				
				<hr class="soft"/>
				<form class="form-horizontal qtyFrm">
				  <div class="control-group">
					<label class="control-label"><span>$${getManualDeatiles.price}.00</span></label>
					<div class="controls">
					<input type="number" name="qty" class="span1" placeholder="Qty."/>
					<button id="clear-cart" >clear cart</button>
					  <button type="submit" class="btn btn-large btn-primary pull-right add-to-cart" data-name="${getManualDeatiles.m_name}" data-photo="<img src='<c:url value="${getManualDeatiles.m_photo_path}" /> '/>" data-price="${getManualDeatiles.price} "> Add to cart <i class=" icon-shopping-cart"></i></button>
					</div>
				  </div>
				</form>
				</c:forEach>
				
				<hr class="soft clr"/>
				<p>
					
Displays the exploded view of the engine with corresponding Mercury part numbers. This manual shows the engine parts breakdown to assist with part(s) ordering and identification. You can order part(s) through any authorized Mercury dealer.
				
				</p>
				
			<hr class="soft"/>
			</div>



			</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
 
<script type="text/javascript" src="<c:url value="/resources/js/cartfunction.js"/>"> </script>
	<%@include file="header/footer.jsp"%>
</body>
</html>
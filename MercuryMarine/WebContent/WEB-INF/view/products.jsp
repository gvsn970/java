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
					<div class="span3">
						<ul class="breadcrumb">
							<li><a href="http://localhost:8281/MercuryMarine/">Home</a> <span class="divider">/</span></li>
							<c:forEach var="getname" items="${bean}" varStatus="status1">
							<li class="active">${getname.e_name}</li>
							</c:forEach>
						</ul>
								<ul style="list-style: none;">
					

									<c:forEach var="getengineDetailes" items="${getengineDatiales}"
										varStatus="status">

										<li><a
											href="<c:url value='/manuals/${getengineDetailes.se_id}'/> "><i
												class="icon-chevron-right"></i> ${getengineDetailes.se_name}</a>
										</li>
									</c:forEach>

								</ul>
				</div>
					<div class="span4">
					<c:forEach var="getname" items="${bean}" varStatus="status1">
						<h4>${getname.e_name} </h4>
						<img src="<c:url value="${getname.photo_path}" />" alt="">
						</c:forEach>
					</div>

				</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
 
<script type="text/javascript" src="<c:url value="/resources/js/cartfunction.js"/>"> </script>
	<%@include file="header/footer.jsp"%>
</body>
</html>
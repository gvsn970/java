<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>MercuryMarine</title>
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

	<%@include file="header/carousel.jsp"%>

	<div id="mainBody">
		<div class="container">
			<div class="row">
				<!-- Sidebar ================================================== -->
				<%@include file="header/right_menu.jsp"%>
				<!-- Sidebar end=============================================== -->
				<div class="span9">
					<div class="well well-small">
						<h4>
							Featured Products <small class="pull-right">200+ featured
								products</small>
						</h4>
						<div class="row-fluid">
							<div id="featured" class="carousel slide">
								<div class="carousel-inner">
									<div class="item active">
										<ul class="thumbnails">
										<c:forEach var="getengine" items="${list}" varStatus="status">
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="products/${getengine.e_id}">
													<img
														src="<c:url value="${getengine.photo_path}" />" alt=""/></a>
													<div class="caption">
														<h5>${getengine.e_name}</h5>
														<h4>
															<a class="btn" href="products/${getengine.e_id}">VIEW</a>

														</h4>
													</div>
												</div>
											</li>
										</c:forEach>
										</ul>
									</div>
								</div>
								<!-- <a class="left carousel-control" href="#featured"
									data-slide="prev">&lsaquo;</a> <a
									class="right carousel-control" href="#featured"
									data-slide="next">&#x203a;</a> -->
							</div>
						</div>
					</div>
				
					<ul class="thumbnails">

					
					
					<!-- 	<li class="span3">
							<div class="thumbnail">
								<a href=""><img src="resources/images/products/1.jpg" alt="" /></a>
								<div class="caption">
									<h5>Product name</h5>
									<p>Lorem Ipsum is simply dummy text.</p>
									<h4 style="text-align: center">

										<a class="btn add-to-cart" data-name="product3"
											data-price="300.00" href="#">Add to <i
											class="icon-shopping-cart"></i>
										</a> <a class="btn btn-primary" href="#">$300.00</a>
									</h4>
								</div>
							</div>
						</li> -->
					</ul>

				</div>
			</div>
		</div>
	</div>
	<!-- <h1>Shoping Cart</h1>
	<div>
		<ul style="list-style-type: disc">
			<li><a class="add-to-cart" href="#" data-name="Apple"
				data-price="2.5">Apple $2.5</a></li>
			<li><a class="add-to-cart" href="#" data-name="Banana"
				data-price="3.5">Banana $3.5</a></li>
			<li><a class="add-to-cart" href="#" data-name="car"
				data-price="4.5">Car $4.5</a></li>
			<li><a class="add-to-cart" href="#" data-name="FineApple"
				data-price="5.5">FineApple $5.5</a></li>


		</ul>
		<button id="clear-cart">ClearCart</button>
	</div>
	<div>
		<ul id="show-cart">
		</ul>
	</div>
	<div>
		Total Cart $:<span id="total-cart"></span>
	</div> -->
	<script src="<c:url value="/resources/js/cartfunction.js" />"></script>

	<%@include file="header/footer.jsp"%>
</body>
</html>
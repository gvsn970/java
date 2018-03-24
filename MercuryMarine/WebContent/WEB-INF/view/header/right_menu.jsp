
<div id="sidebar" class="span3">
	<div class="well well-small">
		<a id="myCart" href="<c:url value="/product_summary/" />"><img
			src="<c:url value="/resources/images/ico-cart.png"/>" alt="cart"><span
			id="count-cart-menu"></span> Items in your cart <span
			class="badge badge-warning pull-right" id="total-cart-menu"></span></a>
	</div>
	<ul id="sideManu" class="nav nav-tabs nav-stacked">
		<c:forEach var="getengine" items="${list}" varStatus="status">
			<li class="subMenu"><a href="${getengine.e_id}">${getengine.e_name}</a>
				<ul style="display: none">

					<c:forEach var="getsubengine" items="${list1}" varStatus="status">
						<c:if test="${getengine.e_id eq getsubengine.e_id}">
							<li><a href="<c:url value='/manuals/${getsubengine.se_id}'/> "><i class="icon-chevron-right"></i>
								${getsubengine.se_name}</a>
							 </li>
						</c:if>
					</c:forEach>
				</ul></li>
		</c:forEach>
	</ul>

</div>

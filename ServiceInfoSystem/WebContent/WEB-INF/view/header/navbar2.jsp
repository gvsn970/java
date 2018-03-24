<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="<c:url value="/index"/>">ServiesInformationSystem</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="<c:url value="/index"/>">Home</a></li>
				<li><a href="#">Page 1</a></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<%
					String session_username = (String) session.getAttribute("session_username");
				%>
			 <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome&nbsp;&nbsp;<%=session_username %></a></li>
      <li><a href="<c:url value='logout'/>"><span class="glyphicon glyphicon-off"></span> LogOut</a></li>
    </ul>
		</div>
	</nav>

<%@page import="java.sql.*"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%@ include file="resource/resource.jsp"%>
</head>
<body>
	<%@ include file="header/navbar2.jsp"%>
	<%
				response.setHeader("Cache-Control", "no-cache"); //Forces caches to obtain a new copy of the page from the origin server
				response.setHeader("Cache-Control", "no-store"); //Directs caches not to store the page under any circumstance
				response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
				response.setHeader("Pragma", "no-cache");
			%>

			<%
				if (session.getAttribute("session_username") == null) {
					response.sendRedirect("index");
				}
			%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4"></div>

			<div class="col-sm-4">
				<div class="form-group">
					<form action="" method="post">
					<label for="ex2">SELECT ENGINE</label> <select name='country'
						class="form-control" onchange="showState(this.value)">
						<option value="none">Select</option>
				
					</select>
				</div>
				<div class="form-group" id='state'>
					<label for="ex2">SELECT SUBENGINE</label> <select
						class="form-control" name='state'>
						<option value='-1'>Select</option>
					</select>
				</div>
				<div class="form-group" id='city'>
					<label for="ex2">SELECT SERIES</label> <select class="form-control"
						name='city'>
						<option value='-1'>Select</option>
					</select>
				</div>
				<button type="submit" class="btn btn-primary">submit</button>
				</form>
			</div>



		</div>

		<div class="col-sm-4"></div>
	</div>

	<%@ include file="resource/footerresource.jsp"%>
</body>
</html>
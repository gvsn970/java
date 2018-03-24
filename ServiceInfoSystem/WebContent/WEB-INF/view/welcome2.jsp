
<%@page import="java.sql.*"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%@ include file="resource/resource.jsp"%>
</head>
<body>
	<%@ include file="header/navbar.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4"></div>

			<div class="col-sm-4">
				<div class="form-group">
					<form action="" method="post">
					<label for="ex2">SELECT ENGINE</label> <select name='country'
						class="form-control" onchange="showState(this.value)">
						<option value="none">Select</option>
						<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");  
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from engine");
 while(rs.next()){
     %>
						<option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
						<%
 }
     %>
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
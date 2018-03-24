<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function validate() {
		if (document.form.dname.value == "") {
			document.getElementById("dname").innerHTML = "plz enter user name ";
			return false;
		}
		if (document.form.pwd.value == "") {
			document.getElementById("pwd").innerHTML = "plz enter password";
			return false;
		}
		return true;
	}
</script>
<%@include file="resource/resource.jsp"%>
</head>
<body>
<%@ include file="header/navbar.jsp"%>


<div class="container">
  
  <div class="row">
    <div class="col-sm-4" >
     
    </div>
    <div class="col-sm-4" >
      <h2>Welcome To Login</h2>
				<form action="<c:url value="/login"/>" method="post" name="form"	onsubmit="return validate()">
					<div class="form-group">
						<label for="user">UserName:</label> <input type="text"
							class="form-control" id="danme" name="dname">
							<p style="color: red" name="dname" id="dname"></p>
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control"  name="pwd" >
							<span
					style="color: red" name="pwd" id="pwd"></span>
					</div>
					<div class="checkbox"></div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<p style="font-size:17px">${msg}</p>
	</div>
    <div class="col-sm-4" >
    
    </div>
  </div>
</div>



<%@include file="resource/footerresource.jsp"%>
</body>
</html>
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
		if (document.form.d_name.value == "") {
			document.getElementById('edrname').innerHTML = "plz enter user name ";
			return false;
		}
		
		if (document.form.d_email.value == "") {
			document.getElementById("eremail").innerHTML = "plz enter emailID ";
			return false;
		}
		if (document.form.d_password.value == "") {
			document.getElementById("erpwd").innerHTML = "plz enter password";
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
      <h2>Welcome To Registration</h2>
				<form action="save" method="post" name="form" modelAttribute="ServiceInfoSystemBean"	onsubmit="return validate()">
					<div class="form-group">
						
						<label for="user">UserName:</label> <input type="text"
							class="form-control" id="d_name" name="d_name">
							<p style="color: red" name="edrname" id="edrname"></p>
					</div>
					<div class="form-group">
						<label for="email">Email address:</label> <input type="text" name="d_email"
							class="form-control" id="remail" >
								<span style='color: red' name="eremail" id="eremail"></span>
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control"  name="d_password" >
							<span
					style="color: red" name="erpwd" id="erpwd"></span>
					</div>
					
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
	</div>
    <div class="col-sm-4" >
    
    </div>
  </div>
</div>



<%@include file="resource/footerresource.jsp"%>
</body>
</html>
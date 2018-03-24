<%@page import="java.sql.*"%>
<%
String state=request.getParameter("count");  
 String buffer="<label for='ex2'>SELECT SERIES</label><select name='city'class='form-control' ><option value='-1'>Select</option>";  
 try{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "hr");  
 Statement stmt = con.createStatement();  
 //ResultSet rs = stmt.executeQuery("Select * from city where stateid='"+state+"' ");  
 ResultSet rs = stmt.executeQuery("select * from SUB_ENGINE se,SERIES s where se.SE_ID = s.SE_ID and se.se_id='"+state+"' ");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"'>"+rs.getString(5)+"</option>";  
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>
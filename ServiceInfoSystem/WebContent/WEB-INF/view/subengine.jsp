<%@page import="java.sql.*"%>
<%
String country=request.getParameter("count");  
 String buffer="<label for='ex2'>SELECT SUBENGINE</label><select name='state' class='form-control' onchange='showCity(this.value);'><option value='-1'>Select</option>";  
 try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "hr"); 
 Statement stmt = con.createStatement();  
// ResultSet rs = stmt.executeQuery("Select * from state where countryid='"+country+"' ");  
 //ResultSet rs = stmt.executeQuery("select * from state s, country c where s.countryid=c.countryid and c.countryid='"+country+"' ");  
 ResultSet rs = stmt.executeQuery("select * from  SUB_ENGINE se,engine e where se.E_ID = e.E_ID and e.E_ID='"+country+"' ");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"'>"+rs.getString(2)+"</option>";  
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
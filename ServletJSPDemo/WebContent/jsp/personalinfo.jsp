<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String errorMessage=(String) request.getAttribute("errormsg");

if(errorMessage!=null && errorMessage.trim().length()!=0)
{
%>
<font color="red"> <%=errorMessage %> </font>
<% } %>

 <form action="/ServletJSPDemo/PersonalinfoServlet" method="get">


First Name:       <input type="text" name="tbfname"> <br>
Last Name:         <input type="text" name="tblname"> <br>
Middle Name:        <input type="text" name="tbmname"> <br>
Gender:             <input type="radio" name="rbgender" value="Male" >Male   <input type="radio" name="rbgender" value="Female"> Female  <br>
 <input type="submit" value="Submit">   

</form>

</body>
</html>
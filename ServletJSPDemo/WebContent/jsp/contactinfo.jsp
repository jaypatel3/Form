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

String errorMessage=(String) request.getAttribute("errormsg1");

if(errorMessage!=null && errorMessage.trim().length()!=0)
{
%>
<font color="red"> <%=errorMessage %> </font>
<% } %>

<form action="/ServletJSPDemo/ContactinfoServlet" method="get">
Address: <input type="text" name="tbaddress"> <br>
City :  <input type="text" name="tbcity"> <br>
State: <input type="text" name="tbstate"> <br>
Country: <input type="text" name="tbcountry"> <br>
Phone : <input type="text" name="tbphone"> <br>
<input type="submit" value="Submit"> 

</form>

</body>
</html>
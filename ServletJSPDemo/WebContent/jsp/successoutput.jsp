<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="personalinfovo" class="com.ees.vo.PersonalinfoVO" scope="session"></jsp:useBean>
<jsp:useBean id="contactinfovo" class="com.ees.vo.ContactinfoVO" scope="session"></jsp:useBean>
<jsp:useBean id="bankinfovo" class="com.ees.vo.BankinfoVO" scope="session"></jsp:useBean>
<jsp:useBean id="gv1" class="com.ees.vo.GeneralVO" scope="session"></jsp:useBean>
Your ID is:
 <br>


First Name: 
<jsp:getProperty property="firstName" name="gv1"/> <br>
Last Name: 
<jsp:getProperty property="lastName" name="gv1"/> <br>
Middle Name:
<jsp:getProperty property="middleName" name="gv1"/> <br>
Gender:
<jsp:getProperty property="gender" name="gv1"/> <br>


Address:
<jsp:getProperty property="address" name="gv1"/> <br>
City:
<jsp:getProperty property="city" name="gv1"/> <br>
State:
<jsp:getProperty property="state" name="gv1"/> <br>
Country:
<jsp:getProperty property="country" name="gv1"/> <br>
Phone:
<jsp:getProperty property="phone" name="gv1"/> <br>

Bank Name:
<jsp:getProperty property="bankName" name="gv1"/> <br>
Account No:
<jsp:getProperty property="accountNo" name="gv1"/> <br>
SSN :
<jsp:getProperty property="ssn" name="gv1"/> <br>




</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="PrimeSer" method="post">
<input type="text" name="txtnum" placeholder="enter number" />
<br>
<br>
<input type="submit" name="txtsubmit" value="Check Prime or Not" />
</form>
<%
if(request.getParameter("q")!=null)
{
	out.print(request.getParameter("q"));	
}
%>
</center>
</body>
</html>
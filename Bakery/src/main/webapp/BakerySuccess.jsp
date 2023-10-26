<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bakery Application</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">BAKERY</span>
    <a class="navbar-brand" href="NammaBakery.jsp">Back</a>
  </div>   
</nav>
<h1>Total Information</h1>
<h3>Total Price <span style="color: red;">${item}</span> after discount <span style="color: red;">${offer}</span></h3>
<br>
<span style="color:green;"><h3>Current time and date = <%= new Date()%></h3></span>

</body>
</html>
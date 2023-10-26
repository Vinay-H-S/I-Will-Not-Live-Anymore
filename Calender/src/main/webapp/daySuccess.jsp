<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="container-fluid" >
    <a class="navbar-brand"  style="color: white; font-size: 30px; " href="#">CALENDER</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
      <div class="d-flex" style="font-size: 20px;text-transform: uppercase; padding-right: 25px;">
      <form >
        <a href="index.jsp">home</a>
        <a href="day.jsp">day</a>
      </form>
    </div>
  </div>
</nav>
</div>

<h1>Digital Calender Data is Saved Successfully</h1>
DATE : ${date}
<br>
DAY : ${day}
<br>
MONTH : ${month}
<br>
YEAR : ${year}
</body>
</html>
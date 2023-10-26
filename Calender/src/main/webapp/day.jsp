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
    
      <form class="d-flex" style="font-size: 20px; text-transform: uppercase;">
        <a href="index.jsp">HOME</a>
      </form>
    </div>
  </div>
</nav>
</div>

<br><br><br>
<div class="form-control" style="width: 600px; height: 450px;  margin-left: 35rem;">
	<form action="gun" method="post">
	<h1 class="header" style="font-size:35px; margin-left:130px; text-transform: uppercase;">Digital Calender</h1>
	<div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">DATE</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="date">
    </div>
  </div>
  
  <div>
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">DAY</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="day">
    </div>
  </div>
  
	<div>
	<div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">MONTH</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="month">
    </div>
    
    <br><br>
    <div>
    <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">YEAR</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="year">
    </div>
    </div>
	</div>
	
  </div>
  <input type="submit" class="btn btn-primary" value="Save">
  </form>
</body>
</html>
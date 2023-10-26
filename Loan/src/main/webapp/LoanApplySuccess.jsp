<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Default Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>

<div class="logo">
		<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <div class="container-fluid" >
    <a class="navbar-brand"  style="color: white; font-size: 30px; " href="#">LOAN</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="d-flex" style="font-size: 20px;text-transform: uppercase; padding-right: 25px;">
      <form >
        <a href="Index.jsp">home</a>
        <a href="LoanApply.jsp">back</a>
      </form>
    </div>
    
    </div>
  </div>
</nav>
	</div>
	<h1>Loan apply information is saved successfully</h1>
	<h3>Name : ${name}</h3>
	<h3>Amount : ${amount}</h3>
	<h3>Working : ${working}</h3>
	<h3>Interest : ${interest}</h3>
	<h3>Surety : ${surety}</h3>
	<h3>Company : ${company}</h3>
	<h3>Loan Tenure : ${loanTenure }</h3>
	<h3>Loan Type : ${loanType }</h3>
	
</body>
</html>
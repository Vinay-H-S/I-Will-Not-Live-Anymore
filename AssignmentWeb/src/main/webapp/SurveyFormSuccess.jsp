<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Survey Form Success</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<nav class="navbar bg-primary" data-bs-theme="dark">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1">Customer Survey Form</span>
			</div>
		</nav>
	</div>

	<div>
		<h1>Customer Survey Information</h1>
		<h3>First Name : ${ customer.firstName}</h3>
		<h3>Last Name : ${ customer.lastName}</h3>
		<h3>Date Of Birth : ${ customer.dob}</h3>
		<h3>Country : ${ customer.country}</h3>
		<h3>Gender : ${ customer.gender}</h3>
		<h3>Profession : ${customer.profession }</h3>
		<h3>Email : ${ customer.email}</h3>
		<h3>Mobile Number : ${ customer.mobileNumber}</h3>
	</div>

</body>
</html>
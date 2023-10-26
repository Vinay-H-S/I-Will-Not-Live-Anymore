<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>

	<div class="navbar" style="text-transform: uppercase; display: block;">
		<nav class="navbar bg-primary" data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand">welcome ${user.userId}</a> <a
					href="LoginSuccess.jsp"
					style="color: white; font-size: 17px; text-decoration: none;">home</a>
			</div>
		</nav>
	</div>

	<br>
	<br>
	<br>
	<br>
	<div class="form-control"
		style="width: 600px; height: 530px; margin-left: 35rem; border-bottom-color: black; border-top-color: black;">
		<form action="address" method="post">
		<span style="color: green; margin-left: 170px;"> ${Msg}</span>
			<div class="mb-3">
				<label for="no" class="form-label">No</label> <input type="text"
					class="form-control" id="no" name="no">
			</div>
			<div class="mb-3">
				<label for="street" class="form-label">Street</label> <input
					type="text" class="form-control" id="street" name="street">
			</div>
			<div class="mb-3">
				<label for="city" class="form-label">City</label> <input type="text"
					class="form-control" id="city" name="city">
			</div>
			<div class="mb-3">
				<label for="state" class="form-label">State</label> <input
					type="text" class="form-control" id="state" name="state">
			</div>
			<div class="mb-3">
				<label for="country" class="form-label">Country</label> <input
					type="text" class="form-control" id="country" name="country">
			</div>
			<button type="submit" class="btn btn-primary">Send</button>

		</form>
	</div>

</body>
</html>
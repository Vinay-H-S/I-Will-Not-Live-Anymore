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
				<a class="navbar-brand">Navbar</a>
				<a class="navbar-brand" href="Index.jsp">home</a>
			</div>
		</nav>
	</div>


	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="form-control"
		style="width: 600px; height: 350px; margin-left: 35rem; border-bottom-color: black; border-top-color: black;">
		<form action="access" method="post">
		<span style="color: red; margin-left: 150px;">${errorMsg}</span>
			<div class="mb-3">
				<label for="userid" class="form-label">User Id</label> <input
					type="text" class="form-control" id="user" name="userId">
				<div class="mb-3">
					<label for="password" class="form-label">Password</label> <input
						type="password" class="form-control" id="password" name="password">
				</div>
				<button type="submit" class="btn btn-primary">Login</button>
			</div>
		</form>
	</div>
</body>
</html>
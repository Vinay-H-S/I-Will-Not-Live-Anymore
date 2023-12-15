<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				style="color: white; font-size: 25px;">Information</a> <a href="Index.jsp"
				style="text-decoration: none; font-size: 20px;">Home</a>
		</div>
	</nav>
	<br><br>
	<div class="form-control" style="margin-left: 35rem; width: 600px; height: 350px;">
		<form action="inform" method="post">
			<div>
				<label for="nameId">Name</label> <input type="text" id="nameId"
					name="userName" class="form-control">
			</div>
			<div>
				<label for="emailid">Email</label><input type="text"
					class="form-control" name="email" id="emialid">
			</div>
			<div>
				<label for="mobileId">Mobile</label><input type="text" name="mobile"
					id="mobileId" class="form-control">
			</div>
			<div>
				<label for="commentId">Comment</label><input type="text"
					name="comment" id="commentId" class="form-control">
			</div><br>
			<div>
				<button type="submit" class="btn btn-primary">Send</button>
			</div>

		</form>
	</div>

</body>
</html>
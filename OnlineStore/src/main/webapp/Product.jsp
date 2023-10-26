<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<nav class="navbar bg-dark border-bottom border-body"
			data-bs-theme="dark">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1" style="color: white;">ONLINE
					STORE</span> <a href="Index.jsp" style="color: white; font-size: 17px;">HOME</a>
			</div>
		</nav>
	</div>

	<br>
	<br>
	<br>
	<br>
	<div class="form-control"
		style="width: 500px; height: 630px; margin-left: 35rem;">
		<span style="color: red; margin-left: 140px;">${errorMsg }</span>
		<form action="store" method="post" name="onlineStore" onSubmit="return validateForm()">
			<div class="mb-3 row">
				<label for="name" class="form-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name" name="name">
				</div>
			</div>
			<div class="col-sm-10">
				<label for="type" class="col-sm-2 col-form-label">Type</label> <select
					class="form-select" name="type">
					<option selected>Open this select type</option>
					<option value="1">Loafer</option>
					<option value="2">Sneakers</option>
					<option value="3">Oxford Shoe</option>
					<option value="4">Sports Shoe</option>
					<option value="5">Clogs</option>
					<option value="6">Combat Shoe</option>
				</select>
			</div>
			<br>
			<div>
				<div class="mb-3 row">
					<label for="price" class="form-label">Price</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="price" class="price"
							name="price">
					</div>
				</div>
			</div>
			<div>
				<div class="mb-3 row">
					<label for="brand" class="form-label">Brand</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="brand" name="brand">
					</div>
				</div>
			</div>
			<div class="col-sm-10">
				<label for="type" class="col-sm-2 col-form-label">Quantity</label> <select
					class="form-select" name="quantity">
					<option selected>Open this select quantity</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
			<br>
			<div>
				<div class="mb-3 row">
					<label for="description" class="form-label">Description</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="description"
							name="description">
					</div>
				</div>
			</div>
			<div>
				<input type="submit" class="btn btn-primary" value="Send">
			</div>
		</form>
		
	</div>
</body>
</html>
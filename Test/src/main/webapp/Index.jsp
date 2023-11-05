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
		<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" style="font-size: 30px;" href="#">PRODUCT</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
	</div>
	</nav>
	</div>

	<br>
	<br>
	<div class="form-control"
		style="width: 650px; height: 350px; margin-left: 35rem;">
		<form action="items" method="post">
			<div class="mb-3 row">
				<label for="name" class="col-sm-2 col-form-label">Product
					Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="productId"
						name="productName">
				</div>
				<label for="name" class="col-sm-2 col-form-label">Price</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="priceId" name="price">
				</div>
				<div>
					<label for="name" class="col-sm-2 col-form-label">Discount</label> <select
						class="form-select" aria-label="Default select example"
						name="discount">
						<option selected>Select</option>
						<option value="1">5</option>
						<option value="2">7</option>
						<option value="3">10</option>
						<option value="3">15</option>
					</select>
				</div>
			</div>
			<button class="btn btn-primary" type="submit">Submit</button>
		</form>
	</div>
</body>
</html>
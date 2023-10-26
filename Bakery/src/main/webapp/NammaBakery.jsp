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
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">BAKERY</span> <a
				class="navbar-brand" href="Index.jsp">Home</a>
		</div>
	</nav>
	<br>
	<br>
	<form action="baker" method="post">
		<div class="form-control"
			style="width: 630px; height: 630px; margin-left: 27rem;">
			<div class="mb-3">
				<label for="itemName" class="form-label">Item Name</label> <input
					type="text" class="form-control" id="itemName"
					placeholder="enter the full item name" name="itemName">
			</div>
			<div class="mb-3">
				<label for="itemPrice" class="form-label">Item Price</label> <input
					type="text" class="form-control" id="itemPrice"
					placeholder="enter the valid price" name="itemPrice">
			</div>
			<div>
				<label for="quantity" class="form-label">Quantity</label> <select
					class="form-control" id="quantity" name="quantity">
					<option>Select</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
				</select>
			</div>
			<div>
				<label for="discount" class="form-label">Discount</label> <select
					class="form-control" id="discount" name="discount">
					<option>Select</option>
					<option>5</option>
					<option>10</option>
					<option>15</option>
					<option>20</option>
					<option>25</option>
					<option>30</option>
					<option>35</option>
					<option>90</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="gst" class="form-label">Gst</label> <input type="text"
					class="form-control" id="gst" placeholder="full gst number" name="gst">
			</div>
			<div class="mb-3">
				<label for="manufactureDate" class="form-label">Manufacture
					Date</label> <input type="date" class="form-control" id="manufactureDate" name="manfDate">
			</div>
			<div class="mb-3">
				<label for="expireDate" class="form-label">Expire Date</label> <input
					type="date" class="form-control" id="expireDate" name="expDate">
			</div>
			<div>
				<input class="btn btn-primary" type="submit" value="Save" />
			</div>

		</div>
	</form>
</body>
</html>
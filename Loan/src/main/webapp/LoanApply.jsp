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
			<div class="container-fluid">
				<a class="navbar-brand" style="color: white; font-size: 30px;"
					href="#">LOAN</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="d-flex"
					style="font-size: 20px; text-transform: uppercase; padding-right: 25px;">
					<form>
						<a href="Index.jsp">home</a> <a href="LoanApplySuccess.jsp">view</a>
					</form>
				</div>

			</div>
	</div>
	</nav>
	</div>
	<br>
	<br>
	<br>
	<div class="form-control"
		style="width: 600px; height: 450px; margin-left: 35rem;">
		<h3 class="head" style="margin-left: 70px; margin-bottom:20px; text-transform: uppercase;">Application for applying loan</h3>
		<form action="apply" method="post">
			<div class="mb-3 row">
				<div>
					<div class="mb-3 row">
						<label for="name" class="col-sm-2 col-form-label">Name</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="name" name="name">
						</div>
					</div>
				</div>
				<div>
					<div class="mb-3 row">
						<label for="amount" class="col-sm-2 col-form-label">Amount</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="amount"
								class="amount" name="amount">
						</div>
					</div>
				</div>
				<div>
					<div class="mb-3 row">
						<label for="working" class="col-sm-2 col-form-label">Working</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="working"
								class="working" name="working">
						</div>
					</div>
				</div>
				<div>
					<div class="mb-3 row">
						<label for="name" class="col-sm-2 col-form-label">Interest</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="name"
								class="interest" name="interest">
						</div>
					</div>
				</div>
				<div>
					<div class="mb-3 row">
						<label for="surety" class="col-sm-2 col-form-label">Surety</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="surety"
								class="surety" name="surety">
						</div>
					</div>
					<div>
						<div class="mb-3 row">
							<label for="company" class="col-sm-2 col-form-label">Company</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="company"
									class="company" name="company">
							</div>
						</div>
					</div>
				</div>
				<div>
					<div class="mb-3 row">
						<label for="loanTenure" class="col-sm-2 col-form-label">Loan
							Tenure</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="loanTenure"
								class="loanTenure" name="loanTenure">
						</div>
					</div>
				</div>

				<div>
					<label for="loanType" class="col-sm-2 col-form-label">Loan
						Type</label> <select name="loanType">
						<option>Select</option>
						<option>Home Loan</option>
						<option>Agriculture Loan</option>
						<option>Car Loan</option>
						<option>Business Loan</option>
						<option>Student Loan</option>
						<option>Gold Loan</option>
						<option>Land Purchase Loan</option>
					</select>
				</div>

			</div>
			<div class="radio-control"
				style="width: 650px; font-size: 13px; font-family: sans-serif;">

				<input type="radio" id="radio" class="radio-control"> <label
					for="radio" class="col-sm-2 col-form-label">Accept the
					terms</label>
			</div>
			<div>
				<input type="submit" class="btn btn-primary" value="Save">
			</div>
		</form>
</body>
</html>
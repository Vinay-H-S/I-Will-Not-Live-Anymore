<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar Example</title>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<style>
footer{
background-color: black;
color: white;
text-align: center;
padding: 10px;
}

</style>
<body>
	<nav class="navbar navbar-expand-lg navbar-black bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://th.bing.com/th/id/OIP.sKD6cb_jUksj6usKnPC5awHaDt?pid=ImgDet&rs=1"
			width="100" height="30" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="aboutUs.jsp">About
						Us</a></li>
				<li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a>
				</li>
			</ul>
		</div>


		<form class="form-inline">
			<input class="form-control mr-2" type="search" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>


		</li>
		<li class="nav-item"><a class="nav-link" href="profile.jsp">Profile
		</a></li>
	</nav>


	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="work" method="post">
					<span style='color: red;' id="N"></span>
					<div class="form-group">

						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter your name" onblur="handleName()">
					</div>
					<br>
					<p id="Nu" />
					<div class="form-group">

						<label for="mobile">Mobile Number</label> <input type="text"
							class="form-control" id="mobile" name="phoneNo"
							placeholder="Enter your mobile number" onblur="handleNumber()">
					</div>
					<br>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email
							address</label> <input type="email" class="form-control"
							id="exampleInputEmail1" name="email">
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>
						  
					</div>
					<br>
					<div class="form-group">
						<label for="dob">Date of Birth</label> <input type="date"
							class="form-control" id="dob" name="dob"
							onblur="handleFromGroup()">
					</div>
					<br>
					<p id="C" />
					<div class="col-md-3">
						<label for="location" class="form-label" onblur="handleLocation()">location</label>
						<select class="form-select" id="location" required name="location">
							<option selected disabled value="">Choose...</option>
							<option>Hubballi</option>
							<option>Bangalore</option>
							<option>Dharwad</option>
							<option>Manglore</option>
						</select>
					</div>
					<br>
					<p id="P" />
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter your password" onblur="handlePassword()">
					</div>
					<br>
					<p id="Pa" />
					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="password" class="form-control" id="confirmPassword"
							name="confirmPassword" placeholder="Confirm your password"
							onblur="handleConfirm()">
					</div>
					<br>
					<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></div>

					<br>


					<button type="submit" class="btn btn-primary">Cancel</button>

					<button type="submit" class="btn btn-primary" id="Submit">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<script>
		function handleName() {
			const Name = document.getElementById("name").value;
			const button = document.getElementById("Submit");
			if (Name.length > 3 && Name.length < 20) {
				document.getElementById("N").innerHTML = "<span style='color:green'>name is valid</span>";

			} else {
				document.getElementById("N").innerHTML = "<span style='color:red'> name is invalid</span>";
				button.setAttribute("disabled", "disabled");
			}
		}
		function handleNumber() {
			const Number = document.getElementById("mobile").value;
			const button = document.getElementById("Submit");
			if (Number > 1000000000 && Number < 9999999999) {
				console.log("it is valid")
				document.getElementById("Nu").innerHTML = "<span style='color:green'> Number is valid</span>";
			} else {
				console.log("it is Invalid")
				document.getElementById("Nu").innerHTML = "<span style='color:red'> Number is invalid</span>";
				button.setAttribute("disabled", "disabled");
			}
		}
		function handleLocation() {
			const checkLocation = document.getElementById("location").value;
			const button = document.getElementById("Submit");
			if (checkLocation === 'Choose...') {
				button.setAttribute("disabled", "disabled");
				document.getElementById("C").innerHTML = "<span style='color:red'> Location is invalid</span>";
			} else {
				document.getElementById("C").innerHTML = "<span style='color:green'> Location is valid</span>";
			}
		}
		function handlePassword() {
			const checkPassword = document.getElementById("password").value;

			const button = document.getElementById("Submit");
			if (checkPassword.length > 3 && checkPassword.length < 9999999999) {
				console.log("Password is valid")
				document.getElementById("P").innerHTML = "<span style='color:green'> Password is valid</span>";
			} else {
				console.log("password is Invalid")
				document.getElementById("P").innerHTML = "<span style='color:red'>Password is invalid</span>";

			}
		}
		function handleConfirm() {
			const ConfirmPassword = document.getElementById("confirmPassword").value;
			const checkPassword = document.getElementById("password").value;
			const button = document.getElementById("Submit");
			if (ConfirmPassword == checkPassword) {

				document.getElementById("Pa").innerHTML = "<span style='color:green'> Confirm Password is valid</span>";
				button.removeAttribute("disabled");
			} else {
				console.log("Confirm is valid")
				document.getElementById("Pa").innerHTML = "<span style='color:red'> Confirm Password is invalid</span>";

				button.setAttribute("disabled", "disabled");
			}

		}
	</script>
	<script src='https://www.google.com/recaptcha/api.js'></script>

	<!-- Add Bootstrap JS Links -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
<br><br>
<footer ><span>Copyright@2023</span></footer>
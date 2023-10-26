<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
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
	</div>
	<h1>Name is ${Xworkz.name}</h1>
	<h1>PhoneNo is ${Xworkz.phoneNo}</h1>
	<h1>Email is ${Xworkz.email}</h1>
	<h1>DOB is ${Xworkz.dob}</h1>
	<h1>Loc is ${Xworkz.location}</h1>
	<h1>Pass is ${Xworkz.password}</h1>
	<h1>CPass is ${Xworkz.confirmPassword}</h1>



</body>
</html>
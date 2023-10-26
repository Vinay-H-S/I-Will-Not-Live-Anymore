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
		<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1" style="color: white;">ONLINE STORE</span>
				<a href="Product.jsp" style="color: white; font-size: 17px; ">BACK</a>
			</div>
		</nav>
	</div>
	
	<h1> Name =${msg.name}</h1>
	<h1> Type =${msg.type}</h1>
	<h1> Price = ${msg.price}</h1>
	<h1> Brand =${msg.brand}</h1>
	<h1> Quantity=${msg.quantity}</h1>
	<h1> Description= ${msg.description}</h1>
	<h1> Total =${total}</h1>

</body>
</html>
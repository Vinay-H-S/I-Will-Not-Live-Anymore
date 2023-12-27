<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<!-- As a link -->
	<nav class="navbar" style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">CAKE PALACE</a> <a
				class="navbar-brand" href="index.jsp">Home</a>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<span style="color: red;"> <c:forEach items="${objectErrors}"
			var="err">${err.defaultMessage}</c:forEach>
	</span>
	<div class="form-control"
		style="width: 450px; height: 530px; margin-left: 38rem; border-color: green;">
		<form action="wow" method="post">
			<div>
				<span style="color: green"><h2>${msg}</h2></span>
			</div>
			<div>
				<label>Customer Name</label> <input type="text" name="customerName"
					class="form-control" value="${dto.customerName}" />
			</div>
			<div>
				<label>Email</label> <input type="email" name="email"
					class="form-control" value="${dto.email}" />
			</div>
			<div>
				<label>Flavour</label> <select class="form-control" name="flavour">
					<option selected="selected">Flavour</option>
					<option value="Vanilla"
						<c:if test="${dto.flavour=='Vanilla'}">selected="selected"</c:if>>Vanilla</option>
					<option value="Orange"
						<c:if test="${dto.flavour=='Orange'}">selected="selected"</c:if>>Orange</option>
					<option value="Banana"
						<c:if test="${dto.flavour=='Banana'}">selected="selected"</c:if>>Banana</option>
					<option value="Chocolate"
						<c:if test="${dto.flavour=='Chocolate'}">selected="selected"</c:if>>Chocolate</option>
				</select>
			</div>
			<br> <label>Weight</label> <select class="form-control"
				name="weigth">
				<option selected="selected">Weight</option>
				<option value="0.5KG"
					<c:if test="${dto.weigth=='0.5KG'}">selected="selected"</c:if>>0.5KG</option>
				<option value="1KG"
					<c:if test="${dto.weigth=='1KG'}">selected="selected"</c:if>>1KG</option>
				<option value="2KG"
					<c:if test="${dto.weigth=='2KG'}">selected="selected"</c:if>>2KG</option>
				<option value="2.5KG"
					<c:if test="${dto.weigth=='2.5KG'}">selected="selected"</c:if>>2.5KG</option>
			</select> <br>
			<div>
				<label>Price</label> <input type="text" name="price"
					class="form-control" value="${dto.price}" />
			</div>
			<div>
				<br> <input type="radio" name="takeAway" value="Yes" /> <label>Take
					Away</label>
			</div>
			<br>
			<div>
				<input type="submit" class="btn btn-success" value="Order" />
			</div>
		</form>
	</div>
</body>
</html>
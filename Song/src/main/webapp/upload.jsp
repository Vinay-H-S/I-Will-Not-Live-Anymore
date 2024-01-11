<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<span style="color :green;">${message}</span>
	<form method="POST" action="go" enctype="multipart/form-data">
		<div>
			<label>File</label> <input type="file" name="file" />
		</div>
		<br>
		<div>
			<input type="submit" value="Submit" class="btn btn-primary" />
		</div>
	</form>
</body>
</html>
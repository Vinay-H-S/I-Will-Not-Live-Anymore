<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song</title>
<link rel="icon" type="images/x-icon"
	href="https://th.bing.com/th?id=OIP.xkny1FfZ0mvFuX1Ms4I24AHaF7&w=279&h=223&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<!-- As a link -->
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">SONG</a> <a class="navbar-brand"
				href="index.jsp">Home</a>
		</div>
	</nav>
	<br>
	<div class="form-control"
		style="width: 650px; height: 750px; margin-left: 27rem; border-color: blue;">
		<span><c:forEach items="${err}" var="errors">
				<span style="color: red;">${errors.getMessage()}<br></span>
			</c:forEach></span>
		<form action="music" method="post">
			<span style="color: blue; text-align: center;"><h2>SONG
					DETAILS</h2></span>
			<div>
				<label>Song Name</label> <input type="text" name="songName"
					id="songName" class="form-control" value="${dto.songName}" />
			</div>
			<div>
				<label>Singer Name</label> <input type="text" name="singerName"
					id="singerName" class="form-control" value="${dto.singerName}" />
			</div>
			<div>
				<label>Composer</label> <input type="text" name="composer"
					id="composer" class="form-control" value="${dto.composer}" />
			</div>
			<div>
				<label>Duration</label> <input type="time" name="duration"
					id="duration" class="form-control" value="${dto.duration}" />
			</div>
			<div>
				<label>Album</label> <input type="text" name="album" id="album"
					class="form-control" value="${dto.composer}" />
			</div>
			<div>
				<label>Language</label> <select name="language" id="language"
					class="form-control">
					<option selected="selected">Language</option>
					<option value="Kannada"
						<c:if test="${dto.language=='Kannada'}">selected="selected"</c:if>>Kannada</option>
					<option value="English"
						<c:if test="${dto.language=='English'}">selected="selected"</c:if>>English</option>
					<option value="Telugu"
						<c:if test="${dto.language=='Telugu'}">selected="selected"</c:if>>Telugu</option>
					<option value="Hindi"
						<c:if test="${dto.language=='Hindi'}">selected="selected"</c:if>>Hindi</option>
					<option value="Tamil"
						<c:if test="${dto.language=='Tamil'}">selected="selected"</c:if>>Tamil</option>
				</select>
			</div>
			<div>
				<label>Release Date</label> <input type="date" name="releaseDate"
					id="releaseDate" class="form-control" value="${dto.releaseDate}" />
			</div>
			<div>
				<label>Lyricist</label> <input type="text" name="lyricist"
					id="lyricist" class="form-control" value="${dto.lyricist}" />
			</div>
			<div>
				<label>Producer</label> <input type="text" name="producer"
					id="producer" class="form-control" value="${dto.producer}" />
			</div>
			<div>
				<label>Director</label> <input type="text" name="director"
					id="director" class="form-control" value="${dto.director}" />
			</div>
			<br>
			<div>
				<button type="submit" class="btn btn-primary" class="form-control"
					id="button">Save</button>
			</div>

		</form>
	</div>
</body>
</html>
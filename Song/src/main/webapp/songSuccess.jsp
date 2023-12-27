<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Success</title>
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
				href="song.jsp">Back</a>
		</div>
	</nav>
	<span style="color: green; text-align: center;"><h1>${msg}</h1></span>
	<div>
	<span style=" text-align: center;"><h3>Song Name : ${dto.songName}</h3></span>
	<span style=" text-align: center;"><h3>Singer Name : ${dto.singerName}</h3></span>
	<span style=" text-align: center;"><h3>Composer : ${dto.composer}</h3></span>
	<span style=" text-align: center;"><h3>Duration : ${dto.duration} Min</h3></span>
	<span style=" text-align: center;"><h3>Album : ${dto.album}</h3></span>
	<span style=" text-align: center;"><h3>Language : ${dto.language}</h3></span>
	<span style=" text-align: center;"><h3>Release Date : ${dto.releaseDate}</h3></span>
	<span style=" text-align: center;"><h3>Lyricist : ${dto.lyricist}</h3></span>
	<span style=" text-align: center;"><h3>Producer : ${dto.producer}</h3></span>
	<span style=" text-align: center;"><h3>Director : ${dto.director}</h3></span>
	</div>
</body>
</html>
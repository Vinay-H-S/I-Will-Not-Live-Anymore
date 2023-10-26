<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<div>
		<nav class="navbar bg-primary">
			<div>
				<span
					style="color: white; text-transform: uppercase; font-size: 20px; padding-left: 10px;"><b>cricket</b></span>
			</div>
		</nav>
	</div>
	<br>
	<br>
	<div class="form-control" style="width: 450px; margin-left: 32rem;">
		<span style="color: skyblue;"><h1>MATCH DETAILS</h1></span>
		<form action="dhoni" method="post">
			<label for="tournamentName">Tournament Name</label>
				<p id="verify"/>
			<div>
				<input type="text" id="tournamentName" name="tournamentName"
					class="form-control" onblur="handleTournamentName()">
			</div>
			<label for="hostingName">Hosting Country</label>
			<p id="country"/>
			<div>
				<input type="text" id="hostingCountry" name="hostingCountry"
					class="form-control" onblur="handleHostingCountry()">
			</div>
			<label for="matchDate">Match Date</label>
			<p id="date"/>
			<div>
				<input type="date" id="matchDate" name="matchDate"
					class="form-control" onblur="handleMatchDate()">
			</div>
			<label for="team1">Team 1</label>
			<p id="team"/>
			<div>
				<input type="text" id="team1" name="team1" class="form-control"
					onblur="handleTeam1()">
			</div>
			<label for="team 2">Team 2</label>
			<p id="teamm"/>
			<div>
				<input type="text" id="team2" name="team2" class="form-control"
					onblur="handleTeam2()">
			</div>
			<label for="team1CaptainName">Team 1 Captain Name</label>
			<p id="team1Captain"/>
			<div>
				<input type="text" id="team1CaptainName" name="team1CaptainName"
					class="form-control" onblur="handleTeam1CaptainName()">
			</div>
			<label for="team2CaptainName">Team 2 Captain Name</label>
			<p id="team2Captain"/>
			<div>
				<input type="text" id="team2CaptainName" name="team2CaptainName"
					class="form-control" onblur="handleTeam2CaptainName()">
			</div>
			<label for="umpireName">Umpire Name</label>
			<p id="umpire"/>
			<div>
				<input type="text" id="umpireName" name="umpireName"
					class="form-control" onblur="handleUmpireName()">
			</div>
			<label for="stadiumName">Stadium Name</label>
			<p id="stadium"/>
			<div>
				<input type="text" id="stadiumName" name="stadiumName"
					class="form-control" onblur="handleStadiumName()">
			</div>
			<label for="thirdUmpireName">Third Umpire Name</label>
			<p id="thiredUmpire"/>
			<div>
				<input type="text" id="thirdUmpireName" name="thirdUmpireName"
					class="form-control" onblur="handleThirdUmpireName()">
			</div>
			<label for="stadiumCapcity">Stadium Capacity</label>
			<p id="capacity"/>
			<div>
				<input type="text" id="stadiumCapcity" name="stadiumCapcity"
					class="form-control" onblur="handleStadiumCapcity()">
			</div>
			<div>
				<br> <input type="submit" class="btn btn-primary"
					value="Submit" id="button">
			</div>
		</form>
	</div>

	<script type="text/javascript">
		function handleTournamentName(event) {
			var name = document.getElementById("tournamentName");
			console.log(name.value)
			var button = document.getElementById("button");
			if (name.value.length >= 3 && name.value.length < 30) {
				document.getElementById("verify").innerHTML = "<span style='color:blue'>Tournament name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("verify").innerHTML = "<span style='color:red'>Please enter Valid Tournament name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleHostingCountry(event) {
			var country = document.getElementById("hostingCountry");
			console.log(country.value)
			var button = document.getElementById("button");
			if (country.value.length >= 3 && country.value.length < 30) {
				document.getElementById("country").innerHTML = "<span style='color:blue'>Country is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("country").innerHTML = "<span style='color:red'>Please enter Valid country</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleMatchDate(event) {
			var date = document.getElementById("matchDate");
			console.log(date.value)
			var button = document.getElementById("button");
			if (date.value > 0 && date.value <= 31) {
				document.getElementById("date").innerHTML = "<span style='color:blue'>Date is valid</span>";
				button.removeAttribute("disabled");
			} else {

				document.getElementById("date").innerHTML = "<span style='color:red'>Please enter valid date</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam1(event) {
			var team1 = document.getElementById("team1");
			console.log(team1.value)
			var button = document.getElementById("button");
			if (team1.value.length >= 3 && team1.value.length < 30) {
				document.getElementById("team").innerHTML = "<span style='color:blue'>Team1 name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("team").innerHTML = "<span style='color:red'>Please enter Valid Team1 name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam2(event) {
			var team2 = document.getElementById("team2");
			console.log(team2.value)
			var button = document.getElementById("button");
			if (team2.value.length >= 3 && team2.value.length < 30) {
				document.getElementById("teamm").innerHTML = "<span style='color:blue'>Team2 name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("teamm").innerHTML = "<span style='color:red'>Please enter Valid Team2 name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam1CaptainName(event) {
			var team1CName = document.getElementById("team1CaptainName");
			console.log(team1CName.value)
			var button = document.getElementById("button");
			if (team1CName.value.length >= 3 && team1CName.value.length < 30) {
				document.getElementById("team1Captain").innerHTML = "<span style='color:blue'>Team1 captain name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("team1Captain").innerHTML = "<span style='color:red'>Please enter Valid Team1 captain name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam2CaptainName(event) {
			var team2CName = document.getElementById("team2CaptainName");
			console.log(team2CName.value)
			var button = document.getElementById("button");
			if (team2CName.value.length >= 3 && team2CName.value.length < 30) {
				document.getElementById("team2Captain").innerHTML = "<span style='color:blue'>Team2 captain name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("team2Captain").innerHTML = "<span style='color:red'>Please enter Valid Team2 captain name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleUmpireName(event) {
			var umpireName = document.getElementById("umpireName");
			console.log(umpireName.value)
			var button = document.getElementById("button");
			if (umpireName.value.length >= 3 && umpireName.value.length < 30) {
				document.getElementById("umpire").innerHTML = "<span style='color:blue'>Umpire name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("umpire").innerHTML = "<span style='color:red'>Please enter Valid Umpire name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleStadiumName(event) {
			var stadiumName = document.getElementById("stadiumName");
			console.log(stadiumName.value)
			var button = document.getElementById("button");
			if (stadiumName.value.length >= 3 && stadiumName.value.length < 30) {
				document.getElementById("stadium").innerHTML = "<span style='color:blue'>Stadium name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("stadium").innerHTML = "<span style='color:red'>Please enter Valid Stadium name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleThirdUmpireName(event) {
			var thirdUmpireName = document.getElementById("thirdUmpireName");
			console.log(thirdUmpireName.value)
			var button = document.getElementById("button");
			if (thirdUmpireName.value.length >= 3
					&& thirdUmpireName.value.length < 30) {
				document.getElementById("third").innerHTML = "<span style='color:blue'>Third umpire name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("third").innerHTML = "<span style='color:red'>Please enter Valid third umpire name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleStadiumCapacity(event) {
			var stadiumCapacity = document.getElementById("stadiumCapacity");
			console.log(stadiumCapacity.value)
			var button = document.getElementById("button");
			if (stadiumCapacity.value > 0 && stadiumCapacity.value <= 150000) {
				document.getElementById("capacity").innerHTML = "<span style='color:blue'>Stadium capacity is valid</span>";
				button.removeAttribute("disabled");
			} else {

				document.getElementById("capacity").innerHTML = "<span style='color:red'>Please enter valid Stadium capacity</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function validateForm() {
			console.log("ffffffffffffffffffffff")
			var name = document.getElementById("tournamentName").value;
			var country = document.getElementById("hostingCountry").value;
			var date = document.getElementById("matchDate").value;
			var team1 = document.getElementById("team1").value;
			var team2 = document.getElementById("team2").value;
			var team1CName = document.getElementById("team1CaptainName").value;
			var team2CName = document.getElementById("team2CaptainName").value;
			var umpireName = document.getElementById("umpireName").value;
			var stadiumName = document.getElementById("stadiumName").value;
			var thirdUmpireName = document.getElementById("thirdUmpireName").value;
			var stadiumCapacity = document.getElementById("stadiumCapacity").value;
			var button = document.getElementById("button");
			if (name.length >= 3 && name.length < 30 && country.length >= 3 && country.length < 30 && date > 0 && date <= 31 && team1.length >= 3 && 
					team1.length < 30 && team2.length >= 3 && team2.length < 30 && team1CName.length >= 3 && team1CName.length < 30 && team2CName.length >= 3
					&& team2CName.length < 30 && umpireName.length >= 3 && umpireName.length < 30 && stadiumName.length >= 3 && stadiumName.length < 30 && 
					thirdUmpireName.length >= 3 && thirdUmpireName.length < 30 && stadiumCapacity > 0 && stadiumCapacity < 150000) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Information valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid valid Information</span>";
				button.setAttribute("disabled", "");

			}
		}
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>
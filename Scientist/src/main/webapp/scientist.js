function handleName() {
	const ScientistName = document.getElementById('scientsitName');
	const Button = document.getElementById('submit');
	if (ScientistName.length > 4 && ScientistName.length < 10) {
		document.getElementById('N').innerHTML = "<span style='color:green;'>Scientist Name is valid</span>";
	} else {
		document.getElementById('N').innerHTML = "<span style='color:red;'>Scientist Name is invalid</span>";
		Button.setAttribute("disabled", "disabled");
	}
}

function handleField() {
	const Fields= document.getElementById('field');
	const Button = document.getElementById('submit');
	if (Fields==='Field') {
		document.getElementById('F').innerHTML = "<span style='color:green;'>Field is valid</span>";
	} else {
		document.getElementById('F').innerHTML = "<span style='color:red;'>Field is invalid</span>";
		Button.setAttribute("disabled", "disabled");
	}
}

function handleExp() {
	const exp= document.getElementById('experience');
	const Button = document.getElementById('submit');
	if (exp>5 && exp<40) {
		document.getElementById('E').innerHTML = "<span style='color:green;'>Experience  is valid</span>";
	} else {
		document.getElementById('E').innerHTML = "<span style='color:red;'>Experience is invalid</span>";
		Button.setAttribute("disabled", "disabled");
	}
}
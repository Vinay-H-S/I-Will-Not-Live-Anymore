function handleFirstName() {
	var button = document.getElementById('button');
	var firstName = document.getElementById('firstName').value;
	if (firstName.length > 3 && firstName.length <= 20) {
		button.removeAttribute('disabled');
		document.getElementById('fname').innerHTML = "<span style='color:green;'>First name is valid</span>";
		return true;
	}
	else {
		button.setAttribute("disabled", "")
		document.getElementById('fname').innerHTML = "<span style='color:red;'>First name should be between 3 to 20 characters*</span>";
		return false;
	}

}
function handlelastName() {
	var button = document.getElementById('button');
	var lastName = document.getElementById('lastName').value;
	if (lastName.length > 3 && lastName.length <= 20) {
		button.removeAttribute('disabled');
		document.getElementById('lname').innerHTML = "<span style='color:green;'>Last name is valid</span>";
		return true;
	}
	else {
		button.setAttribute("disabled", "")
		document.getElementById('lname').innerHTML = "<span style='color:red;'>Last name should be between 3 to 20 characters*</span>";
		return false;
	}

}

function handleDob() {
	var button = document.getElementById('button');
	var dob = document.getElementById('dob').value;
	if (dob !== "") {
		button.removeAttribute('disabled');
		document.getElementById('birth').innerHTML = "<span style='color:green'>Date of birth is valid</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('birth').innerHTML = "<span style='color:red;'>Date of birth is mandatory*</span>";
		return false;

	}
}

function handleCountry() {
	var button = document.getElementById('button');
	var country = document.getElementById('country').value;
	if (country !== "") {
		button.removeAttribute('disabled');
		document.getElementById('india').innerHTML = "<span style='color:green'>Country Name is valid</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('india').innerHTML = "<span style='color:red;'>Should be select the country*</span>";
		return false;
	}
}

function handleGender() {
	var button = document.getElementById('button');
	var gender = document.getElementById('gender').value;
	if (gender !== " ") {
		button.removeAttribute('disabled');
		document.getElementById('gen').innerHTML = "<span style='color:green'>Gender Selected</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('gen').innerHTML = "<span style='color:red;'>Should be select the Gender*</span>";
		return false;
	}

}

function handleProfession() {
	var button = document.getElementById('button');
	var profession = document.getElementById('profession').value;
	if (profession.length > 3 && profession.length <= 20) {
		button.removeAttribute('disabled');
		document.getElementById('work').innerHTML = "<span style='color:green'>Profession is valid</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('work').innerHTML = "<span style='color:red;'>Mention the profession*</span>";
		return false;
	}
}

function handleEmail() {
	var button = document.getElementById('button');
	var email = document.getElementById('email').value;
	if (email !== "") {
		button.removeAttribute('disabled');
		document.getElementById('mail').innerHTML = "<span style='color:green'>Email is valid</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('mail').innerHTML = "<span style='color:red;'>Email is madatory*</span>";
		return false;
	}
}

function handleMobileNumber() {
	var button = document.getElementById('button');
	var mobileNumber = document.getElementById('mobileNumber').value;
	if (mobileNumber > 1111111111 && mobileNumber <= 10000000000) {
		button.removeAttribute('disabled');
		document.getElementById('mobile').innerHTML = "<span style='color:green'>Mobile number is valid</span>";
		return true;
	} else {
		button.setAttribute("disabled", "")
		document.getElementById('mobile').innerHTML = "<span style='color:red;'>Mobile number is madatory*</span>";
		return false;
	}
}


function validateForm() {
	var firstName = document.getElementById('firstName').value;
	var lastName = document.getElementById('lastName').value;
	var dob = document.getElementById('dob').value;
	var country = document.getElementById('country').value;
	var gender = document.getElementById('gender').value;
	var profession = document.getElementById('profession').value;
	var email = document.getElementById('email').value;
	var mobileNumber = document.getElementById('mobileNumber').value;

	if (firstName.length > 3 && firstName.length <= 20 && lastName.length > 3 && lastName.length <= 20 && 
	dob !== "" && country !== "" && gender !== " " && profession.length > 3 && profession.length <= 15 && email !== "" && 
	mobileNumber > 1111111111 && mobileNumber <= 10000000000){
		button.removeAttribute('disabled');
		document.getElementById('confirm').innerHTML = "<span style='color:green'>Customer Form is Saved Successfully</span>";
		return true;
	}else{
		button.setAttribute("disabled", "")
		document.getElementById('confirm').innerHTML = "<span style='color:red;'>Fill all the fields is madatory*</span>";
		return false;
	}

}
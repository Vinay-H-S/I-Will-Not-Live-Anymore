  function handleName(){
    	const Name=document.getElementById("name").value;
    	const button=document.getElementById("Submit");
    	if(Name.length>3 && Name.length<20){
    		document.getElementById("N").innerHTML="It is Valid";
    		
    	}else{
    		document.getElementById("N").innerHTML="It is in Valid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function handleNumber(){
    	const Number=document.getElementById("mobile").value;
    	const button=document.getElementById("Submit");
    	if(Number>1000000000 && Number<9999999999)
    		{
    		console.log("it is valid")
    		document.getElementById("Nu").innerHTML="It is Valid";
    		}else{
    			console.log("it is Invalid")
    			document.getElementById("Nu").innerHTML="It is in Valid";
    			button.setAttribute("disabled","disabled");
    			}
    }
    function handleLocation(){
    	const checkLocation=document.getElementById("location").value;
    	const button=document.getElementById("Submit");
    	if(checkLocation==='Choose...'){
    		button.setAttribute("disabled","disabled");
    		document.getElementById("C").innerHTML="It is in Valid";
    	}else{
    		document.getElementById("C").innerHTML="It is Valid";
    	}
    }
    function handlePassword(){
    	const checkPassword=document.getElementById("password").value;
    	
    	const button=document.getElementById("Submit");
    	if(checkPassword.length>3&& checkPassword.length<10)
    		{
    		console.log("Password is valid")
    		document.getElementById("P").innerHTML="It is Valid";
    		}else{
    			console.log("password is Invalid")
        		document.getElementById("P").innerHTML="It is Valid";
    			
    		}
    }
   function handleConfirm(){
	   const ConfirmPassword=document.getElementById("confirmPassword").value;
	   const checkPassword=document.getElementById("password").value;
   	const button=document.getElementById("Submit");
   	if(ConfirmPassword!=checkPassword)
   		{
   		console.log("Confirm is invalid")
		document.getElementById("Pa").innerHTML="It is inValid";
   		button.setAttribute("disabled","disabled");
		}else{
			console.log("Confirm is valid")
    		document.getElementById("Pa").innerHTML="It is Valid";
			button.removeAttribute("disabled");
			
		}
   		
   }
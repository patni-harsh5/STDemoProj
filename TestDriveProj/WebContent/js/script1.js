function validateCustomer(){
	var valid = true;
	var message = "Login successfull!";
	
	var custName = document.forms.myform.cname.value;
	var licNum = document.forms.myform.dlc.value;
	
	if (hasNumber(custName)){
		valid = false;
		message = "Please enter name with out numbers.";
	}
	
	if (alphanumeric(licNum) == false){
		valid = false;
		message = "Please enter appropriate License number.";
	}
	
	if(!valid){
		document.getElementById("alert").innerHTML = message;
	}
	return valid;
	
}

function hasNumber(myString) {
	  return /\d/.test(myString);
	}

function alphanumeric(str) {
 var letterNumber = /^[a-z0-9]+$/i;
 if(str.match(letterNumber)) {
   return true;
  }
  return false; 

  }

function success(){
	return window.location.href = '../pages/Confirmation.jsp';
}
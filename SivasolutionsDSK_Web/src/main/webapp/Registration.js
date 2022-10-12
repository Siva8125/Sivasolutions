/**
 * 
 */
 function clearErrorMessage(){
document.getElementById("errorMsgStudentId").innerHTML="";
document.getElementById("errorMsgFirstName").innerHTML="";
document.getElementById("errorMsgLastName").innerHTML="";
document.getElementById("errorMsgFatherName").innerHTML="";
document.getElementById("errorMsgAddress").innerHTML="";
}

function validcheck() {
var StudentId = document.getElementById("StudentId").value;
var FirstName = document.getElementById("FirstName").value;
var LastName = document.getElementById("LastName").value;
var FatherName = document.getElementById("FatherName").value;
var Address = document.getElementById("Address").value;

if(StudentId == "" || StudentId == null){
document.getElementById("errorMsgStudentId").innerHTML="please enter ID";
return false;
} else if (FirstName == "" || FirstName == null){
document.getElementById("errorMsgFirstName").innerHTML="please enter first name";
return false;
} else if (LastName == "" || LastName == null){
document.getElementById("errorMsgLastName").innerHTML="please enter last name";
return false;
} else if (FatherName == "" || FatherName == null){
document.getElementById("errorMsgFatherName").innerHTML="please enter father name";
return false;
} else if (Address == "" || Address == null){
document.getElementById("errorMsgAddress").innerHTML="please enter address";
return false;
} else {
return true;
}
}
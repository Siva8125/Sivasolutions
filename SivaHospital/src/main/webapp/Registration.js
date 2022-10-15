/**
 * 
 */
 function clearErrorMessage(){
document.getElementById("errorMsgPatientNumber").innerHTML="";
document.getElementById("errorMsgPatientName").innerHTML="";

}

function validcheck() {
var PatientNumber = document.getElementById("PatientNumber").value;
var PatientName = document.getElementById("PatientName").value;


if(PatientNumber == "" || PatientNumber == null){
document.getElementById("errorMsgPatientNumber").innerHTML="please enter PatientNumber";
return false;

} else if (PatientName == "" || PatientName == null){
document.getElementById("errorMsgPatientName").innerHTML="please enter PatientName";
return false;
} else {
return true;
}
}
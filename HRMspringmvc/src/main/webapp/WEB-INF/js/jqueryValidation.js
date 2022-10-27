function jqueryValidation1()
{
var fName=$("#firstName").val();
var lName=$("#lastName").val();
var faName=$("#fatherName").val();
var gender=$("#gender").val();
var dob=$("#dob").val();
var email=$("#emailId").val();
var mobileid=$("#mobileNumber").val();
var alternateMobileNo=$("alternateMobileNumber").val();
var adhar=$("#aadharNo").val();
var pan=$("#panNumber").val();
var passport=$("#passportNumber").val();
var permanentadd=$("#permanentAddress").val();
var localadd=$("#localAddress").val();
var schoolname=$("#schoolName").val();
var tenthpassedout=$("#tenthPassedOut").val();
var collegename=$("#intermediateCollegeName").val();
var interpassedout=$("#interPassedOut").val();
var graduation=$("#graduationDetails").val();
var graduationpassedout=$("#graduationPassedOut").val();
var branch=$("#branch").val();
var univer=$("#university").val();
var companyid=$("#companyName").val();
var roleid=$("#role").val();
//var notice=$("#noticePeriod").val();
var location=$("#location").val();
var experience=$("#experience").val();
var currentctc=$("#currentCTC").val();
//var expectedctc=$("#expectedCTC").val();
var bank=$("#bankName").val();
var accno=$("#bankAccNo").val();
var ifsc=$("#ifscCode").val();

if(fName==null||fName=="")
{
$("#errorMsg").html("please enter firstName");
return false;
}

else if(lName==null||lName=="")
{
$("#errorMsg1").html("please enter lastName");
return false;
}


else if(faName==null||faName=="")
{
$("#errorMsg2").html("please enter FatherName");
return false;
}



else if(gender==null||gender=="")
{
$("#errorMsg3").html("please select the gender");
return false;
}

else if(dob==null||dob=="")
{
$("#errorMsg4").html("please select your Date of Birth");
return false;
}

else if(email==null||email=="")
{
$("#errorMsg5").html("please enter emailId");
return false;
}
else if(mobileid==null||mobileid=="")
{
$("#errorMsg6").html("please enter mobile Number");
return false;
}
else if(alternateMobileNo==null||alternateMobileNo=="")
{
$("#errorMsg7").html("please enter alternateMobileNumber");
return false;
}
else if(adhar==null||adhar=="")
{
$("#errorMsg8").html("please enter Adharnumber");
return false;
}
else if(pan==null||pan=="")
	{
	$("#errorMsg9").html("please enter panNumber");
	return false;
	}
else if(passport==null||passport=="")
	{
	$("#errorMsg10").html("please enter passportnumber");
	return false;
	}


else if(permanentadd==null||permanentadd=="")
{
$("#errorMsg11").html("please enter permanentaddress");
return false;
}

else if(localadd==null||localadd=="")
{
$("#errorMsg12").html("please enter localaddress");
return false;
}

else if(schoolname==null||schoolname=="")
{
$("#errorMsg13").html("please enter schoolname");
return false;
}

else if(tenthpassedout==null||tenthpassedout=="")
{
$("#errorMsg14").html("please enter year of passing");
return false;
}

else if(collegename==null||collegename=="")
{
$("#errorMsg15").html("please enter your collage name");
return false;
}

else if(interpassedout==null||interpassedout=="")
{
$("#errorMsg16").html("please enter year of passing");
return false;
}

else if(graduation==null||graduation=="None")
{
$("#errorMsg17").html("please enter your graduation details");
return false;
}

else if(graduationpassedout==null||graduationpassedout=="")
{
$("#errorMsg18").html("please enter year of passing");
return false;
}

else if(branch==null||branch=="None")
{
$("#errorMsg19").html("please enter lastName");
return false;
}

else if(university==null||university=="")
{
$("#errorMsg20").html("please enter university name");
return false;
}


else if(companyid==null||companyid=="")
{
$("#errorMsg21").html("please enter your companyName");
return false;
}
else if(roleid==null||roleid=="")
{
$("#errorMsg22").html("please enter your role");
return false;
}

//else if(notice==null||notice=="None")
//{
//$("#errorMsg23").html="please enter your notice period";
//return false;
//}

else if(location==null||location=="")
{
$("#errorMsg23").html("please enter your location");
return false;
}

else if(experience==null||experience=="")
{
$("#errorMsg24").html("please enter your experience");
return false;
}

else if(currentctc==null||currentctc=="")
{
$("#errorMsg25").html("please enter your current ctc");
return false;
}

//else if(expectedctc==null||expecteddctc=="")
//{
//$("#errorMsg24").html="please enter your expected ctc";
//return false;
//}
else if(bank==null||bank=="")
	{
	$("#errorMsg26").html("please enter bank name");
	return false;
	}
else if(accno==null||accno=="")
	{
	$("#errorMsg27").html("please enter bankaccountnumber");
	return false;
	}
else if(ifsc==null||ifsc=="")
	{
	$("#erroeMsg28").html("please enter ifsc code");
	return false;
	}



else
return true;
}

function clearForm2()
{
$("#errorMsg").html="";
$("#errorMsg1").html="";
$("#errorMsg2").html="";
$("#errorMsg3").html="";
$("#errorMsg4").html="";
$("#errorMsg5").html="";
$("#errorMsg6").html="";
$("#errorMsg7").html="";
$("#errorMsg8").html="";
$("#errorMsg9").html="";
$("#errorMsg10").html="";
$("#errorMsg11").html="";
$("#errorMsg12").html="";
$("#errorMsg13").html="";
$("#errorMsg14").html="";
$("#errorMsg15").html="";
$("#errorMsg16").html="";
$("#errorMsg17").html="";
$("#errorMsg18").html="";
$("#errorMsg19").html="";
$("#errorMsg20").html="";
$("#errorMsg21").html="";
$("#errorMsg22").html="";
$("#errorMsg23").html="";
$("#errorMsg24").html="";
$("#errorMsg25").html="";
$("#errorMsg26").html="";
$("#errorMsg27").html="";
$("#errorMsg28").html="";
}


function loginValidation()
{
var employeeId=$("#loginId").val();
var mobileNumber=$("#Password").val();
var type=$("#type").val();
if(employeeId==null||employeeId=="")
{
$("#errorMsg").html("please enter EmployeeId");
return false;
}
else if(mobileNumber==null||mobileNumber=="")
{
$("#errorMsg1").html("please enter Password");
return false;
}
else if(type==null||type=="Enter Given Type")
   {
   $("#errorMsg2").html("Enter Given Type");
   return false;
   }

else
return true;
}
function clearForm1()
{
$("#errorMsg").hide();
$("#errorMsg1").hide();
$("#errorMsg2").hide();
}
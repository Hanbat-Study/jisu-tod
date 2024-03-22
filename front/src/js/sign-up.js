function init() {
  var signUpBtn = document.getElementById("signUpBtn");

  signUpBtn.onclick = signUp;
}

function signUp(e) {
  var signUpDataElements = e.target.parentNode.children;
  var signUpData = {};

  signUpData["name"] = signUpDataElements[0].value;

  var genderRadioElements = signUpDataElements[1].children;
  if (genderRadioElements[1].checked === true) {
    signUpData["gender"] = genderRadioElements[1].value;
  } else {
    signUpData["gender"] = genderRadioElements[3].value;
  }

  signUpData["birthday"] = signUpDataElements[2].children[1].value;
  signUpData["hometown"] = signUpDataElements[3].children[1].value;
  signUpData["id"] = signUpDataElements[4].value;
  signUpData["password"] = signUpDataElements[5].value;

  valid(signUpData);
}

function valid(signUpData) {
  
}

init();

var userIdxCnt = 0;

function init() {
  var signUpBtn = document.getElementById("signUpBtn");
  
  var temp = window.localStorage.getItem("userIdxCnt");
  if(temp !== null) {
    userIdxCnt = parseInt(temp);
  }
  
  var signUpForm = document.getElementById("signup");
  signUpForm.addEventListener("change", () => {
    var signUpData = getSignUpData(signUpBtn);
    if(valid(signUpData)) {
      signUpBtn.disabled = false;
      signUpBtn.addEventListener("click", () => signUp(signUpData));
    }
    else{
      signUpBtn.disabled = true;
    }
  });

}

function getSignUpData(signUpBtn) {
  var signUpDataElements = signUpBtn.parentNode.children;
  var signUpData = {};

  signUpData["name"] = signUpDataElements[0].value;

  var genderRadioElements = signUpDataElements[1].children;
  if (genderRadioElements[1].checked === true) {
    signUpData["gender"] = genderRadioElements[1].value;
  } else {
    signUpData["gender"] = genderRadioElements[3].value;
  }

  signUpData["birth"] = signUpDataElements[2].children[1].value;
  signUpData["hometown"] = signUpDataElements[3].children[1].value;
  signUpData["loginId"] = signUpDataElements[4].value;
  signUpData["password"] = signUpDataElements[5].value;

  return signUpData;
}

function signUp(signUpData) {
  window.localStorage.setItem("user" + userIdxCnt, JSON.stringify(signUpData));
  window.localStorage.setItem("userIdxCnt", JSON.stringify(++userIdxCnt));

  window.location.assign("/");
}

function valid(signUpData) {
  if(signUpData.name.trim() === "") {
    return false;
  }

  if(signUpData.birth === "") {
    return false;
  }

  if(signUpData.loginId === "" || /[a-zA-Z0-9]@[a-zA-Z].[a-zA-Z]/.exec(signUpData.loginId) === null) {
    return false;
  }

  if(signUpData.password.length < 8) {
    return false;
  }

  return true;
}

init();

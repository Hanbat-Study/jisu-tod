import { setCookie } from "./cookies";

function init() {
  var signInBtn = document.getElementById("signInBtn");

  signInBtn.onclick = (e) => {
    var signInElements = e.target.parentNode.children;
    var idData = signInElements[0].value;
    var pwData = signInElements[1].value;

    if (valid(idData, pwData) === true) {
      setCookie("loginToken", 1);
      window.location.assign("");
    } else {
    }
  };
}

function valid() {}

init();

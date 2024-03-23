import { setCookie } from "./cookies.js";

function init() {
  var signInBtn = document.getElementById("signInBtn");

  signInBtn.onclick = (e) => {
    var signInElements = e.target.parentNode.children;
    var idData = signInElements[0].value;
    var pwData = signInElements[1].value;

    if (valid(idData, pwData) === true) {
      setCookie("loginToken", 1);
      window.location.assign("/");
    } else {
      alert("아이디 또는 비밀번호가 잘못되었습니다.");
    }
  };
}

function valid(idData, pwData) {
  var temp = window.localStorage.getItem("userIdxCnt");
  if(temp === null) {
    return false;
  }
  
  var userIdxCnt = parseInt(temp);
  for(var i = 0; i < userIdxCnt; i++) {
    var userData = JSON.parse(window.localStorage.getItem("user" + i));
    if(userData === null) {
      continue;
    }

    if(userData["loginId"] === idData && userData["password"] === pwData) {
      return true;
    }
  }

  return false;
}

init();

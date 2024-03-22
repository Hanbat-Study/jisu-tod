import { setCookie } from "./cookies";

function init() {
  var signInBtn = document.getElementById("signInBtn");

  signInBtn.onclick = (e) => {
    var signInElements = e.target.parentNode.children;
    var idData = signInElements[0].value;
    var pwData = signInElements[1].value;

    if (valid(idData, pwData) === true) {
      setCookie("loginToken", 1);
      window.location.assign("../todo.html");
    } else {
      alert("아이디 또는 비밀번호가 잘못되었습니다.");
    }
  };
}

function valid(idData, pwData) {
  window.localStorage.getItem()
}

init();

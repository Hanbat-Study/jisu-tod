import { getCookie } from "./cookies.js";

function init() {
  var url = window.location.href;

  var loginToken = getCookie("loginToken");
  if (loginToken === "") {
    url += "src/sign-in.html";
  } else {
    url += "src/todo.html";
  }

  document.getElementsByTagName("meta")[0].setAttribute("content", "0;url=" + url);
}

init();

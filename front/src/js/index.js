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

// function getCookie(cName) {
//   var cookies = decodeURIComponent(document.cookie).split(";");
//   for (var i = 0; i < cookies.length; i++) {
//     var cookie = cookies[i].trim();

//     if (cookie.indexOf(cName) === 0) {
//       return cookie.substring(cName.length, cookie.length);
//     }
//   }
//   return "";
// }

init();

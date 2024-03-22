function setCookie(cName, exhours) {
  const cValue =
    "eyJpc0xvZ2luIjp0cnVlLCJ0eXBlIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.sLC9uaPTSFGzcoWSNe91b505maoXtnHzhPI3-WbuWnc";
  const date = new Date();
  date.setTime(date.getTime() + exhours * 60 * 60 * 1000);

  var expires = "expires=" + date.toUTCString();
  document.cookie = cName + "=" + cValue + ";" + expires + ";path=/";
}

function getCookie(cName) {
  var cookies = decodeURIComponent(document.cookie).split(";");
  for (var i = 0; i < cookies.length; i++) {
    var cookie = cookies[i].trim();

    if (cookie.indexOf(cName) === 0) {
      return cookie.substring(cName.length, cookie.length);
    }
  }
  return "";
}

export { setCookie, getCookie };

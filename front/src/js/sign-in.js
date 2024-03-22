function init() {
  var signInBtn = document.getElementById("signInBtn");

  signInBtn.onclick = (e) => {
    var signInElements = e.target.parentNode.children;
    var idData = signInElements[0].value;
    var pwData = signInElements[1].value;
    console.log("id : " + idData + " password : " + pwData);
  };
}

init();

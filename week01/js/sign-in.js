function init() {
    var signInBtn = document.getElementById("signInBtn");

    signInBtn.onclick = (e) => {
        var signInElements = e.target.parentNode.children;
        var idData = signInElements[0].value;
        var pwData = signInElements[1].value;
        console.log("id : " + idData + " password : " + pwData);
    };

    var signUpLink = document.getElementsByClassName("sign-up-link")[0];
    signUpLink.onclick = () => {
        console.log("회원가입 페이지로 이동");
    }
}

init();
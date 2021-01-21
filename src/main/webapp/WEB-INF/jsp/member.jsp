<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>회원가입하기</title>
</head>
<body>
<h1>회원가입하기</h1>
<form name="mbfrm" method="post" action="/memberok">
    <div>아이디 <input name="userid" type="text"></div>
    <div>비밀번호 <input name="passwd" type="password"></div>
    <div>이름 <input name="name" type="text"></div>
    <div><button type="submit">입력완료</button>
        <button type="reset">다시입력</button></div>

</form>
</body>
</html>

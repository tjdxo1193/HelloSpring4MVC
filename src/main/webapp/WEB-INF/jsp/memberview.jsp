<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>회원상세조회</title>
</head>
<body>
<h1>회원상세조회</h1>
<p>번호 : ${sj.sjno}</p>
<p>이름 : ${sj.name}</p>
<p>국어 : ${sj.kor}</p>
<p>영어 : ${sj.eng}</p>
<p>수학 : ${sj.mat}</p>
<hr>
<p>총점 : ${sj.tot}</p>
<p>평균 : ${sj.mean}</p>
<p>학점 : ${sj.grd}</p>
<p>등록일 : ${sj.regdate}</p>
</body>
</html>

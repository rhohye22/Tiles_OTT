<%@page import="ITzy.OTT.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q&A</title>

<%
MemberDto login = (MemberDto)session.getAttribute("login");
if (login == null) {
%>

<script>
	alert('로그인 해 주십시오');
	location.href = "login.do";
</script>
<%
}
%>

</head>
<body>

<p>건의사항 및 질문</p>
<a href="qnawrite.do">질문하기</a>

</body>
</html>
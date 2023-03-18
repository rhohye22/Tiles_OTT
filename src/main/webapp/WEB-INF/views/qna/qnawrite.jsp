<%@page import="ITzy.OTT.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q&A write</title>


<%
MemberDto login = (MemberDto) session.getAttribute("login");
if (login == null) {
%>
<script>
	alert('로그인 해 주십시오');
	location.href = "login.jsp";
</script>
<%
}
%>

</head>
<body>
	<h2>Q&A등록</h2>

	<form action="qnawriteAf.do" method="post">

		<table border="1">
			<tr>
				<th>아이디</th>
				<td><%=login.getId()%> <input type="hidden" name="id" value="<%=login.getId()%>"></td>
			</tr>
			<tr>
				<th>건의유형</th>
				<td><select id=qtype name=qtype>
						<option value='일반질문'>일반질문</option>
						<option value='회원문의'>회원문의</option>
						<option value='공고문의'>공고문의</option>
						<option value='오류신고'>오류신고</option>
				</select></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" size="80" id="title" name="title">
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="20" cols="80" id="content" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">질문등록</button>
				</td>
			</tr>

		</table>

	</form>



</body>
</html>
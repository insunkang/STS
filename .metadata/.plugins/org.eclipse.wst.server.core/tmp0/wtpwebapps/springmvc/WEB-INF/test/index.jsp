<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1><a href="/springmvc/test.do">테스트 컨트롤러 요청하기 </a></h1>
	<form method="post" action="/springmvc/search.do">
		검색어:<input type="text" name="search">
		<input type="submit" value="검색">
	</form>
	
</body>
</html>
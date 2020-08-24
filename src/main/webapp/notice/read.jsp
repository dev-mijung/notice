<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<tr>
	 <td>번호</td>
	 <td>제목</td>
	 <td>작성자</td>
	 <td>조회수</td>
	</tr>
	<tr>
	 <td>${noticeVO.boardno }</td>
	 <td>${noticeVO.title }</td>
	 <td>${noticeVO.mname }</td>
	 <td></td>
	</tr>
</body>
</html>
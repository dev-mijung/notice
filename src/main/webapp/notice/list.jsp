<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, width=device-width" /> 
<title>게시판</title>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 
</head>
<body>
<jsp:include page="/menu/top.jsp" flush='false' />
<table border = "1" style='width: 70%;'>
      <colgroup>
        <col style="width: 10%;"></col>
        <col style="width: 20%;"></col>
        <col style="width: 50%;"></col>
        <col style="width: 15%;"></col>
      </colgroup>
      <%-- table 컬럼 --%>
      <thead>
        <tr>
          <th style='text-align: center;'>번호</th>
          <th style='text-align: center;'>제목</th>
          <th style='text-align: center;'>작성자</th>
          <th style='text-align: center;'>조회수</th>
        </tr>
      </thead>
      
      <%-- table 내용 --%>
      <tbody>
        <c:forEach var="member_Notice_VO" items="${list }">
          <c:set var="boardno" value="${member_Notice_VO.boardno }" />
          <c:set var="title" value="${member_Notice_VO.title }" />
          <c:set var="cnt" value="${member_Notice_VO.cnt }" />
          <c:set var="m_mname" value="${member_Notice_VO.m_mname }" />
          
          <tr> 
            <td style='text-align: center;'>${boardno}</td>
            <td style='text-align: center;'>
              <a href="./read.do?boardno=${boardno }">${title}</a>
            </td>
            <td style='text-align: center;'>${m_mname }</td>
            <td style='text-align: center;'>${cnt}</td>
          </tr>
        </c:forEach>
        
      </tbody>
    </table>
    <div style="text-align: center; margin-top: 2%; margin-right: 20%;">
      <button type='button' onclick="location.href='./create.do'">글쓰기</button>
    </div>
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
<script type="text/javascript">
// 비밀번호 확인
  function popup(){
    window.name="parentForm";
    window.open("./passwdck.jsp",
        "chkForm", "width=400, height=10, resizable = no, scrollbars = no, toolbar=no, status=no, menubar=no, location=no");  
  
  	if($('#board_passwd',frm).val()!=''){
  		
  	}
  }
</script> 
</head>
<body>
 <table border="1" style='width: 70%;'>
  <tr>
   <td>번호</td>
   <td>제목</td>
   <td>작성자</td>
   <td>조회수</td>
  </tr>
  
   
  <tr>
   <td>${noticeVO.boardno }</td>
   <td>${noticeVO.title }</td>
   <td>${memberVO.mname }</td>
   <td>${cnt}</td>
  </tr>
  <tr>
    <td colspan="4">
      <textarea cols=100  rows=10 style="overflow-x:hidden; overflow-y:auto">${noticeVO.content }</textarea>
  </tr>

 </table>
 <div>
  <button type="button" onclick="popup()">비밀번호 설정</button>
  <input type="hidden" id="board_passwd">
 </div>
</body>
</html>
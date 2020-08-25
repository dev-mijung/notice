<%@ page contentType="text/html; charset=UTF-8" %>
 
<!DOCTYPE html> 
<html lang="ko"> 
<head> 
<meta charset="UTF-8"> 
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, width=device-width" /> 
<title>글쓰기</title>
 
<script type="text/JavaScript"
          src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 

<script type="text/javascript">
// 비밀번호 확인
  function popup(){
    window.name="parentForm";
    window.open("./passwdck.jsp",
        "chkForm", "width=400, height=10, resizable = no, scrollbars = no, toolbar=no, status=no, menubar=no, location=no");  
  }
</script> 
</head> 
 
<body>
<jsp:include page="/menu/top.jsp" flush='false' />
  <div style='text-align: center;'>
   	글쓰기
  </div>
    <form name='frm' method='POST' action='./create.do' class="form-horizontal">
      <table border="1" style='width: 70%;'>  
        <colgroup>
        <col style="width: 20%;"></col>
        <col style="width: 80%;"></col>
      </colgroup>
      
			  <tr>
			    <td>제목 </td>
			    <td><input type="text" name="title" style="width:96%;"></td>
			  </tr>
			  <tr>
			    <td>내용 </td>
			    <td>
			      <textarea cols=100  rows=10 name="content" style="overflow-x:hidden; overflow-y:auto"></textarea>
			   </td>
			  </tr>
			  <tr>
			    <td colspan="2">
			      <button type="button" onclick="popup()">비밀번호 설정</button> 
			      ${ck_id_save == 'Y' ? "checked='checked'" : "" }
			    </td>
			  <tr>
			</table>
      	<div style='text-align: center;'>
        <button type="submit">저장</button>
        <button type="button" onclick='./list.do'>취소</button>
      </div>
    </form>
  </body>
</html>

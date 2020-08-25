<%@ page contentType="text/html; charset=UTF-8" %>
 
<!DOCTYPE html> 
<html lang="ko"> 
<head> 
<meta charset="UTF-8"> 
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, width=device-width" /> 
<title>비밀번호 확인</title>
<script type="text/JavaScript"
          src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

  $(function(){ // 자동실행
    	$('#btn_send').on('click',getParentText);
   }); 

  function getParentText(){ 
    if ($('#board_passwd_1').val() != $('#board_passwd_2').val()) { 
      alert('패스워드가 일치하지 않습니다. \n 다시 입력해주세요.')
      return false; 
    }
    opener.document.getElementById("board_passwd").value = document.getElementById("board_passwd_1").value
    /* $('#frm').submit(); */
    window.close();
 }
</script>
</head> 
 
<body>
  <form name='frm' id='frm' method='POST' action='./passwdck.do'>
   <input type='hidden' name='boardno' id='boardno' value='${param.boardno }'>          
   <table border="1"> 
  <tr>
    <td>비밀번호 : </td>
    <td><input type="password" name="board_passwd_1" id="board_passwd_1"></td>
    <td rowspan="2">
      <button type='button' id="btn_send" style="WIDTH: 40pt; HEIGHT: 40pt;">저장</button>
    </td>
  </tr>
  <tr>
    <td>비밀번호 재입력 : </td>
    <td><input type="password" name="board_passwd_2" id="board_passwd_2"></td>
  </tr>
</table>
</form>
</body>
</html>
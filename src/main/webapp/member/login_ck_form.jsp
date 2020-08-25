<%@ page contentType="text/html; charset=UTF-8" %>
 
<!DOCTYPE html> 
<html lang="ko"> 
<head> 
<meta charset="UTF-8"> 
<meta name="viewport" content="user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, width=device-width" /> 
<title>로그인 처리</title>
 
 
<script type="text/JavaScript"
          src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
<script type="text/javascript" src="../js/jquery.cookie.js"></script>

<script type="text/javascript">
  function loadDefault() {
    $('#id').val('user1');
    $('#passwd').val('1234');
  }
</script> 

</head> 
 
<body>
 
 
<DIV style='width: 80%; margin: 0px auto;'>
  <FORM name='frm' method='POST' action='./login.do'>
   <table border="1" style='width: 30%;'>
    <tr>
    <td>ID </td>
    <td><input type='text' name='id' id='id' 
                   value='${ck_id }' required="required" 
                   style="width:96%;
    			autofocus="autofocus">
          <input type='checkbox' name='id_save' value='Y' 
                    ${ck_id_save == 'Y' ? "checked='checked'" : "" }> 저장
    </td>
    <td rowspan="3">
      <button type='submit' style="WIDTH: 60pt; HEIGHT: 60pt">로그인</button>
    </tr>
        
 
    <tr>
    <td>PW </td>
    <td>
      <input type="password" name="passwd" style="width:96%;">
          <input type='checkbox' name='passwd_save' value='Y' 
                    ${ck_passwd_save == 'Y' ? "checked='checked'" : "" }> 저장
        </td>
      </tr>
    </table>
  </FORM>
</DIV>
 
</body>
 
</html>


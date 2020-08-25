<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
<form name='frm' id='frm' action='./login.do'>
 <table border="1" style='width: 30%;'> 
  <tr>
    <td>ID </td>
    <td><input type="text" name="id" id="id" required="required" style="width:96%;
    			autofocus="autofocus">
    </td>
    <td rowspan="3">
      <button type='submit' style="WIDTH: 60pt; HEIGHT: 60pt">로그인</button>
  </tr>
  <tr>
    <td>PW </td>
    <td>
      <input type="password" name="passwd" style="width:96%;">
   </td>
  </tr>
  <tr>
    <td colspan="2">
      <label>
        <input type='checkbox' name='id_passwd_save' value='Y'
        	   ${id_passwd_save == 'Y' ? "checked='checked'" : "" }> 
      	로그인유지
      </label>
    </td>
  </tr>
 </table>
</form>
</body>
</html>
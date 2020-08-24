<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
	*{ font-family: Malgun Gothic; font-size: 26px;}
</style>
<script type="text/JavaScript"
          src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
</script>

</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td><input type='text' name='id' id='id'></td>
			<td rowspan=3><button type='submit'>로그인</button></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type='password' name='passwd' id='passwd'></td>
		</tr>
		<tr>
			<td colsapn=2>로그인유지</td>
		</tr>
		
	</table>
</body>
</html>
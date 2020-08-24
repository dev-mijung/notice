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
/* 	$(function() {
		$('#passwd_btn').on('click', passwd_btn); 
	}
	
	function passwd_btn(){
		
	} */
</script> 
</head> 
 
<body>
 
  <DIV style='text-align: center;'>
   글쓰기
  </DIV>
 
  <DIV style='width: 100%;'>
    <FORM name='frm' method='POST' action='./create.do' class="form-horizontal">
               
                     제목 <input type='text' class="form-control" name='title' value='' required="required" style='width: 80%;'>
     	 <hr>
      
                     내용 <textarea class="form-control" name='content' id='content' rows='6' col='100'></textarea>
      	<hr>
      
       	 <button type='button' id='passwd_btn' style='text-align: right;'>
       	 		비밀번호 설정</a></button>          
    	 <hr> 
      
      <DIV style='text-align: center;'>
        <button type="submit">저장</button>
        <button type="button" onclick='./list.do'>취소</button>
      </DIV>
       
    </FORM>
  </DIV>
  
</body>
 
</html>


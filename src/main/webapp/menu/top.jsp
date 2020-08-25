<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% 
// String root = request.getContextPath(); // /resort 
// ${pageContext.request.contextPath}
%>
<c:set var="root" value="${pageContext.request.contextPath}" /> 

 	<c:choose>
        <c:when test="${sessionScope.id == null}">
          <A class='menu_link'  href='${root}/member/login.do' >Login</A> <span class='top_menu1'> | </span>
        </c:when>
        <c:otherwise>
          ID : ${sessionScope.id }님 로그인 중 입니다.
          <A class='menu_link'  href='${root}/member/logout.do' >Logout</A> <span class='top_menu1'> | </span>
        </c:otherwise>
     </c:choose>
    <c:choose>
        
        <%-- 로그인 한 경우 --%>
        <c:when test="${sessionScope.id != null || sessionScope.id_admin != null}">
          <A class='menu_link'  href='${root}/notice/list.do'>게시판</A><span class='top_menu_sep'>&nbsp;</span>    
        </c:when>
        <c:otherwise>
         	로그아웃 되었습니다.
        </c:otherwise>
      </c:choose>    
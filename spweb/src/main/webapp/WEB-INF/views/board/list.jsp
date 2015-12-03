<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            리스트 게시판 입니다. </h1>
           <ul>
            <c:forEach var="vo" items="${list}">
 				<li>${vo.bno} : 
 				<a href="/board/view?bno=${vo.bno}">${vo.title}</a> 
 				: ${vo.writer}</li>           
            </c:forEach>
            </ul>
          <hr>
          <a href="/board/create"><input type="submit" value="글쓰기"></a>
          
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>
		</div><!-- /.content-wrapper -->
        <!------------------------------ Main content -------------------------------->
   
      	

<%@include file="../include/footer.jsp" %>
<script>
</script>
  </body>
</html>
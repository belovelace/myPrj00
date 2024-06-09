<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" href="/app/resources/css/util/home.css">
</head>
<body>

<%@include file="/WEB-INF/view/layout/header.jsp" %>

<main>
    <div class="ad_00"></div>

    <div class="box">
      <div id="url00">
      <a href="http://127.0.0.1:8888/app/goods">Goods</a>
      <a href="../dsplay/display.html">display</a>
      <a href="http://127.0.0.1:8888/app/board/all">Board</a>
      </div>
      <div id="url01">
        <a href="../notice/notice.html">notice</a>
      </div>
    </div>

  <div class="ad_01"></div>
  </main>
  
<%@include file="/WEB-INF/view/layout/footer.jsp" %>

</body>
</html>
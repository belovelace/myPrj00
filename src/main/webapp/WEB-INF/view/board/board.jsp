<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/app/resources/css/board/board.css">
</head>
<body>

<%@include file="/WEB-INF/view/layout/header.jsp" %>

<main>
    <div></div>
    <div class="mid">
      <div class="menu">
        <button>all</button>
        <button>new</button>
        <button>write</button>
        <button>best</button>
      </div>

      <div class="list">
        <div id="key">
        <pre>no</pre>
        <pre>title</pre>
        <pre>date</pre>
        <pre>coment</pre>
      </div>
      <div id="value">
        <pre>1</pre>
        <pre>ajax가 들어가는 자리</pre>
        <pre>2024.06.08</pre>
        <pre>3</pre>
      </div>
      </div>
    </div>
    <div></div>
  </main>

</body>
</html>
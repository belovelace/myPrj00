<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/app/resources/css/board/boardInsert.css">
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

    <div class="write">
      <form>
      <input type="text" value="title">
      <input type="text" value="content">
      <input type="submit" value="submit">
     </form>
    </div>


  </div>
  <div></div>
</main>

</body>
</html>
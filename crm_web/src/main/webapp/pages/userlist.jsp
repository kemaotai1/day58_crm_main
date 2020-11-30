<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>userlist</title>
</head>
<body>
   <h3>遍历数据</h3>
   <table border="1" cellpadding="3" cellspacing="0">
       <tr>
           <th>序号</th>
           <th>姓名</th>
           <th>出生日期</th>
           <th>性别</th>
           <th>住址</th>
       </tr>

       <%--<fmt:formatDate value="${test}" pattern="yyyy-MM-dd　HH：mm"/>  --%>
       <c:forEach var="user" items="${list}" varStatus="vs">
           <tr>
               <td>${vs.count}</td>
               <td>${user.username}</td>
               <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd hh:mm"/></td>
               <td>${user.sex}</td>
               <td>${user.address}</td>
           </tr>
       </c:forEach>
   </table>
</body>
</html>

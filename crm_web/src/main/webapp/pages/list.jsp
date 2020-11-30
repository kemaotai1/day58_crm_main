<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
   <h3>遍历数据</h3>
   <table border="1" cellpadding="3" cellspacing="0">
       <tr>
           <th>序号</th>
           <th>账户编号</th>
           <th>用户编号</th>
           <th>账户余额</th>
       </tr>
       <%--
        items 表示遍历的集合，一次从page域、request域、session域、application域取值
        var   存储遍历集合的每一个元素
        varStatus 遍历的数据状态：可有获取当前遍历的是集合的第几个元素
            count 从1开始
            index 从0开始
       --%>
       <c:forEach var="account" items="${list}" varStatus="vs">
           <tr>
               <td>${vs.count}</td>
               <td>${account.accountid}</td>
               <td>${account.uid}</td>
               <td>${account.money}</td>
           </tr>
       </c:forEach>
   </table>
</body>
</html>

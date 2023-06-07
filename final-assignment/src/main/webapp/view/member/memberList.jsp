<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>vip 목록 전체 조회</h1>
<table>
    <tr>
        <th>vip코드</th>
        <th>vip명</th>
        <th>vip성별</th>
        <th>생년월일</th>
        <th>구분코드</th>
        <th>vip주소</th>
        <th>연락처</th>
        <th>등급코드</th>
        <th>활동상태</th>

    </tr>
    <c:forEach items="${ requestScope.memList }" var="mem">
        <tr>
            <td>${ mem.memberCode }</td>
            <td>${ mem.memberName }</td>
            <td>${ mem.memberGender }</td>
            <td>${ mem.birthDate }</td>
            <td>${ mem.divisionCode }</td>
            <td>${ mem.memberAddress }</td>
            <td>${ mem.contact }</td>
            <td>${ mem.gradeCode }</td>
            <td>${ mem.activeStatus }</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>

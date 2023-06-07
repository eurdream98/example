<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

vip코드 : ${ requestScope.selectedMem.memberCode }<br>
vip명 : ${ requestScope.selectedMem.memberName }<br>
vip성별 : ${ requestScope.selectedMem.memberGender }<br>
생년월일 : ${requestScope.selectedMem.birthDate}<br>
주소 : ${requestScope.selectedMem.memAddress}<br>
구분코드 : ${requestScope.selectedMem.divisionCode}<br>
연락처 : ${requestScope.selectedMem.cotatct}<br>
등급코드 : ${requestScope.selectedMem.gradeCode}<br>
활동상태 : ${requestScope.selectedMem.activeStatus}<br>
</body>
</html>

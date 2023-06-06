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

</body>
</html>

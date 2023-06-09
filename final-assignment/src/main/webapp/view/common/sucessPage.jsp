<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<script>
  (function() {
    const successCode = '${ requestScope.successCode }';

    let successMessage = '';
    let movePath = '';
    console.log(${pageContext.servletContext.contextPath});
    switch(successCode) {
      case 'insertMem' :
        successMessage = '신규 vip 등록 성공!';
        movePath = '${pageContext.servletContext.contextPath}/member/list';
        break;
      case 'updateMem' :
        successMessage = 'vip 정보 수정 성공!';
        movePath = '${pageContext.servletContext.contextPath}/member/list';
        break;
      case 'deleteMem' :
        successMessage = 'vip 정보 삭제 성공!';
        movePath = '${pageContext.servletContext.contextPath}/member/list';
        break;
    }

    alert(successMessage);
    location.href = movePath;

  })();
</script>
</body>
</html>
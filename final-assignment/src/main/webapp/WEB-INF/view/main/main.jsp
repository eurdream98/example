<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>
<h3>MEMBER_INFO 테이블에서 MEMBER_CODE를 이용하여 vip 정보 조회해오기</h3>
<form action="member/select">
  <label>조회할 코드 : </label>
  <input type="text" name="memberCode" id="memberCode">
  <button type="submit">조회하기</button>
</form>

<h3>MEMBER_INFO 테이블에서 vip 전체 정보 조회 (현재 소속된 vip만 조회할 것) : /member/list (get)</h3>
<button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">직원정보 전체 조회하기</button>

<h3>MEMBER_INFO 테이블에서 신규 직원 정보 추가 (필요한 정보를 입력받을 수 있는 form을 만들어서 추가할 것) : /member/insert (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/member/insert" method="post">
  vip코드 : <input type="text" name="memCode"><br>
  vip명 : <input type="text" name="memName"><br>
  vip성별 : <input type="text" name="memGender"><br>
  생년월일 : <input type="text" name="birthDate"><br>
  구분코드 : <input type="text" name="divisionCode"><br>
  주소 : <input type="text" name="memAddress"><br>
  전화번호 : <input type="text" name="concat"><br>
  등급코드 : <input type="text" name="gradeCode"><br>
  활동상태 : <input type="text" name="activeStatus"><br>


<%--  부서코드 :--%>
<%--  <select name="deptCode">--%>
<%--    <option value="D1">인사관리부</option>--%>
<%--    <option value="D2">회계관리부</option>--%>
<%--    <option value="D3">마케팅부</option>--%>
<%--    <option value="D4">국내영업부</option>--%>
<%--    <option value="D5">해외영업1부</option>--%>
<%--    <option value="D6">해외영업2부</option>--%>
<%--    <option value="D7">해외영업3부</option>--%>
<%--    <option value="D8">기술지원부</option>--%>
<%--    <option value="D9">총무부</option>--%>
<%--  </select>--%>
<%--  <br>--%>
<%--  직급코드 :--%>
<%--  <select name="jobCode">--%>
<%--    <option value="J1">대표</option>--%>
<%--    <option value="J2">부사장</option>--%>
<%--    <option value="J3">부장</option>--%>
<%--    <option value="J4">차장</option>--%>
<%--    <option value="J5">과장</option>--%>
<%--    <option value="J6">대리</option>--%>
<%--    <option value="J7">사원</option>--%>
<%--  </select>--%>
<%--  <br>--%>
<%--  급여등급 :--%>
<%--  <select name="salLevel">--%>
<%--    <option value="S1">S1</option>--%>
<%--    <option value="S2">S2</option>--%>
<%--    <option value="S3">S3</option>--%>
<%--    <option value="S4">S4</option>--%>
<%--    <option value="S5">S5</option>--%>
<%--    <option value="S6">S6</option>--%>
<%--  </select>--%>
<%--  <br>--%>
<%--  급여 : <input type="number" name="salary"><br>--%>
<%--  보너스율 : <input type="text" name="bonus"><br>--%>
<%--  관리자사번 : <input type="text" name="managerId"><br>--%>
<%--  입사일 : <input type="date" name="hireDate"><br>--%>
  <button type="submit">등록하기</button>
</form>

<h3>MEMBER_INFO 테이블에서 vip 정보 수정 (vip코드와 변경할 정보를 입력 받아 vip코드와 일치하는 ,vip의 정보 변경 - 원하는 데이터 변경) : /member/update (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/member/update" method="post">
  vip코드 : <input type="text" name="memberCode"><br>
  생년월일 : <input type="text" name="birthDate"><br>
  <button type="submit">vip 생년월일</button>
</form>

<h3>MEMBER_INFO 테이블에서 vip 정보 삭제 (vip코드 입력 받아 vip코드와 일치하는 행 삭제) : /member/delete (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/member/delete" method="post">
  vip코드 : <input type="text" name="memberCode"><br>
  <button type="submit">vip 정보 삭제</button>
</form>
</body>
</html>

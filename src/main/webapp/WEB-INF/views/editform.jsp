<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="post" action="../editok" method="post">
<input type="hidden" name="seq" value="${post.seq}"/>
<table>
	<tr><td>Category:</td><td><form:input type="text"  path="category"/></td></tr>
	<tr><td>Title:</td><td><form:input type="text" path="title"/></td></tr>
	<tr><td>Writer:</td><td><form:input type="text" path="writer" /></td></tr>
	<tr><td>Content:</td><td><form:textarea cols="50" rows="5" path="content"/></td></tr>
	<tr><td>Likes:</td><td><form:input type="number" path="cnt"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="location.href='../list'"/></td></tr>
</table>
</form:form>

</body>
</html>
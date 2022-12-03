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
<form action="../editok" method="post">
<input type="hidden" name="seq" value="${post.seq}"/>
<table>
	<tr><td>Category:</td><td><input type="text" name="category" value="${post.category}"/></td></tr>
	<tr><td>Title:</td><td><input type="text" name="title" value="${post.title}"/></td></tr>
	<tr><td>Writer:</td><td><input type="text" name="writer" value="${post.writer}" /></td></tr>
	<tr><td>Content:</td><td><textarea cols="50" rows="5" name="content">${post.content}</textarea></td></tr>
	<tr><td>Likes:</td><td><input type="number" name="cnt" value="${post.cnt}" /></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="location.href='../list'"/></td></tr>
</table>
</form>

</body>
</html>
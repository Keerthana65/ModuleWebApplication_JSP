<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Defect Modules:</h2>
<table>
<tr>
<th>ModuleID</th>
<th>ModuleName</th>
<th>Delete Action</th>
<th>Update Action</th>
</tr>
<c:forEach items="${Modules}" var="module">
<tr>
<td>${module.moduleid}</td>
<td>${module.modulename}</td>
<td><a href="deleteModule?moduleid=${module.moduleid}">Delete</a></td>
<td><a href="showUpdate?moduleid=${module.moduleid}">Update</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Module</a>
</body>
</html>
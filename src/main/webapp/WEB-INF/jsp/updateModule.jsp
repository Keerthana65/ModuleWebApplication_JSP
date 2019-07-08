<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Module</title>
</head>
<body>
<form action="updateMod" method="post">
<pre>
Module ID:<input type="text" name="moduleid" value="${module.moduleid}" /><br><br>
Module Name:<input type="text" name="modulename" value="${module.modulename}" /><br><br>
<input type="submit" value="save" />
</pre>

</form>

</body>
</html>
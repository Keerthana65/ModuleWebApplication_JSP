<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Module</title>
</head>
<body>
<form action="saveMod" method="post">
<pre>
Module ID:<input type="text" name="moduleid"><br><br>
Module Name:<input type="text" name="modulename"><br><br>
<input type="submit" value="Add" />
</pre>

</form>
${msg}

<a href="displayModule">View All</a>
</body>
</html>
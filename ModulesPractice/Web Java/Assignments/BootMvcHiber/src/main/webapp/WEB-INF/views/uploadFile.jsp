<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Page</title>
</head>
<body>
	
	<form:form action="fileUploaded" modelAttribute="fileToUpload" enctype="multipart/form-data">
		<input type="file" name="fileAttachment" />
		<form:button>Upload File</form:button>
	</form:form>
</body>
</html>
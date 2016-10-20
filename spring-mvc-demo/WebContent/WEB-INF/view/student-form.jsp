<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<h3>Student Registration Form</h3>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language:
		<br>
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>
		
		Favorite Operating System:
		<br>
		Linux: <form:checkbox path="operatingSystems" value="Linux" />
		Mac: <form:checkbox path="operatingSystems" value="Mac" />
		Windows: <form:checkbox path="operatingSystems" value="Windows" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
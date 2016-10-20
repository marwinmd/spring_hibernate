<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Page</title>
</head>
<body>
	<h3>Student confirmation </h3>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Favorite Language: ${student.favoriteLanguage}
	</body>
</html>
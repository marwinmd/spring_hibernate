<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Overview</title>
</head>
<body>

	List Customers - coming soon....

	<div id="container">

		<div id="container">

			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>

				<c:forEach var="tempCustomer" items="${customers}">
					<li>${tempCustomer.firstName}</li>
					<li>${tempCustomer.lastName}</li>
					<li>${tempCustomer.email}</li>
				</c:forEach>

			</table>

		</div>
	</div>
	<ul>
		<c:forEach var="temp" items="${custmer.operatingSystems}">
			<li>${temp}</li>

		</c:forEach>
	</ul>
</body>
</html>
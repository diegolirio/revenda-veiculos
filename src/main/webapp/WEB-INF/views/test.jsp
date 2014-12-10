<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html ng-app>
<head>

	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.1.4/angular.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/core/js/testController.js"></script>
	
</head>
<body ng-controller="testController">

	<input type="text" ng-model="user.name"/>
	<hr/>
	<h1>Hello {{user.name}}</h1>

</body>
</html>

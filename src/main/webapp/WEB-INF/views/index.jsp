<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html ng-app="app">
<head>

	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.1.4/angular.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/core/js/app.js"></script>
	
</head>
<body>

	
	<div ng-view></div>

</body>
</html>

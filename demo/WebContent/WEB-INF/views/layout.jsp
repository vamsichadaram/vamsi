<!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN" "http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
	<head>
		<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/simple-sidebar.css" />
<script
	src="${pageContext.request.contextPath}/resources/script/jquery-1.11.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/bootstrap.min.js"></script>
	</head>
	<body>
		<div id="wrapper">
    </div>
    <!-- /#wrapper -->
	    <div>
	        <tiles:insertAttribute name="menu"></tiles:insertAttribute>
	        <tiles:insertAttribute name="body"></tiles:insertAttribute>
	    </div>
	    <div>
	        <tiles:insertAttribute name="footer">
	        </tiles:insertAttribute>
	    </div>
	</body>
</html>
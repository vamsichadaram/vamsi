<!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN" "http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
	<head>
	</head>
	<body>
	    <div>
	        <tiles:insertAttribute name="header">
	        </tiles:insertAttribute>
	    </div>
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
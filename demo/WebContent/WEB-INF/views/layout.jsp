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
	
	<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="//code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Morris chart -->
        <link href="${pageContext.request.contextPath}/resources/css/morris/morris.css" rel="stylesheet" type="text/css" />
        <!-- jvectormap -->
        <link href="${pageContext.request.contextPath}/resources/css/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
        <!-- Date Picker -->
        <link href="${pageContext.request.contextPath}/resources/css/datepicker/datepicker3.css" rel="stylesheet" type="text/css" />
        <!-- Daterange picker -->
        <link href="${pageContext.request.contextPath}/resources/css/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap wysihtml5 - text editor -->
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="${pageContext.request.contextPath}/resources/css/AdminLTE.css" rel="stylesheet" type="text/css" />
	
	</head>
	<%-- <body>
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
	</body> --%>
	
	<body class="skin-blue">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
		<div class="wrapper row-offcanvas row-offcanvas-left">
			<tiles:insertAttribute name="menu"></tiles:insertAttribute>
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
		
		 <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.min.js" type="text/javascript"></script>
        <!-- Morris.js charts -->
        <script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/script/plugins/morris/morris.min.js" type="text/javascript"></script>
        <!-- Sparkline -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
        <!-- jvectormap -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resources/script/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
        <!-- jQuery Knob Chart -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/jqueryKnob/jquery.knob.js" type="text/javascript"></script>
        <!-- daterangepicker -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
        <!-- datepicker -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/datepicker/bootstrap-datepicker.js" type="text/javascript"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
        <!-- iCheck -->
        <script src="${pageContext.request.contextPath}/resources/script/plugins/iCheck/icheck.min.js" type="text/javascript"></script>

        <!-- AdminLTE App -->
        <script src="${pageContext.request.contextPath}/resources/script/AdminLTE/app.js" type="text/javascript"></script>

        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="${pageContext.request.contextPath}/resources/script/AdminLTE/dashboard.js" type="text/javascript"></script>

        <!-- AdminLTE for demo purposes -->
        <script src="${pageContext.request.contextPath}/resources/script/AdminLTE/demo.js" type="text/javascript"></script>
		
	</body>
</html>
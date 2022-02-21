<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bulletin Board</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
  href='<c:url value="/resources/plugins/fontawesome-free/css/all.min.css"/>'>
<link rel="stylesheet"
  href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet"
  href='<c:url value="/resources/css/adminlte.min.css"/>'>
<link rel="stylesheet" href='<c:url value="/resources/css/common.css"/>'>
<link
  href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
  rel="stylesheet">
<script src="<c:url value="/resources/plugins/jquery/jquery.min.js"/>"></script>
<script
  src="<c:url value="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<body class="hold-transition sidebar-mini">
  <div class="wrapper">
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="body" />
  </div>
</body>
<tiles:insertAttribute name="javascript" ignore="true" />
</html>
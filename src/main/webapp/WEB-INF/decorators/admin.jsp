<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<c:url value="/" var="URL"></c:url>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<meta name="keywords" content="MediaCenter, Template, eCommerce">
<meta name="robots" content="all">
<title>ZElecShop - Admin Management</title>


<link rel="stylesheet" href="${URL}assets/css/bootstrap.min.css">


<link rel="stylesheet" href="${URL}assets/css/main.css">
<link rel="stylesheet" href="${URL}assets/css/blue.css">
<link rel="stylesheet" href="${URL}assets/css/owl.carousel.css">
<link rel="stylesheet" href="${URL}assets/css/owl.transitions.css">
<link rel="stylesheet" href="${URL}assets/css/animate.min.css">
<link rel="stylesheet" href="${URL}assets/css/rateit.css">
<link rel="stylesheet" href="${URL}assets/css/bootstrap-select.min.css">

<!-- Icons/Glyphs -->
<link rel="stylesheet" href="${URL}assets/css/font-awesome.css">

<!-- Fonts -->
<link href="https://fonts.googleapis.com/css?family=Barlow:200,300,300i,400,400i,500,500i,600,700,800" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Roboto:300,400,500,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,600italic,700,700italic,800' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
</head>
<body>

<%@ include file="/common/admin/header.jsp" %>


<div class="body-content outer-top-vs" id="top-banner-and-menu">
	<div class="container">
		<div class="row">
			<!-- ============================================== SIDEBAR ============================================== -->
			<div class="col-xs-12 col-sm-12 col-md-3 sidebar">

				<!-- ================================== TOP NAVIGATION ================================== -->
				<div class="side-menu animate-dropdown outer-bottom-xs">
					<div class="head">
						<i class="icon fa fa-align-justify fa-fw"></i> Admin management
					</div>
					<nav class="yamm megamenu-horizontal">
						<ul class="nav">
							<li class="dropdown menu-item active"><a href="#"><i
									class="icon fa fa-shopping-bag" aria-hidden="true"></i>General
									Report</a>
							<li class="dropdown menu-item"><a href="${pageContext.request.contextPath}/admin/categories"><i
									class="icon fa fa-shopping-bag" aria-hidden="true"></i>Categories</a>
							<li class="dropdown menu-item"><a href="${pageContext.request.contextPath}/admin/accounts"><i
									class="icon fa fa-laptop" aria-hidden="true"></i>Accounts</a>
							<li class="dropdown menu-item"><a href="${pageContext.request.contextPath}/admin/products"><i
									class="icon fa fa-paw" aria-hidden="true"></i>Products</a>
							<li class="dropdown menu-item"><a href="${pageContext.request.contextPath}/admin/posts"><i
									class="icon fa fa-shopping-bag" aria-hidden="true"></i>Posts</a></li>
							<li class="dropdown menu-item"><a href="${pageContext.request.contextPath}/admin/profile"><i
									class="icon fa fa-user" aria-hidden="true"></i>My Profile</a></li>
						</ul>
					</nav>
				</div>
			</div>
			
			<sitemesh:write property="body"/>
			
		</div>
	</div>
</div>


<%@ include file="/common/admin/footer.jsp" %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<div class="col-xs-12 col-sm-12 col-md-3 sidebar">

	<!-- ================================== TOP NAVIGATION ================================== -->
	<div class="side-menu animate-dropdown outer-bottom-xs">
		<div class="head">
			<i class="icon fa fa-align-justify fa-fw"></i> Admin management
		</div>
		<nav class="yamm megamenu-horizontal">
			<ul class="nav">
				<li class="dropdown menu-item active"><a href="#"><i
						class="icon fa fa-bar-chart" aria-hidden="true"></i>General Report</a>
				<li class="dropdown menu-item"><a
					href="${pageContext.request.contextPath}/admin/genres"><i
						class="icon fa fa-columns" aria-hidden="true"></i>Categories</a>
				<li class="dropdown menu-item"><a
					href="${pageContext.request.contextPath}/admin/accounts"><i
						class="icon fa fa-id-card" aria-hidden="true"></i>Accounts</a>
				<li class="dropdown menu-item"><a
					href="${pageContext.request.contextPath}/admin/products"><i
						class="icon fa fa-shopping-bag" aria-hidden="true"></i>Products</a>
				<li class="dropdown menu-item"><a
					href="${pageContext.request.contextPath}/admin/posts"><i
						class="icon fa fa-file-text" aria-hidden="true"></i>Posts</a></li>
				<li class="dropdown menu-item"><a
					href="${pageContext.request.contextPath}/admin/profile"><i
						class="icon fa fa-user" aria-hidden="true"></i>My Profile</a></li>
			</ul>
		</nav>
	</div>
</div>
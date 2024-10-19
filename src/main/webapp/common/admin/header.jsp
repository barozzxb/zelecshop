<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<header class="header-style-1">
	<!-- TopMenu -->
	<div class="top-bar animate-dropdown">
		<div class="container">
			<div class="header-top-inner">
				<div class="cnt-account">
					<ul class="list-unstyled">
						<li class="header_cart hidden-xs"><a
							href="${pageContext.request.contextPath}/admin/profile"><span>My
									Account</span></a></li>

						<c:choose>
							<c:when test="${sessionScope.account != null}">
								<a href="${pageContext.request.contextPath}/admin/profile">
									<c:choose>
										<c:when test="${sessionScope.account.name == null}">
										${sessionScope.account.userid}
									</c:when>
										<c:otherwise>
										${sessionScope.account.name}
									</c:otherwise>
									</c:choose>
								</a>
								<a href="${pageContext.request.contextPath }/logout">Đăng
									Xuất</a>
							</c:when>
						</c:choose>
					</ul>
				</div>
				<div class="cnt-block">
					<ul class="list-unstyled list-inline">
						<li class="dropdown dropdown-small"><a href="#"
							class="dropdown-toggle" data-hover="dropdown"
							data-toggle="dropdown"><span class="value">USD </span><b
								class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">USD</a></li>
								<li><a href="#">VND</a></li>
							</ul></li>
						<li class="dropdown dropdown-small lang"><a href="#"
							class="dropdown-toggle" data-hover="dropdown"
							data-toggle="dropdown"><span class="value">English </span><b
								class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">English</a></li>
								<li><a href="#">Vietnamese</a></li>
							</ul></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--End TopMenu -->
	<div class="main-header">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-3 logo-holder">
					<!-- Logo-->
					<div class="logo">
						<a href="#"> <img src="${URL}assets/images/logo.png"
							alt="logo">
						</a>
					</div>
					<!-- End logo -->
				</div>
				<div class="col-lg-7 col-md-6 col-sm-8 col-xs-12 top-search-holder">
					<!-- Search -->
					<div class="search-area">
						<form>
							<div class="control-group">
								<ul class="categories-filter animate-dropdown">
									<li class="dropdown"><a class="dropdown-toggle"
										data-toggle="dropdown" href="category.html">Categories <b
											class="caret"></b></a>
										<ul class="dropdown-menu" role="menu">
											<li class="menu-header">Computer</li>
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="category.html">- Clothing</a></li>
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="category.html">- Electronics</a></li>
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="category.html">- Shoes</a></li>
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="category.html">- Watches</a></li>
										</ul></li>
								</ul>
								<input class="search-field" placeholder="Search here..." /> <a
									class="search-button" href="#"></a>
							</div>
						</form>
					</div>
					<!-- end search -->
				</div>

			</div>

		</div>

	</div>


	<div class="clearfix"></div>

</header>
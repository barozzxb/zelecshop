<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<div class="col-xs-12 col-sm-12 col-md-3 sidebar">

	<!-- ================================== TOP NAVIGATION ================================== -->
	<div class="side-menu animate-dropdown outer-bottom-xs">
		<div class="head">
			<i class="icon fa fa-align-justify fa-fw"></i> Sidebar customize
		</div>
		<nav class="yamm megamenu-horizontal">
			<ul class="nav">
				<c:forEach items="${genres}" var="g">
					<li class="dropdown menu-item active"><a href="#"><i
						class="icon fa fa-columns" aria-hidden="true"></i>${g.gname}</a>
				</c:forEach>
				
<!-- 				<li class="dropdown menu-item active"><a href="#"><i -->
<!-- 						class="icon fa fa-bar-chart" aria-hidden="true"></i>Detail 1</a> -->
<!-- 				<li class="dropdown menu-item"><a -->
<%-- 					href="${pageContext.request.contextPath}/home"><i --%>
<!-- 						class="icon fa fa-columns" aria-hidden="true"></i>Detail 2</a> -->
<!-- 				<li class="dropdown menu-item"><a -->
<%-- 					href="${pageContext.request.contextPath}/home"><i --%>
<!-- 						class="icon fa fa-id-card" aria-hidden="true"></i>Detail 3</a> -->
<!-- 				<li class="dropdown menu-item"><a -->
<%-- 					href="${pageContext.request.contextPath}/home"><i --%>
<!-- 						class="icon fa fa-shopping-bag" aria-hidden="true"></i>Detail 4</a> -->
<!-- 				<li class="dropdown menu-item"><a -->
<%-- 					href="${pageContext.request.contextPath}/home"><i --%>
<!-- 						class="icon fa fa-file-text" aria-hidden="true"></i>Detail 5</a></li> -->
<!-- 				<li class="dropdown menu-item"><a -->
<%-- 					href="${pageContext.request.contextPath}/home"><i --%>
<!-- 						class="icon fa fa-user" aria-hidden="true"></i>Detail 6</a></li> -->
			</ul>
		</nav>
	</div>
</div>
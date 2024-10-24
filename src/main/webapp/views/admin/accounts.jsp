<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url value="/" var="URL" />

<div class="body-content">
	<div class="container">
		<div class="sign-in-page">
		<p class="heading-title">Accounts Management</p>
			<div class="row">
				<div class="col-md-12">
					<div class="table-responsive">
						<table class="table table-bordered table-hover list-account">
							<thead>
								<tr>
									<th>User ID</th>
									<th>Name</th>
									<th>DoB</th>
									<th>Gender</th>
									<th>Email</th>
									<th>Phone number</th>
									<th>Address</th>
									<th>Status</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${accounts}" var="acc">

									<tr>
										<td>${acc.userid}</td>
										<td>${acc.name}</td>
										<td>${acc.dob}</td>
										<td>${acc.gender}</td>
										<td>${acc.email}</td>
										<td>${acc.phonenum}</td>
										<td>${acc.address}</td>
										<td><c:choose>
												<c:when test="${acc.deactivated == true} ">
													<p style="color: red;">Deactivated</p>
												</c:when>
												<c:otherwise>
													<p style="color: green;">Active</p>
												</c:otherwise>
											</c:choose></td>
										<td><c:choose>
												<c:when test="${acc.deactivated == true} ">
													<a
														href="${pageContext.request.contextPath }/admin/account/setActive?uid=${acc.userid}"><i
														class="fa fa-check"></i></a>
												</c:when>
												<c:otherwise>
													<a
														href="${pageContext.request.contextPath }/admin/account/setDeactive?uid=${acc.userid}"><i
														class="fa fa-flag"></i></a>
												</c:otherwise>
											</c:choose> <a
											href="${pageContext.request.contextPath }/admin/account/delete?uid=${acc.userid}">&emsp;
												| &emsp;<i class="fa fa-close"></i>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
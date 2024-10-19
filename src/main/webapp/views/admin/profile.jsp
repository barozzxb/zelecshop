<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url value="/" var="URL" />

<div class="body-content">
	<div class="container">
		<div class="sign-in-page">
			<div class="row">
				<div class="col-md-6 col-sm-6 create-new-account">
					<h4 class="checkout-subtitle">Modify Account</h4>
					<p class="text title-tag-line">Update your account information.</p>
					<form action="${pageContext.request.contextPath }/admin/profile"
						class="register-form outer-top-xs" role="form" method="post">
						<div class="form-group">
							<label class="info-title" for="userid">User ID<span>*</span>
							</label> <input type="text"
								class="form-control unicase-form-control text-input" id="userid"
								name="userid" value="${sessionScope.account.userid }" disabled>
						</div>
						<div class="form-group">
							<label class="info-title" for="name">Full Name<span>*</span>
							</label> <input type="text"
								class="form-control unicase-form-control text-input" id="name"
								name="name" value="${sessionScope.account.name }">
						</div>
						<div class="form-group">
							<label class="info-title" for="dob">Date of birth<span>*</span>
							</label> <input type="date"
								class="form-control unicase-form-control text-input" id="dob"
								name="dob" >
						</div>
						<div class="form-group">
							<label class="info-title" for="email">Email <span>*</span></label>
							<input type="email"
								class="form-control unicase-form-control text-input" id="email"
								name="email" value="${sessionScope.account.email }">
						</div>
						<div class="form-group">
							<label class="info-title" for="password">Password <span>*</span></label>
							<input type="password"
								class="form-control unicase-form-control text-input"
								id="password" name="password" value="${sessionScope.account.password }" disabled>
						</div>
						<div class="form-group">
							<label class="info-title" for="gender">Gender<span>*</span>
							</label> 
							<input type="radio" id="stmale" name="gender" value="Male" <c:if test="${sessionScope.account.gender == 'Male' }">checked</c:if>> 
								<label for="stmale"> Male</label>
								<br>
							<input type="radio" id="stfemale" name="gender" value="Female" <c:if test="${sessionScope.account.gender == 'Female' }">checked</c:if>> 
							<label for="stfemale"> Female</label>
						</div>
						<div class="form-group">
							<label class="info-title" for="phonenum">Phone Number<span>*</span>
							</label> <input type="text"
								class="form-control unicase-form-control text-input" id="phonenum"
								name="phonenum" value="${sessionScope.account.phonenum }">
						</div>
						<div class="form-group">
							<label class="info-title" for="address">Address<span>*</span>
							</label> <input type="text"
								class="form-control unicase-form-control text-input" id="address"
								name="address" value="${sessionScope.account.address }">
						</div>
						<button type="submit"
							class="btn-upper btn btn-primary checkout-page-button">Update</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="body-content">
	<div class="container">
		<div class="sign-in-page">
			<div class="row">
				<!-- create a new account -->
				<div class="col-md-6 col-sm-6 create-new-account">
					<h4 class="checkout-subtitle">Create a new account</h4>
					<p class="text title-tag-line">Create your new account.</p>
					<form action="${pageContext.request.contextPath }/signup"
						class="register-form outer-top-xs" role="form" method="post">
						<div class="form-group">
							<label class="info-title" for="userid">User ID<span>*</span>
							</label> <input type="text"
								class="form-control unicase-form-control text-input" id="userid"
								name="userid">
						</div>
						<div class="form-group">
							<label class="info-title" for="email">Email <span>*</span></label>
							<input type="email"
								class="form-control unicase-form-control text-input" id="email"
								name="email">
						</div>
						<div class="form-group">
							<label class="info-title" for="password">Password <span>*</span></label>
							<input type="password"
								class="form-control unicase-form-control text-input"
								id="password" name="password">
						</div>
						<div class="form-group">
							<label class="info-title" for="c-password">Confirm
								Password <span>*</span>
							</label> <input type="password"
								class="form-control unicase-form-control text-input"
								id="c-password" name="c-password">
						</div>
						<button type="submit"
							class="btn-upper btn btn-primary checkout-page-button">Sign
							Up</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
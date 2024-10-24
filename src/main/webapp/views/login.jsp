<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="body-content">
	<div class="container">
		<div class="sign-in-page">
			<div class="row">
				<!-- Sign-in -->
				<div class="col-md-6 col-sm-6 sign-in">
					<h4 class="">Login</h4>
					<p class="">Hello, Welcome to your account.</p>
					<div class="social-sign-in outer-top-xs">
						<a href="#" class="facebook-sign-in"><i class="fa fa-facebook"></i>
							Login with Facebook</a> 
						<a href="#" class="google-sign-in"><i class="fa fa-twitter"></i> 
							Login with Google</a>
					</div>
					
					<form action="${pageContext.request.contextPath}/login" class="register-form outer-top-xs" role="form" method="post">
						<div class="form-group">
							<label class="info-title" for="userid">	User ID <span>*</span>
							</label> <input type="text" class="form-control unicase-form-control text-input"
								id="userid" name="userid">
						</div>
						<div class="form-group">
							<label class="info-title" for="password">Password <span>*</span>
							</label> <input type="password"
								class="form-control unicase-form-control text-input"
								id="password" name="password">
						</div>
						<div class="radio outer-xs">
							<label> <input type="radio" name="optionsRadios"
								id="optionsRadios2" value="option2">Remember me!
							</label> <a href="${pageContext.request.contextPath}/resetpassword" class="forgot-password pull-right">Forgot your
								Password?</a>
						</div>
						<button type="submit"
							class="btn-upper btn btn-primary checkout-page-button">Login</button>
					</form>
				</div>
				<!-- Sign-in -->				
			</div>
		</div>
	</div>
</div>

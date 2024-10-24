<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<div class="body-content">
	<div class="container">
		<div class="sign-in-page">
			<div class="row">

				<div class="col-md-12 my-wishlist">
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th colspan="4" class="heading-title">Products list</th>
									<th colspan="4" class="heading-title"><a
										href="${pageContext.request.contextPath }/admin/product/add"
										class="btn-upper btn btn-primary">Add product</a></th>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${listprod}" var="prod">
									<tr>
										<td class="col-md-2 col-sm-6 col-xs-6"><img
											src="assets/images/products/p1.jpg" alt="imga"></td>
										<td class="col-md-7 col-sm-6 col-xs-6">
											<div class="product-name">
												<input type="hidden" value="${prod.pid }" /> <a href="#"
													class="section-title">${prod.pname}</a>
											</div> <br></br>
											<div class="quantity">${prod.pquantity}products remain</div>
										</td>

										<td class="col-md-7 col-sm-6 col-xs-6"><div class="price">
												${prod.pprice} VND <span>$900.00</span>
											</div></td>
										<td class="col-md-2 "><a
											href="${pageContext.request.contextPath }/admin/genre/edit?gid=${genre.gid}"
											class="btn-upper btn btn-primary">Edit genre</a></td>
										<td class="col-md-1 close-btn"><a
											href="${pageContext.request.contextPath }/admin/genre/delete?gid=${genre.gid}"
											class=""><i class="fa fa-times"></i></a></td>
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
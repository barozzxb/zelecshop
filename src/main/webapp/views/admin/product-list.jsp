<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url value="/" var="URL" />

<div class="col-md-12 my-wishlist">
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr>
					<th colspan="4" class="heading-title">Products list</th>
					<th colspan="4" class="heading-title"><a href="${pageContext.request.contextPath }/admin/product/add"
						class="btn-upper btn btn-primary">Add Product</a></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="col-md-2 col-sm-6 col-xs-6"><img
						src="assets/images/products/p1.jpg" alt="imga"></td>
					<td class="col-md-7 col-sm-6 col-xs-6">
						<div class="product-name">
							<a href="#">Product 1</a>
						</div>
						<div class="quantity">
							130 products
						</div>
					</td>
					<td class="col-md-2 "><a href="#"
						class="btn-upper btn btn-primary">Edit Product</a></td>
					<td class="col-md-1 close-btn"><a href="${pageContext.request.contextPath }/admin/product/edit?id=?" class=""><i
							class="fa fa-times"></i></a></td>
				</tr>
				<tr>
					<td class="col-md-2 col-sm-6 col-xs-6"><img
						src="assets/images/products/p1.jpg" alt="imga"></td>
					<td class="col-md-7 col-sm-6 col-xs-6">
						<div class="product-name">
							<a href="#">Product 2</a>
						</div>
						<div class="quantity">
							150 products
						</div>
					</td>
					<td class="col-md-2 "><a href="#"
						class="btn-upper btn btn-primary">Edit Product</a></td>
					<td class="col-md-1 close-btn"><a href="#" class=""><i
							class="fa fa-times"></i></a></td>
				</tr>
				<tr>
					<td class="col-md-2 col-sm-6 col-xs-6"><img
						src="assets/images/products/p1.jpg" alt="imga"></td>
					<td class="col-md-7 col-sm-6 col-xs-6">
						<div class="product-name">
							<a href="#">Product 4</a>
						</div>
						<div class="quantity">
							100 products
						</div>
					</td>
					<td class="col-md-2 "><a href="#"
						class="btn-upper btn btn-primary">Edit Product</a></td>
					<td class="col-md-1 close-btn"><a href="#" class=""><i
							class="fa fa-times"></i></a></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- ========================================== SECTION – PRODUCT DETAIL ========================================= -->

<div id="product-detail">
    <div id="owl-product" class="owl-carousel owl-inner-nav owl-ui-sm">
        <!-- Hình ảnh sản phẩm -->
        <div class="item" style="background-image: url(${URL}assets/images/products/product-main.jpg);">
            <div class="container-fluid">
                <div class="caption bg-color vertical-center text-left">
                    <div class="product-header fadeInDown-1">Product Name</div>
                    <div class="big-text fadeInDown-1">Exclusive Details</div>
                    <div class="excerpt fadeInDown-2 hidden-xs">
                        <span>Short description of the product highlighting its features.</span>
                    </div>
                    <div class="product-price fadeInDown-3">
                        <span class="price">$99.99</span>
                    </div>
                    <div class="button-holder fadeInDown-3">
                        <a href="#" class="btn-lg btn btn-uppercase btn-primary add-to-cart-button">Add to Cart</a>
                    </div>
                </div>
                <!-- /.caption -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /.item -->

        <!-- Hình ảnh sản phẩm khác -->
        <div class="item" style="background-image: url(${URL}assets/images/products/product-alt-1.jpg);">
            <div class="container-fluid">
                <div class="caption bg-color vertical-center text-left">
                    <div class="slider-header fadeInDown-1">Alternate View</div>
                </div>
            </div>
        </div>

        <div class="item" style="background-image: url(${URL}assets/images/products/product-alt-2.jpg);">
            <div class="container-fluid">
                <div class="caption bg-color vertical-center text-left">
                    <div class="slider-header fadeInDown-1">Alternate View</div>
                </div>
            </div>
        </div>
        <!-- /.item -->

    </div>
    <!-- /.owl-carousel -->

    <!-- Product Description -->
    <div class="container product-description">
        <h2 class="title">Product Description</h2>
        <p>
            This section contains a detailed description of the product, covering its features, specifications, 
            and other important information that customers would want to know before making a purchase.
        </p>
        <div class="product-details">
            <h3>Specifications</h3>
            <ul>
                <li>Feature 1: Description</li>
                <li>Feature 2: Description</li>
                <li>Feature 3: Description</li>
                <!-- Add more specifications as needed -->
            </ul>
        </div>
        <div class="product-reviews">
            <h3>Customer Reviews</h3>
            <p>No reviews yet. Be the first to review this product!</p>
        </div>
    </div>
</div>

<!-- ========================================= SECTION – PRODUCT DETAIL : END ========================================= -->
    
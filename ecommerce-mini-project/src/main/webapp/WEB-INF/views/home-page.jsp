<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShopEasy - Home</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f4f6f9;
}

/* Header */

header{
    background:#2874f0;
    color:white;
    padding:15px 30px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    font-size:28px;
    font-weight:bold;
}

.logo a{
    color:white;
    text-decoration:none;
}

nav ul{
    list-style:none;
    display:flex;
    gap:20px;
}

nav ul li a{
    color:white;
    text-decoration:none;
    font-weight:bold;
}

/* Hero Section */

.hero{
    text-align:center;
    padding:80px 20px;
    background:white;
}

.hero h1{
    font-size:42px;
    margin-bottom:15px;
}

.hero p{
    font-size:18px;
    color:#555;
    margin-bottom:25px;
}

.shop-btn{
    background:#2874f0;
    color:white;
    padding:12px 25px;
    border:none;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
}

/* Product Section */

.products{
    padding:50px 20px;
}

.products h2{
    text-align:center;
    margin-bottom:30px;
}

.product-container{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
    gap:25px;
}

.product-card{
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0px 2px 8px rgba(0,0,0,0.1);
    text-align:center;
}

.product-card img{
    width:100%;
    height:200px;
    object-fit:cover;
    border-radius:5px;
}

.product-card h3{
    margin:15px 0;
}

.price{
    color:green;
    font-size:20px;
    font-weight:bold;
    margin-bottom:10px;
}

.add-cart{
    background:#ff9800;
    color:white;
    border:none;
    padding:10px 20px;
    border-radius:5px;
    cursor:pointer;
}

.nav-menu {
    list-style: none;
    display: flex;
    gap: 20px;
}

.nav-menu li {
    position: relative;
}

.nav-menu li a {
    color: white;
    text-decoration: none;
    font-weight: bold;
}

/* Dropdown */

.dropdown-content {
    display: none;
    position: absolute;
    top: 100%;
    right: 0;
    background: white;
    min-width: 180px;
    border-radius: 5px;
    box-shadow: 0px 2px 8px rgba(0,0,0,0.2);
    list-style: none;
    padding: 0;
    z-index: 1000;
}

.dropdown-content li {
    border-bottom: 1px solid #eee;
}

.dropdown-content li:last-child {
    border-bottom: none;
}

.dropdown-content li a {
    display: block;
    padding: 12px 15px;
    color: #333;
    text-decoration: none;
}

.dropdown-content li a:hover {
    background: #f4f4f4;
}

/* Show dropdown on hover */

.dropdown:hover .dropdown-content {
    display: block;
}

/* Footer */

footer{
    background:#333;
    color:white;
    text-align:center;
    padding:15px;
    margin-top:40px;
}

/* Responsive */

@media(max-width:768px){

    header{
        flex-direction:column;
        gap:10px;
    }

    nav ul{
        flex-wrap:wrap;
        justify-content:center;
    }

    .hero h1{
        font-size:30px;
    }
}

</style>

</head>
<body>

<header>

    <div class="logo">
        <a href="#">ShopEasy</a>
    </div>

    <!-- nav>
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">Cart</a></li>
            <li><a href="#">Orders</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="login">Logout</a></li>
        </ul>
    </nav-->
    
    <nav>
    <ul class="nav-menu">

        <li><a href="#">Home</a></li>

        <li><a href="#">Products</a></li>

        <li class="dropdown">

           <a href="#">
       ${sessionScope.loggedInEmail} ▼
    </a>

           <ul class="dropdown-content">

    <li><a href="#">Profile</a></li>
    <li><a href="#">Orders</a></li>
    <li><a href="#">Cart</a></li>
    <!-- li><a href="reset-password.jsp">Password Reset</a></li-->
    
 
    <li>
    <form action="changePassword"
              method="post">
            <button type="submit">
                Password Reset
            </button>
        </form>
    </li>

    <li>
        <form action="logout"
              method="post">
            <button type="submit">
                Logout
            </button>
        </form>
    </li>

</ul>

        </li>

    </ul>
</nav>

</header>

<section class="hero">

    <h1>Welcome to ShopEasy</h1>

    <p>
        Discover the best products at unbeatable prices.
    </p>

    <button class="shop-btn">
        Shop Now
    </button>

</section>

<section class="products">

    <h2>Featured Products</h2>

    <div class="product-container">

        <div class="product-card">

            <img src="data:image/jpeg;base64,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"
                 alt="Product">

            <h3>Wireless Headphones</h3>

            <div class="price">₹2,499</div>

            <button class="add-cart">
                Add to Cart
            </button>

        </div>

        <div class="product-card">

            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb5fr8TJV0-bOUyp0jMGUa6rhpLol0Rj3Dxw&s"
                 alt="Product">

            <h3>Smart Watch</h3>

            <div class="price">₹4,999</div>

            <button class="add-cart">
                Add to Cart
            </button>

        </div>

        <div class="product-card">

            <img src="data:image/jpeg;base64,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"
                 alt="Product">

            <h3>Bluetooth Speaker</h3>

            <div class="price">₹1,999</div>

            <button class="add-cart">
                Add to Cart
            </button>

        </div>

        <div class="product-card">

            <img src="data:image/jpeg;base64,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"
                 alt="Product">

            <h3>Gaming Mouse</h3>

            <div class="price">₹899</div>

            <button class="add-cart">
                Add to Cart
            </button>

        </div>

    </div>

</section>

<footer>
    <p>
        © 2026 ShopEasy E-Commerce. All Rights Reserved.
    </p>
</footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#667eea,#764ba2);
    padding:20px;
}

.container{
    width:100%;
    max-width:600px;
    background:rgba(255,255,255,0.95);
    backdrop-filter:blur(10px);
    padding:35px;
    border-radius:20px;
    box-shadow:0 15px 35px rgba(0,0,0,0.2);
    animation:fadeIn 0.5s ease-in-out;
}

@keyframes fadeIn{
    from{
        opacity:0;
        transform:translateY(20px);
    }
    to{
        opacity:1;
        transform:translateY(0);
    }
}

h2{
    text-align:center;
    color:#333;
    margin-bottom:25px;
    font-size:30px;
    font-weight:700;
}

label{
    display:block;
    margin-bottom:6px;
    color:#444;
    font-weight:600;
}

input,
textarea,
select{
    width:100%;
    padding:12px 15px;
    margin-bottom:18px;
    border:2px solid #e1e1e1;
    border-radius:10px;
    outline:none;
    font-size:15px;
    transition:all 0.3s ease;
    background:#fafafa;
}

input:focus,
textarea:focus,
select:focus{
    border-color:#667eea;
    background:#fff;
    box-shadow:0 0 10px rgba(102,126,234,0.25);
}

textarea{
    resize:none;
}

button{
    width:100%;
    padding:14px;
    border:none;
    border-radius:10px;
    background:linear-gradient(135deg,#667eea,#764ba2);
    color:white;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
    transition:all 0.3s ease;
}

button:hover{
    transform:translateY(-2px);
    box-shadow:0 10px 20px rgba(102,126,234,0.3);
}

button:active{
    transform:translateY(0);
}

.form-group{
    margin-bottom:10px;
}

::placeholder{
    color:#999;
}
</style>

</head>
<body>

<div class="container">

    <h2>🛒 Add New Product</h2>

    <form action="product/saveProduct" method="post">

        <div class="form-group">
            <label>Product Name</label>
            <input type="text" name="productName" placeholder="Enter Product Name" required>
        </div>

        <div class="form-group">
            <label>Category</label>
            <select name="category" required>
                <option value="">-- Select Category --</option>
                <option value="Electronics">Electronics</option>
                <option value="Mobiles">Mobiles</option>
                <option value="Laptops">Laptops</option>
                <option value="Fashion">Fashion</option>
                <option value="Men Clothing">Men Clothing</option>
                <option value="Women Clothing">Women Clothing</option>
                <option value="Footwear">Footwear</option>
                <option value="Home Appliances">Home Appliances</option>
                <option value="Furniture">Furniture</option>
                <option value="Books">Books</option>
                <option value="Sports">Sports</option>
                <option value="Toys">Toys</option>
                <option value="Beauty & Personal Care">Beauty & Personal Care</option>
                <option value="Groceries">Groceries</option>
                <option value="Automotive">Automotive</option>
            </select>
        </div>

        <div class="form-group">
            <label>Price</label>
            <input type="number" step="0.01" name="price" placeholder="Enter Price" required>
        </div>

        <div class="form-group">
            <label>Quantity</label>
            <input type="number" name="quantity" placeholder="Enter Quantity" required>
        </div>

        <div class="form-group">
            <label>Brand</label>
            <input type="text" name="brand" placeholder="Enter Brand Name" required>
        </div>

        <div class="form-group">
            <label>Description</label>
            <textarea name="description" rows="4" placeholder="Enter Product Description"></textarea>
        </div>

        <button type="submit">Save Product</button>

    </form>

<a href="product/showSearchPage">Search Product</a>

</div>

</body>
</html>
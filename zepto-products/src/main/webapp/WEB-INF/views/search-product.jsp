<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Product</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#4facfe,#00f2fe);
}

.search-container{
    width:450px;
    background:white;
    padding:35px;
    border-radius:20px;
    box-shadow:0 15px 35px rgba(0,0,0,0.2);
    text-align:center;
}

.search-container h2{
    color:#333;
    margin-bottom:25px;
}

.form-group{
    margin-bottom:20px;
    text-align:left;
}

.form-group label{
    display:block;
    margin-bottom:8px;
    font-weight:600;
    color:#555;
}

.form-group input{
    width:100%;
    padding:12px;
    border:2px solid #ddd;
    border-radius:10px;
    outline:none;
    transition:0.3s;
    font-size:15px;
}

.form-group input:focus{
    border-color:#4facfe;
    box-shadow:0 0 10px rgba(79,172,254,0.3);
}

.search-btn{
    width:100%;
    padding:12px;
    border:none;
    border-radius:10px;
    background:linear-gradient(135deg,#4facfe,#00c6fb);
    color:white;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
    transition:0.3s;
}

.search-btn:hover{
    transform:translateY(-2px);
    box-shadow:0 10px 20px rgba(79,172,254,0.3);
}

.icon{
    font-size:50px;
    margin-bottom:10px;
}

</style>

</head>
<body>

<div class="search-container">

    <div class="icon">🔍</div>

    <h2>Search Product</h2>

    <form action="search" method="get">

        <div class="form-group">
            <label>Product Name</label>
            <input type="text"
                   name="productName"
                   placeholder="Enter Product Name"
                   required>
        </div>

        <button type="submit" class="search-btn">
            Search Product
        </button>

    </form>

</div>

</body>
</html>
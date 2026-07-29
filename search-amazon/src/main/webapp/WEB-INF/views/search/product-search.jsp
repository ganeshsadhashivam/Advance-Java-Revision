<!-- %@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Products</title>
</head>
<body>
<form action="searchProduct" method="get">
Search Product : <input type="text" name="searchText">
<input type="submit" value="Search">
</form>
</body>
</html-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Products</title>

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #232f3e, #37475a);
    }

    .search-container {
        background: #ffffff;
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
        width: 450px;
        text-align: center;
    }

    h1 {
        color: #232f3e;
        margin-bottom: 25px;
        font-size: 28px;
    }

    .search-box {
        display: flex;
        gap: 10px;
    }

    input[type="text"] {
        flex: 1;
        padding: 12px 15px;
        border: 2px solid #ddd;
        border-radius: 8px;
        font-size: 16px;
        outline: none;
        transition: 0.3s;
    }

    input[type="text"]:focus {
        border-color: #ff9900;
        box-shadow: 0 0 8px rgba(255, 153, 0, 0.3);
    }

    input[type="submit"] {
        padding: 12px 20px;
        border: none;
        border-radius: 8px;
        background: #ff9900;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #e68a00;
        transform: translateY(-2px);
    }

    .subtitle {
        color: #666;
        margin-bottom: 20px;
        font-size: 14px;
    }
</style>

</head>
<body>

<div class="search-container">
    <h1>🔍 Product Search</h1>
    <p class="subtitle">Find products quickly and easily</p>

    <form action="searchProduct" method="get">
        <div class="search-box">
            <input type="text" name="searchText" placeholder="Enter product name..." required>
            <input type="submit" value="Search">
        </div>
    </form>
</div>

</body>
</html>
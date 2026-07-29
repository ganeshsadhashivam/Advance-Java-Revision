<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    min-height:100vh;
    display:flex;
    flex-direction:column;
    background:#f4f6f9;
}

/* Header */
header{
    background:#2874f0;
    color:white;
    text-align:center;
    padding:15px;
}

/* Main Container */
.container{
    flex:1;
    display:flex;
    justify-content:center;
    align-items:center;
    padding:20px;
}

.login-card{
    width:100%;
    max-width:400px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

.login-card h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

.form-group{
    margin-bottom:18px;
}

.form-group label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
}

.form-group input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:5px;
}

.form-group input:focus{
    outline:none;
    border-color:#2874f0;
}

.login-btn{
    width:100%;
    padding:12px;
    background:#2874f0;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
    font-weight:bold;
}

.login-btn:hover{
    background:#1d63d8;
}

.signup-link{
    text-align:center;
    margin-top:15px;
}

.signup-link a{
    color:#2874f0;
    text-decoration:none;
    font-weight:bold;
}

/* Footer */
footer{
    background:#333;
    color:white;
    text-align:center;
    padding:15px;
}

@media(max-width:768px){
    .login-card{
        padding:20px;
    }
}
</style>

</head>
<body>

<!-- header style="display:flex">
    <h1>ShopEasy </h1>
</header-->
<header style="display:flex; justify-content:start; ">
    <h1>
        <a href="/ecommerce-mini-project"
           style="text-decoration:none; color:white;">
            ShopEasy
        </a>
    </h1>
</header>

<div class="container">
    <div class="login-card">

        <h2>User Login</h2>

        <form action="login" method="post">

            <div class="form-group">
                <label>Email</label>
                <input
                    type="email"
                    name="email"
                    placeholder="Enter Email Address"
                    required>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input
                    type="password"
                    name="password"
                    placeholder="Enter Password"
                    required>
            </div>

            <button type="submit" class="login-btn">
                Login
            </button>

            <!--  div class="signup-link">
                Don't have an account?
                <a href="signup.jsp">Sign Up</a>
            </div-->
            

        </form>
        <div class="signup-link">
    

   
    <span>Don't have an account?</span>

    <form action="signUp" method="post" style="display:inline;">
        <button type="submit"
                style="background:none;
                       border:none;
                       color:#2874f0;
                       cursor:pointer;
                       font-weight:bold;
                       text-decoration:underline;">
            Sign Up
        </button>
    </form>
</div>
</div>

    </div>
</div>

<footer>
    <p>&copy; 2026 ShopEasy. All Rights Reserved.</p>
</footer>

</body>
</html>
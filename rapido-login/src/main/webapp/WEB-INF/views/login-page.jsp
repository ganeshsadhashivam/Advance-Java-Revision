<!-- %@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is login page will be implemented soon
</body>
</html-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Login</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#000428,#004e92);
}

.container{
    width:900px;
    height:550px;
    display:flex;
    background:white;
    border-radius:25px;
    overflow:hidden;
    box-shadow:0px 15px 40px rgba(0,0,0,0.3);
}

.left-panel{
    flex:1;
    background:linear-gradient(135deg,#FFD400,#FFB800);
    display:flex;
    flex-direction:column;
    justify-content:center;
    align-items:center;
    padding:40px;
}

.left-panel h1{
    font-size:3rem;
    color:#111;
    margin-bottom:15px;
}

.left-panel p{
    text-align:center;
    font-size:18px;
    color:#333;
    line-height:1.8;
}

.bike{
    font-size:120px;
    margin-bottom:20px;
}

.right-panel{
    flex:1;
    display:flex;
    justify-content:center;
    align-items:center;
    padding:40px;
}

.login-box{
    width:100%;
    max-width:350px;
}

.login-box h2{
    text-align:center;
    margin-bottom:30px;
    color:#222;
}

.input-group{
    margin-bottom:20px;
}

.input-group label{
    display:block;
    margin-bottom:8px;
    font-weight:600;
    color:#444;
}

.input-group input{
    width:100%;
    padding:14px;
    border:1px solid #ccc;
    border-radius:10px;
    outline:none;
    transition:0.3s;
}

.input-group input:focus{
    border-color:#FFD400;
    box-shadow:0 0 10px rgba(255,212,0,0.4);
}

.login-btn{
    width:100%;
    padding:15px;
    border:none;
    background:#FFD400;
    color:#000;
    font-size:18px;
    font-weight:bold;
    border-radius:10px;
    cursor:pointer;
    transition:0.3s;
}

.login-btn:hover{
    background:#ffbf00;
    transform:translateY(-2px);
}

.extra-links{
    text-align:center;
    margin-top:20px;
}

.extra-links a{
    text-decoration:none;
    color:#004e92;
    font-weight:600;
}

.extra-links a:hover{
    text-decoration:underline;
}

</style>

</head>
<body>

<div class="container">

    <div class="left-panel">
        <div class="bike">🏍️</div>
        <h1>Rapido</h1>
        <p>
            Fast, Safe & Affordable Rides.<br>
            Login to continue your journey with Rapido.
        </p>
    </div>

    <div class="right-panel">

        <div class="login-box">

            <h2>Welcome Back 👋</h2>

            <form action="login" method="post">

                <div class="input-group">
                    <label>Email</label>
                    <input type="email"
                           name="email"
                           placeholder="Enter your email"
                           required>
                </div>

                <div class="input-group">
                    <label>Password</label>
                    <input type="password"
                           name="password"
                           placeholder="Enter your password"
                           required>
                </div>

                <button type="submit" class="login-btn">
                    Login
                </button>

            </form>

            <div class="extra-links">
                <p>
                    New User?
                    <a href="register">Create Account</a>
                </p>
            </div>

        </div>

    </div>

</div>

</body>
</html>
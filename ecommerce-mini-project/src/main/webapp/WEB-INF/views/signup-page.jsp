<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family:Arial, Helvetica, sans-serif;
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
        padding:15px 30px;
        text-align:center;
    }

    /* Main Section */
    .container{
        flex:1;
        display:flex;
        justify-content:center;
        align-items:center;
        padding:30px;
    }

    .signup-card{
        width:100%;
        max-width:450px;
        background:white;
        padding:30px;
        border-radius:12px;
        box-shadow:0 4px 12px rgba(0,0,0,0.15);
    }

    .signup-card h2{
        text-align:center;
        margin-bottom:20px;
        color:#333;
    }

    .form-group{
        margin-bottom:15px;
    }

    .form-group label{
        display:block;
        margin-bottom:5px;
        font-weight:bold;
        color:#444;
    }

    .form-group input{
        width:100%;
        padding:12px;
        border:1px solid #ccc;
        border-radius:6px;
        font-size:15px;
    }

    .form-group input:focus{
        outline:none;
        border-color:#2874f0;
    }

    .signup-btn{
        width:100%;
        padding:12px;
        background:#2874f0;
        color:white;
        border:none;
        border-radius:6px;
        font-size:16px;
        cursor:pointer;
        font-weight:bold;
    }

    .signup-btn:hover{
        background:#0d5be1;
    }

    .login-link{
        text-align:center;
        margin-top:15px;
    }

    .login-link a{
        color:#2874f0;
        text-decoration:none;
        font-weight:bold;
    }
    
    
    .link-button {
    background: none;
    border: none;
    padding: 0;
    color: #2874f0;
    text-decoration: underline;
    cursor: pointer;
    font-size: inherit;
    font-family: inherit;
    font-weight: bold;
}

.link-button:hover {
    color: #0d5be1;
}
    

    /* Footer */
    footer{
        background:#333;
        color:white;
        text-align:center;
        padding:15px;
    }

    /* Responsive */
    @media(max-width:768px){
        .signup-card{
            padding:20px;
        }

        header{
            font-size:14px;
        }
    }
</style>

</head>
<body>



<header style="display:flex; justify-content:start; ">
    <h1>
        <a href="/ecommerce-mini-project"
           style="text-decoration:none; color:white;">
            ShopEasy
        </a>
    </h1>
</header>

<div class="container">
    <div class="signup-card">

        <h2>Create Account</h2>

        <form action="signUp" method="post">

            <div class="form-group">
                <label>Full Name</label>
                <input type="text" name="fullName"
                       placeholder="Enter Full Name" required>
            </div>

            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email"
                       placeholder="Enter Email Address" required>
            </div>

            <div class="form-group">
                <label>Mobile Number</label>
                <input type="tel" name="mobileNumber"
                       placeholder="Enter Mobile Number"
                       pattern="[0-9]{10}" required>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password"
                       placeholder="Enter Password" required>
            </div>

            <div class="form-group">
                <label>Confirm Password</label>
                <input type="password" name="confirmPassword"
                       placeholder="Confirm Password" required>
            </div>

            <button type="submit" class="signup-btn">
                Sign Up
            </button>


        </form>
        <div class="login-link">
    Already have an account?

    <form action="login" method="post" style="display:inline;">
        <button type="submit" class="link-button">Login</button>
    </form>
</div>

    </div>
</div>

<footer>
    <p>&copy; 2026 ShopEasy. All Rights Reserved.</p>
</footer>

</body>
</html>
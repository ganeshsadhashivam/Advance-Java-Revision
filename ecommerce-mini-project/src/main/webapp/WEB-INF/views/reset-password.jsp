<!-- %@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="changePassword" method="post">

    <div>
        <label>Current Password</label>
        <input type="password"
               name="currentPassword"
               required>
    </div>

    <div>
        <label>New Password</label>
        <input type="password"
               name="newPassword"
               required>
    </div>

    <div>
        <label>Confirm New Password</label>
        <input type="password"
               name="confirmPassword"
               required>
    </div>

    <button type="submit">
        Change Password
    </button>

</form>
</body>
</html-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>

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

header h1{
    font-size:28px;
}

/* Main Content */

.container{
    flex:1;
    display:flex;
    justify-content:center;
    align-items:center;
    padding:30px;
}

.password-card{

    width:100%;
    max-width:450px;

    background:white;

    padding:30px;

    border-radius:12px;

    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

.password-card h2{
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

.change-btn{

    width:100%;

    padding:12px;

    background:#2874f0;

    color:white;

    border:none;

    border-radius:6px;

    cursor:pointer;

    font-size:16px;

    font-weight:bold;
}

.change-btn:hover{
    background:#0d5be1;
}

.message{
    text-align:center;
    margin-bottom:15px;
    color:red;
    font-weight:bold;
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

    .password-card{
        padding:20px;
    }

    header h1{
        font-size:22px;
    }
}

</style>

</head>

<body>

<header>
    <h1>ShopEasy </h1>
</header>

<div class="container">

    <div class="password-card">

        <h2>Reset Password</h2>

        <div class="message">
            ${errorMessage}
        </div>

        <form action="changePassword" method="post">

    <div class="form-group">
        <label>Email</label>
        <input type="email"
               name="email"
               placeholder="Enter Email Address"
               required>
    </div>

    <div class="form-group">
        <label>New Password</label>
        <input type="password"
               name="newPassword"
               placeholder="Enter New Password"
               required>
    </div>

    <div class="form-group">
        <label>Confirm New Password</label>
        <input type="password"
               name="confirmPassword"
               placeholder="Confirm New Password"
               required>
    </div>

    <button type="submit" class="change-btn">
        Reset Password
    </button>

</form>

    </div>

</div>

<footer>
    <p>&copy; 2026 ShopEasy. All Rights Reserved.</p>
</footer>

</body>
</html>
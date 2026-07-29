<!--  
<html>

<body>
<h2>Rapido</h2>
<a href="doLogin">Click Here to Login</a>
</body>
</html>
-->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Rapido Login</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{
    min-height:100vh;
    background:linear-gradient(135deg,#000428,#004e92);
    overflow:hidden;
}

.navbar{
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:20px 80px;
    background:rgba(0,0,0,0.2);
}

.logo{
    color:#FFD400;
    font-size:2rem;
    font-weight:bold;
    letter-spacing:2px;
}

.nav-links a{
    color:white;
    text-decoration:none;
    margin-left:30px;
    font-size:1rem;
    transition:0.3s;
}

.nav-links a:hover{
    color:#FFD400;
}

.hero{
    display:flex;
    justify-content:space-between;
    align-items:center;
    height:85vh;
    padding:0 80px;
}

.content{
    color:white;
    max-width:600px;
}

.content h1{
    font-size:4rem;
    line-height:1.2;
    margin-bottom:20px;
}

.content h1 span{
    color:#FFD400;
}

.content p{
    font-size:1.2rem;
    color:#ddd;
    margin-bottom:40px;
    line-height:1.8;
}

.login-btn{
    display:inline-block;
    padding:18px 45px;
    background:#FFD400;
    color:black;
    text-decoration:none;
    font-size:1.2rem;
    font-weight:bold;
    border-radius:50px;
    transition:0.3s;
    box-shadow:0px 8px 25px rgba(255,212,0,0.4);
}

.login-btn:hover{
    transform:translateY(-5px);
    box-shadow:0px 12px 35px rgba(255,212,0,0.6);
}

.ride-card{
    width:450px;
    height:450px;
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(15px);
    border-radius:30px;
    display:flex;
    flex-direction:column;
    justify-content:center;
    align-items:center;
    color:white;
    border:1px solid rgba(255,255,255,0.2);
}

.bike{
    font-size:120px;
}

.ride-card h2{
    margin-top:20px;
    color:#FFD400;
}

.features{
    display:flex;
    gap:25px;
    margin-top:30px;
}

.feature{
    background:rgba(255,255,255,0.1);
    padding:15px 20px;
    border-radius:15px;
    font-size:14px;
}

.circle1{
    position:absolute;
    width:400px;
    height:400px;
    background:#FFD400;
    border-radius:50%;
    top:-150px;
    right:-100px;
    opacity:0.15;
}

.circle2{
    position:absolute;
    width:300px;
    height:300px;
    background:#FFD400;
    border-radius:50%;
    bottom:-100px;
    left:-100px;
    opacity:0.15;
}
</style>
</head>

<body>

<div class="circle1"></div>
<div class="circle2"></div>

<nav class="navbar">
    <div class="logo"> RAPIDO</div>

    <div class="nav-links">
        <a href="#">Home</a>
        <a href="#">Services</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
    </div>
</nav>

<section class="hero">

    <div class="content">
        <h1>Ride Faster With <span>Rapido</span></h1>

        <p>
            India's fastest bike taxi platform.
            Safe, affordable and quick rides at your fingertips.
            Login now and experience hassle-free commuting.
        </p>

        <a href="doLogin" class="login-btn">
            Login Now 
        </a>

        <div class="features">
            <div class="feature"> Safe Ride</div>
            <div class="feature"> Quick Pickup</div>
            <div class="feature"> Affordable</div>
        </div>
    </div>

    <div class="ride-card">
        <div class="bike"></div>
        <h2>Book Your Ride</h2>
        <p>Fast  Safe  Reliable</p>
    </div>

</section>

</body>
</html>
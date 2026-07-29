<!DOCTYPE html>
<html>
<head>
    <title>E-Commerce Mini Project</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }

        /* Header */
        header {
            background-color: #2874f0;
            color: white;
            padding: 15px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .signup-btn {
            background-color: white;
            color: #2874f0;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        .signup-btn:hover {
            background-color: #f1f1f1;
        }

        /* Main Content */
        main {
            min-height: 70vh;
            text-align: center;
            padding: 50px;
        }

        /* Footer */
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 15px;
        }
    </style>
</head>
<body>

    <!-- Header -->
    <header style="border:1px solid black">
        <h1>ShopEasy</h1>
        <form action="signUp" method="post">
        <button class="signup-btn">Sign Up</button>
        </form>
    </header>

    <!-- Main Content -->
    <main>
        <h2>Welcome to ShopEasy E-Commerce Store</h2>
        <p>Find the best products at the best prices.</p>
    </main>

    <!-- Footer -->
    <footer>
        <p>&copy; 2026 ShopEasy. All Rights Reserved.</p>
    </footer>

</body>
</html>
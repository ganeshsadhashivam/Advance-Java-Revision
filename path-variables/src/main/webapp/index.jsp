<!-- html>
<body>
<h2>Order Details</h2>

order Id<input type="text" name="orderId">
customer Id <input type="text" name="customerId">



<button onclick="searchOrder()">Search</button>

<script>
function searchOrder() {
    var orderId = document.getElementById("orderId").value;
    var customerId = document.getElementById("customerId").value;

    window.location.href =
        "details/" + orderId + "/" + customerId;
}
</script>
</body>
</html-->
<html>
<body>
<h2>Order Details</h2>

Order Id <input type="text" id="orderId" name="orderId">
<br><br>

Customer Id <input type="text" id="customerId" name="customerId">
<br><br>

<button type="button" onclick="searchOrder()">Search</button>

<script>
function searchOrder() {
    var orderId = document.getElementById("orderId").value;
    var customerId = document.getElementById("customerId").value;

    window.location.href = "details/" + orderId + "/" + customerId;
}
</script>

</body>
</html>

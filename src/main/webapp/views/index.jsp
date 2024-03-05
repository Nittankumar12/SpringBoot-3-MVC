<%@page language="java"%>

<html>
        <head>
        <link rel= "stylesheet" type="text/css" href="style.css">
        </head>
<body>
<h2>My Calculator!!</h2>
        <form  action = "add" id="number-form">
                <label for="num1">Number 1:</label>
                <input type="number" id="num1" name="num1" required>
                <br>
                 <label for="num2">Number 2:</label>
                <input type="number" id="num2" name="num2" required>
                <br>
                <button type="submit">Add</button>
         </form>

</body>
</html>

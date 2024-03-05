<%@page language="java"%>

<html>
        <head>
        <link rel= "stylesheet" type="text/css" href="style.css">
        </head>
<body>

<%--
<form  action = "add" >
                <label for="num1">Number 1:</label>
                <input type="number" id="num1" name="num1" required>
                <br>
                 <label for="num2">Number 2:</label>
                <input type="number" id="num2" name="num2" required>
                <br>
                <button type="submit">Add</button>
         </form>

--%>


<h2>Adding alien</h2>
        <form  action = "addAlien" id="number-form">
                <label for="alienId">Alien Id</label>
                <input type="text" id="alienId" name="alienId" required>
                <br>
                 <label for="alienName">Alien Name:</label>
                <input type="text" id="alienName" name="alienName" required>
                <br>
                <button type="submit">Add</button>
         </form>


</body>
</html>

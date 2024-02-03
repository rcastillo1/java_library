
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Item</title>
</head>
<body>
    <h2>Add Item</h2>
    <form action="addItem" method="post">
        Title: <input type="text" name="title" required><br>
        <!-- Other item details... -->
        <input type="submit" value="Add Item">
    </form>
</body>
</html>
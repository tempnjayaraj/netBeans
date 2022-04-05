<%-- 
    Document   : login
    Created on : 01-Apr-2022, 1:11:34 pm
    Author     : johns
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
    body {
      background-image: url('https://media.istockphoto.com/vectors/tech-3d-vector-hexagon-blocks-white-background-vector-id1167354392?k=20&m=1167354392&s=612x612&w=0&h=ouH-OOCnlhxHqNF-YxYYnIAa2zIlaJqgBp-c0BSL0bc=');
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: cover;
    }
    </style>
    </head>
    
   
<body bg>
    <center><br><br><br><br>
        <font color="red"><h2>${error}</h2></font>
        <font color="red"><h2>${wrongOTP}</h2></font>
    <h1>Login</h1>
<form action="dbvalidate" method="POST" autocomplete="off">
    Enter Username: <input type="text" name="username"/><br><br>
    Password: <input type="password" name="password"/><br><br>
    <input type="submit" value="Login"/><br><br>
</form>
<br><br><br>
</center>
    <script type="text/javascript">
        window.history.forward();
        function noBack() {
            window.history.forward();
        }
        </script>
</body>
    
</html>

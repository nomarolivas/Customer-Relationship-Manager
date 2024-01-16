<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>User Login</title>
</head>

<body>
    <h1> Employee Login Form</h1>
    <form action="loginsuccess.jsp" method="post">
        <table style="with: 100%">
            <tr>
                <td>Username</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
             </tr>

             </table>
             <input> type="submit" value="Submit" />

    </form>
</body>

</html>

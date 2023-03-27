<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration form</title>
</head>
<body>
    <form action="Registrer" method="post">
        <table>
            <tr><td><h1>Registration form</h1></td></tr>
            <tr><td>fullname: </td><td><input type="text" name="fullname"></td></tr>
            <tr><td>ht number: </td><td><input type="password" name="htnumber"></td></tr>
            <tr>
                <td>branch: </td>
                <td>
                    <input list="branches" placeholder="Branch" name="branch">
                    <datalist id="branches" >
                        <option value="CSE(AIML)">
                        <option value="CSE(DS)">
                        <option value="CSE(CS)">
                        <option value="CSE">
                    </datalist>
                </td>
            </tr>
            <tr>
                <td>section: </td>
                <td>
                    <input list="section" placeholder="section" name="section">
                    <datalist id="section" >
                        <option value="A">
                        <option value="B">
                        <option value="C">
                    </datalist>
                </td>
            </tr>
            <tr><td>email: </td><td><input type="text" name="email"></td></tr>
            <tr><td>password: </td><td><input type="password" name="password"></td></tr>
            <tr><td>phone: </td><td><input type="text" name="phone"></td></tr>
            <tr><td>select image: </td><td><input type="file" name="image" accept="image/*"></td></tr>
            <tr>
                <td>gender: </td>
                <td>
                    <label>male</label><input type="radio" name="gender" value="male">
                    <label>female</label><input type="radio" name="gender" value="female">
                </td>
            </tr>
            <tr>
                <td>address: </td>
                <td>
                    <textarea id="address" name="freeform" rows="4" cols="50"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
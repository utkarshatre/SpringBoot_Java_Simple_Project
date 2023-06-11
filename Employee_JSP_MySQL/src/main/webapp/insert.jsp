<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color:white;
}
</style>
</head>
<body align="center" bgcolor="green">
<h1>Insert Your Data</h1>
<form action="validate">
        <input type="text" name="eid" placeholder="student id"><br><br>
        <input type="text" name="ename" placeholder="student name"><br><br>
        <input type="text" name="epost" placeholder="student email"><br><br>
        <input type="submit">
        </form>
        <h1>Enter Emp ID for details</h1>
<form action="fbyid">
<input type="text" name="eid" placeholder="enter sid">
<input type="submit">
</form>
        <h1>Enter Emp Name for details</h1>
<form action="fbyname">
<input type="text" name="ename" placeholder="enter ename">
<input type="submit">
</form>
<h1>Enter Emp ID to Delete</h1>
<form action="dbyid">
<input type="text" name="eid" placeholder="enter sid">
<input type="submit">
</form>
<h1>Fetch All Details</h1>
<form action="fetchall">
<input type="submit">
</form>
<h1> Desc Sort by Eid</h1>
<form action="sbyid">
<input type="submit">
</form>
</body>
</html>
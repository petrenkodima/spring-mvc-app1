<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>People</title>
    <link rel="stylesheet" type="text/css" href="/css/style.x46513.css"/>
</head>
<body>
<h1>People</h1>
<h3>Add preson to list</h3>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <td>
                <label>Priority</label>
                <input type="number" name="priorityId">
            </td>
            <td>
                <label>Name</label>
                <input type="text" name="name">
            </td>
            <td>
                <label>Age</label>
                <input type="number" name="age">
            </td>
            <td>
                <label>Email</label>
                <input type="email" name="email">
            </td>
            <td>
                <label>Description</label>
                <input type="text" name="description">
            </td>
            <td>
                <label>Date</label>
                <input type="date" name="date">
            </td>
            <td>
                <input type="submit" value="add person">
            </td>
        </tr>
    </table>
</form>
<br>
<h2>People list(person count : ${personSize})</h2>
<table border="1px">
    <tr>
        <td>Id</td>
        <td>Priority</td>
        <td>Name</td>
        <td>Age</td>
        <td>Email</td>
        <td>Description</td>
        <td>Date</td>
        <td>Delete from list</td>
    </tr>
    <#list personList as person>
        <tr>
            <td>${person.id}</td>
            <td>${person.priorityId}</td>
            <td>${person.name}</td>
            <td>${person.age}</td>
            <td>${person.email}</td>
            <td>${person.description}</td>
            <td>${person.date}</td>
            <td><a href="${'/delete/'+person.id}">Delete</a></td>
        </tr>
    </#list>
</table>
</body>
</html>
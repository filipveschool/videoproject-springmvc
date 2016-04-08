<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 15/03/2016
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${name}</h1>
<h3>${greetings}</h3>

<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Titel</th>
            <th>Director</th>
            <th>year</th>
            <th>Genre</th>
            <th>Rating</th>
            <th>Evaluation</th>
            <th>Seen</th>
            <th>Update</th>
            <th>Update c url</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${movies}" var="movie">
        <tr>
            <td>${movie.id}</td>
            <td>${movie.title}</td>
            <td>${movie.director}</td>
            <td>${movie.jaar}</td>
            <td>${movie.genre.toString()}</td>
            <td>${movie.rating.toString()}</td>
            <td>${movie.evaluation.toString()}</td>
            <td>${movie.seen}</td>
            <td>
                <spring:url value="/moviecontroller/${movie.id}/update.htm" var="movie1urlupdate"/>
                <spring:url value="/moviecontroller/${movie.id}/update" var="movie2urlupdate"/>
                <spring:url value="/moviecontroller/${movie.id}/delete.htm" var="movie1urldelete" />
                <spring:url value="/moviecontroller/${movie.id}/delete" var="movie2urldelete" />


                <button class="btn btn-primary" onclick="location.href='${movie1urlupdate}'">Query update 1</button>
                <button class="btn btn-primary" onclick="location.href='${movie2urlupdate}'">Query update 2</button>
                <button class="btn btn-danger" onclick="location.href='${movie1urldelete}'">Query delete 1</button>
                <button class="btn btn-danger" onclick="location.href='${movie2urldelete}'">Query delete 2</button>


                <!--<a href="<spring:url value="/moviecontroller/update/${movie.id}.htm"/>">update</a></td>-->

            <td><a href="<c:url value="/moviecontroller/${movie.id}/update.htm"/>">update c url</a>
            <a href="<c:url value="/moviecontroller/${movie.id}/update"/>">update c2 url</a></td>

            <td><a href="<spring:url value="/moviecontroller/delete/${movie.id}.htm"/>">Delete</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>

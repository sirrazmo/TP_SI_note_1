<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Bibliotheque</title>
    </head>

    <body>
        <h1>Liste des livres</h1>
        <form action="bibli" method="post">
            <fieldset>
                <legend>Liste des livres</legend>
                <table>
                    <c:forEach items="${requestScope.RESULTS_LIST}" var="result">
                        <tr>
                            <td>${result.BookBean.title}</td>
                            <td>${result.studentBean.author}</td>
                        </tr>
                    </c:forEach>
    
                </table>
            </fieldset>
        </form>
    </body>

    </html>
<@page language="java" contenType="text/html; charset=UF-8" PageEncoding="UTF-8" %>
<@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt=br">
    <head>
        <meta charset="UTF-8" />
        <title>Categorias</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dis/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
        <h1>Categoria</h1><h1>
            <a href="/categoria/insert" class="btn btn-primary">Novo categoria</a>
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach var="item" items="${categoria}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.nome}</td>
                        <td>
                            <a href="/categoria/update?id=${item.id}" class "btn btn-warnig">Editar</a>
                            <a href="/categoria/update?id=${item.id}" class "btn btn-danger">Excluir</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
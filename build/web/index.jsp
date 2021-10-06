<%-- 
    Document   : index
    Created on : 20-sep-2021, 14:40:25
    Author     : home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <title>Principal</title>
    </head>
    <body>
        <div class="container-fluid">
            <nav class="navbar nav-expand-sm bg-secondary ">
                <img src="img/libro.png"  style=" width:60px">
                <ul class="navbar nav ml-auto font-weight-bolder">
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarCategoria.jsp">REGISTRAR CATEGORIA</a>
                        </li>
                        
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarEditoriales.jsp">REGISTRAR EDITORIALES</a>
                        </li>
                        
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarLibro.jsp">REGISTRAR LIBROS</a>
                        </li>
                    </ul> 
            </nav>
        </div>
        
        <div class="container-fluid">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th>ISBN</th>
                        <th>TITULO</th>
                        <th>AUTOR</th>
                        <th>FECHA</th>
                        <th>EDITORIAL</th>
                        <th>CATEGORIA</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1012</td>
                        <td>IEN AÑOS DE SOLEDAD</td>
                        <td>GABRIEL GARCIA MARQUEZ</td>
                        <td>20/09/2021</td>
                        <td>NORMA</td>
                        <td>LITERATURA COLOMBIANA</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>

<%-- 
    Document   : RegistrarCategoria
    Created on : 20-sep-2021, 15:11:42
    Author     : home
--%>

<%@page import="dao.DaoCategorias"%>
<%@page import="model.Categorias"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid">
            <nav class="navbar nav-expand-sm bg-secondary">
                <img src="img/libro.png"  style=" width:60px">
                <ul class="navbar nav ml-auto font-weight-bolder">
                        
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
                <form action="ControlCategoria" method="POST" class="border p-3 form">
                <h1 class="display-5 text-center font-weight-bolder bg-secondary ">REGISTRAR CATEGORIA</h1>
                <div class="form-group"><!-- comment -->
                    <label for="codigo">CODIGO CATEGORIA:</label>
                    <input type="num" class="form-control" placeholder="Ingrese el codigo de la categoria" name="txtCodCate">
                </div>
                
                <div class="form-group">
                    <label>NOMBRE CATEGORIA</label>
                    <input type= "text" name="txtnomCate" class="form-control" placeholder="Digite el nombre de la Categoria"><!-- comment -->
                </div>
                
                <div class="form-group">
                    <button type="submit" name="accion" value="Registrar" class="btn btn-secondary">REGISTRAR</button>
                    <button type="submit" name="accion" value="Actualizar" class="btn btn-secondary">ACTUALIZAR</button>
                    <button type="submit" name="accion" value="Eliminar" class="btn btn-secondary">ELIMINAR</button>
                </div>
                <div>
                    <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"")%>
                </div>
            </form>
                <div class="container-fluid">
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>CODIGO</th>
                                <th>NOMBRE</th>
                            </tr>
                                
                        </thead>
                        <tbody>
                            <% for(Categorias cate: DaoCategorias.listarCategorias()){ %>
                            <tr>
                                <td> <%=cate.getCodigoCate()%></td>
                                <td> <%=cate.getNombreCate()%></td>
                                <% } %>
                            </tr>
                        </tbody>
                    </table>
                </div>
        </div>
    </body>
</html>

<%-- 
    Document   : RegistrarEditoriales
    Created on : 20-sep-2021, 15:42:59
    Author     : home
--%>

<%@page import="model.Editoriales"%>
<%@page import="dao.DaoEditoriales"%>
<%@page import="dao.DaoEditoriales"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <title> JSP Page </title>
    </head>
    <body>
     <div class="container-fluid">
            <nav class="navbar nav-expand-sm bg-secondary">
                <img src="img/libro.png"  style=" width:60px">
                <ul class="navbar nav ml-auto font-weight-bolder">
                        
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarCategoria.jsp">REGISTRAR CATEGORIAS</a>
                        </li>
                        
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarLibro.jsp">REGISTRAR LIBROS</a>
                        </li>
                    </ul> 
            </nav>
            </div>
            
            <div class="container-fluid">
            <form  action="ControlEditorial" method="POST" class="border p-3 form">
                <h1 class="display-5 text-center font-weight-bolder bg-secondary ">REGISTRAR EDITORIAL</h1>
                <div class="form-group">
                    <label>CODIGO DE LA EDITORIAL</label>
                    <input type= "num" name="txtCodEdit" class="form-control" placeholder="Digite el codigo de su libro">
                    <br>
                    <label>NOMBRE EDITORIAL</label>
                    <input type= "text" name="txtnomEdit" class="form-control" placeholder="Digite el nombre de la Editorial">
                    <br>
                    <label>TELEFONO</label>
                    <input type= "text" name="txttelEdit" class="form-control" placeholder="Digite el telefono de la Editorial">
                    <br>
                    <label>DIRECCION</label>
                    <input type= "text" name="txtdirEdit" class="form-control" placeholder="Digite la direccion de la Editorial">
                    <br>
                    <label>EMAIL</label>
                    <input type= "text" name="txtemailEdit" class="form-control" placeholder="Digite el correo electronico de la Editorial">
                <br>
                <br>
                    <label>SITIO WEB</label>
                    <input type= "text" name="txtSitioWeb" class="form-control" placeholder="Digite el sitio web de la Editorial">
                <br>
                </div>
                
                <div>
                    <button type="submit" name="accion" value="Registrar" class="btn btn-secondary">REGISTRAR</button>
                    <button type="submit" name="accion" value="Actualizar" class="btn btn-secondary">ACTUALIZAR</button>
                    <button type="submit" name="accion" value="Eliminar" class="btn btn-secondary">ELIMINAR</button>
                </div>
                			
                <div><!-- comment -->
                    <%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%>
                </div>
                
            </form>
                
                <div class="container-fluid">
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>CODIGO</th>
                                <th>NOMBRE</th>
                                <th>TELEFONO</th>
                                <th>DIRECCION</th>
                                <th>EMAIL</th>
                                <th>SITIO WEB</th>
                                
                            </tr>
                                
                        </thead>
                        <tbody>
                            <% for(Editoriales edito: DaoEditoriales.listarEditoriales()){ %>
                            <tr>
                                <td> <%=edito.getNitEdit()%></td>
                                <td> <%=edito.getNombreEdit()%></td>
                                <td> <%=edito.getTelefono()%></td>
                                <td> <%=edito.getDireccion()%></td><!-- comment -->
                                <td> <%=edito.getEMAIL()%></td><!-- comment -->
                                <td> <%=edito.getSitioWeb()%></td><!-- comment -->
                                
                                <% } %>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
        </div>
    </body>
</html>

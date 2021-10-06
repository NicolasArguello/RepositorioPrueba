<%-- 
    Document   : RegistrarLibro
    Created on : 20-sep-2021, 17:19:44
    Author     : home
--%>

<%@page import="dao.DaoLibros"%>
<%@page import="model.Libros"%>
<%@page import="model.Libros"%>
<%@page import="dao.DaoEditoriales"%>
<%@page import="model.Editoriales"%>
<%@page import="dao.DaoCategorias"%>
<%@page import="model.Categorias"%>
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
                            <a class="nav-link" href="RegistrarCategoria.jsp">REGISTRAR CATEGORIAS</a>
                        </li>
                        
                        <li  class="nav-item active">
                            <a class="nav-link" href="RegistrarEditoriales.jsp">REGISTRAR EDITORIALES</a>
                        </li>
                    </ul> 
            </nav>
            </div>
            
            <div class="container-fluid">
                <form action="ControlLibros" method="POST" class="border p-3 form">
                <h1 class="display-5 text-center font-weight-bolder bg-secondary">REGISTRAR LIBRO</h1>
                <div class="form-group">
                    <label>CISBN</label>
                    <input type= "num" name="txtCis" class="form-control" placeholder="Digite el codigo de su libro">
                    <br>
                    <label>TITULO</label>
                    <input type= "text" name="txtTitl" class="form-control" placeholder="Digite el titulo de su libro">
                    <br>
                    <label>DESCRIPCION</label>
                    <input type= "text" name="txtDesc" class="form-control" placeholder="Digitela descripcion de su libro">
                    <br>
                    <label>NOMBRE DEL AUTOR</label>
                    <input type= "text" name="txtAutor" class="form-control" placeholder="Digite el nombre del autor del libro">
                    <br>
                    <label>FECHA DE PUBLICACION</label>
                    <input type= "date" name="txtPubli" class="form-control" placeholder="Digite la fecha en la que se publico el libro">
                <br>
                
                
               
                
                
                <div class="form-group">
                    <label for="Ccategoria">CATEGORIA</label>
                    <select name="Ccategoria">
                        <option value="0"></option>
                        <% for(Categorias ca:DaoCategorias.listarCategorias()){ %>
                        <option value="<%=ca.getCodigoCate()%>"><%=ca.getNombreCate()%></option>
                        <% } %>
                    </select>
                </div>
                    
                    <div class="form-group">
                    <br>
                    <label for="LEditorial">EDITORIAL</label>
                    <select name="LEditorial">
                        <option value="0"></option>
                        <%for(Editoriales edt:DaoEditoriales.listarEditoriales()){ %>
                        <option value="<%=edt.getNitEdit()%>"><%=edt.getNombreEdit()%></option>
                            <% } %>
                        
                    </select>
                    </div>
                    
                <br>
                
                <div>
                    <button type="submit" name="accion" value="Registrar" class="btn btn-secondary">REGISTRAR</button>
                    <button type="submit" name="accion" value="Actualizar" class="btn btn-secondary">ACTUALIZAR</button>
                    <button type="submit" name="accion" value="Eliminar" class="btn btn-secondary">ELIMINAR</button>
                </div>
                
                <div><!-- comment -->
                    <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"")%>
                </div>
            </form>
                <br><!-- comment -->
                <br>
                <div class="container-fluid">
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>CODIGO</th>
                                <th>TITULO</th>
                                <th>DESCRIPCION</th>
                                <th>AUTOR</th>
                                <th>PUBLICACION</th>
                                <th>CODC</th>
                                <th>NITED</th>
                              
                                
                            </tr>
                                
                        </thead>
                        <tbody>
                            <% for(Libros libi:DaoLibros.listarLibros()){ %>
                            <tr>
                                <td> <%=libi.getCisbn()%></td>
                                <td> <%=libi.getTitulo()%></td>
                                <td> <%=libi.getDescripcion()%></td>
                                <td> <%=libi.getNombreAuto()%></td>
                                <td> <%=libi.getPublicacion()%></td>
                                <td><%=libi.getCodC()%></td>
                                <td><%=libi.getNitEd()%></td>
                                
                                
                                <% } %>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
        </div>
    </body>
</html>

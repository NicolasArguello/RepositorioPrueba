/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoEditoriales;
import dao.DaoLibros;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libros;

/**
 *
 * @author home
 */
public class ControlLibros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlLibros</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControlLibros at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion=request.getParameter("accion");
        
        int Cisbn= Integer.parseInt(request.getParameter("txtCis"));
        String Titulo= request.getParameter("txtTitl");
        String Descripcion= request.getParameter("txtDesc");
        String NombreAuto= request.getParameter("txtAutor");
        String Publicacion= request.getParameter("txtPubli");
        int CodC=Integer.parseInt(request.getParameter("Ccategoria"));
        String NitEd=request.getParameter("LEditorial");
      
       
        
        Libros libri= new Libros();
        libri.setCisbn(Cisbn);
        libri.setTitulo(Titulo);
        libri.setDescripcion(Descripcion);
        libri.setNombreAuto(NombreAuto);
        libri.setPublicacion(Publicacion);
        libri.setCodC(CodC);
        libri.setNitEd(NitEd);
        
        
        

        
        
        if(accion.equalsIgnoreCase("Registrar")){

        if (DaoLibros.registrarLibro(libri)){
            request.setAttribute("mensaje", "EL LIBRO FUE REGISTRADO");
        }
        else   {
            request.setAttribute("mensaje", "El libro No fue registrado");
            
        }
        
        request.getRequestDispatcher("RegistrarLibro.jsp").forward(request, response);
        
        }else if(accion.equalsIgnoreCase("Actualizar")){
            if(DaoLibros.actualizarLibro(libri)){
                request.setAttribute("mensaje","El libro fue actualizado");
            } else{
                request.setAttribute("mensaje","El libro no se puede actualizar");
            }
        request.getRequestDispatcher("RegistrarLibro.jsp").forward(request, response);
        
    }
        else if(accion.equalsIgnoreCase("Eliminar")){
            if(DaoLibros.eliminarLibro(libri)){
                request.setAttribute("mensaje","El libro fue eliminado");
            }else{
                request.setAttribute("mensaje","El libro no se puede eliminar");
            }
            request.getRequestDispatcher("RegistrarLibro.jsp").forward(request, response);
        }
    }
        
        
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

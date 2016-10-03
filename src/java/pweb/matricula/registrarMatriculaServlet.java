/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.matricula;

import pweb.business.Matricula;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pweb.data.MatriculaDB;

/**
 *
 * @author Fortress of Solitude
 */
public class registrarMatriculaServlet extends HttpServlet {

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
        
        
        
        String idAlumno; 
        String nombreCurso;
        int creditosCurso;
        String cicloCurso; 
        String horario; 
                
        Matricula matriculaC1;
        Matricula matriculaC2;
        Matricula matriculaC3;
        Matricula matriculaC4;
          Matricula matriculaC5;
        
        idAlumno = request.getParameter("idAlumno");
        
        // Curso 1                
        nombreCurso = request.getParameter("nombreC1");
        creditosCurso = Integer.valueOf(request.getParameter("creditosC1"));
        cicloCurso = request.getParameter("cicloC1");   
         horario = request.getParameter("horario1"); 
        matriculaC1 = new Matricula(idAlumno, nombreCurso, creditosCurso, cicloCurso,horario);
        MatriculaDB.insert(matriculaC1);
        
        // Curso 2              
        nombreCurso = request.getParameter("nombreC2");
        creditosCurso = Integer.valueOf(request.getParameter("creditosC2"));
        cicloCurso = request.getParameter("cicloC2");  
        horario = request.getParameter("horario2");
        matriculaC2 = new Matricula(idAlumno, nombreCurso, creditosCurso, cicloCurso,horario);
        MatriculaDB.insert(matriculaC2);
        
        // Curso 3            
        nombreCurso = request.getParameter("nombreC3");
        creditosCurso = Integer.valueOf(request.getParameter("creditosC3"));
        cicloCurso = request.getParameter("cicloC3");  
        horario = request.getParameter("horario3");
        matriculaC3 = new Matricula(idAlumno, nombreCurso, creditosCurso, cicloCurso,horario);
        MatriculaDB.insert(matriculaC3);
        
        // Curso 4              
        nombreCurso = request.getParameter("nombreC4");
        creditosCurso = Integer.valueOf(request.getParameter("creditosC4"));
        cicloCurso = request.getParameter("cicloC4");  
        horario = request.getParameter("horario5");
        matriculaC4 = new Matricula(idAlumno, nombreCurso, creditosCurso, cicloCurso,horario);
        MatriculaDB.insert(matriculaC4);
        
        // establecer objeto Usuario en el objeto request y establecer la URL
        request.setAttribute("matriculaC1", matriculaC1);
        request.setAttribute("matriculaC2", matriculaC2);
        request.setAttribute("matriculaC3", matriculaC3);
        request.setAttribute("matriculaC4", matriculaC4);
        
        
        String url = "/confirmacion.jsp";   
                
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);        
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
        processRequest(request, response);
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

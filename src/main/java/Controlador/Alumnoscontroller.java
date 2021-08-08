/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnosDAO;
import Modelo.Alumnos;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cielo
 */
@WebServlet(name = "Alumnoscontroller", urlPatterns = {"/Alumnoscontroller"})
public class Alumnoscontroller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try ( PrintWriter out = response.getWriter()) {
        
        }
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlumnosDAO alumnosDao;
        try {
            alumnosDao = new AlumnosDAO();
        
            String accion;
            RequestDispatcher dispatcher = null;
            accion = request.getParameter("accion");
            if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Vistas/Alumnos.jsp");
            }else if(accion.equals("modificar")){
                dispatcher = request.getRequestDispatcher("Vistas/Modificar.jsp");
                
                
            }else if (accion.equals("actualizar")){
                int id = Integer.parseInt(request.getParameter("id"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String email = request.getParameter("email");
                Alumnos alumno = new Alumnos(id,nombre,apellido,email);
                alumnosDao.actualizarAlumnos(alumno);
                
                dispatcher = request.getRequestDispatcher("Vistas/Alumnos.jsp");
            }else if(accion.equals("eliminar")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                
                alumnosDao.eliminarAlumno(id);
                
                dispatcher = request.getRequestDispatcher("Vistas/Alumnos.jsp");
            }else if(accion.equals("nuevo")){
                dispatcher = request.getRequestDispatcher("Vistas/Nuevo.jsp");
            }else if(accion.equals("insert")){
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String email = request.getParameter("email");
                Alumnos alumno = new Alumnos(0,nombre,apellido,email);
                
                alumnosDao.insertarAlumnos(alumno);
                
                dispatcher = request.getRequestDispatcher("Vistas/Alumnos.jsp");
            }else{
                dispatcher = request.getRequestDispatcher("Vistas/Alumnos.jsp");
            }
            dispatcher.forward(request,response);
         } catch (SQLException ex) {
            Logger.getLogger(Alumnoscontroller.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }//Dentro de doPost vamos a llamar a doGet esto porque usamos un solo Servlet de este modo el MVC trabajaría mejor dentro del llamado enviamos la petición y la respuesta doGet(request,response);
 
//Ahora dentro de doGet vamos a realizar las siguientes instrucciones:
    //Creamos una instancia de la clase AlumnosDAO esto ejecuta la conexión a la base de datos
    //Creamos una variable de tipo String accion
    //Creamos una variable de tipo RequestDispatcher para indicar a que vista es la que vamos a mostrar
    //Le asignamos a accion los parámetros que recibimos en el request usando el método  getParameter();
    //Creamos un if donde vamos a tomar las decisiones dependiendo de los parámetros recibidos a través de la url

}

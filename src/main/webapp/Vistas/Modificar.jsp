<%-- 
    Document   : Modificar
    Created on : 15 jul. 2021, 17:24:10
    Author     : cielo
--%>
<%@page import="Modelo.AlumnosDAO"%>
<%@page import="Modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Alumno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <%
            String id = request.getParameter("id");//Usar solicitud para obtener
            int mid;
            mid = Integer.parseInt(id);
            Alumnos resultado = null;
            AlumnosDAO alumnosDao = new AlumnosDAO();
            resultado = alumnosDao.mostrarAlumno(mid);
            %>
        <div class="container">
             <h1 class="text-center">Modificar Alumno</h1>
                <div class="row">
                    <form class="p-5"action="Alumnoscontroller" method="get"><!-- aquí agregamos el método -->
                        <input type="hidden" class="form-control" id="accion" name="accion" value="actualizar">
                        <input type="hidden" class="form-control" id="id" name="id" value=<%= resultado.getId()%>>
                        <div class="mb-3">
                          <label for="nombre" class="form-label">Nombre</label>
                          <input type="text" class="form-control" id="nombre" name="nombre" value=<%=resultado.getNombre()%>>
                        </div>
                        <div class="mb-3">
                          <label for="apellido" class="form-label">Apellido</label>
                          <input type="text" class="form-control" id="apellido" name="apellido" value=<%=resultado.getApellido()%>>
                        </div>
                        <div class="mb-3">
                          <label for="email" class="form-label">Email</label>
                          <input type="email" class="form-control" id="email" name="email" value=<%=resultado.getEmail()%>>
                        </div>
                        <button type="submit" class="btn btn-primary">Modificar</button>
                     </form>
                </div><!-- Copiamos el formulario del archivo de nuevo.jsp y lo pegamos en modificar.jsp, agregando el input del id con el type=hidden (oculto) porque ese es el que vamos a usar para hacer el insert a ese usuario -->
        </div><!<!-- Creando los métodos para el crud
Vamos a nuestro archivo AlumnosDAO.java (Objeto de acceso a Datos) que se encarga de suministrar una interfaz común entre nuestra aplicación y la base de datos donde vamos a crear un objeto para la conexión a la base de datos y un método para listar alumnos que lo vamos a usar para mostrar al momento de hacer una consulta en el archivo alumnos.jsp -->
    </body>
</html>

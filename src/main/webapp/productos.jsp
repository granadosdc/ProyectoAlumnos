
<%@page import="modelo.ProductosDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Productos"%>
<%@page import="java.*"%>
<%@page import="java.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th>Id</th><!-- comment -->
                            <th>Prod</th><!-- comment -->
                            <th>Descripción</th><!-- comment -->
                            <th>Precio</th><!-- comment -->
                            <th>Modificar</th><!-- comment -->
                            <th>Eliminar</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                       <%
                       List<Productos> resultado = null;
                       ProductosDAO producto = new ProductosDAO();
                       resultado = producto.ListarProductos();
                       
                       for(int i=0; i< resultado.size(); i++){
                       %>
                       <tr>
                            <td> <%= resultado.get(i).getId() %></<td>
                            <td> <%= resultado.get(i).getProd() %></<td>
                            <td> <%= resultado.get(i).getDescripción() %></<td>
                            <td> <%= resultado.get(i).getPrecio() %></<td>
                       </tr>
                       <%
                       }
                       %> 
                    </tbody>
                </table>
              </div>
           </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>

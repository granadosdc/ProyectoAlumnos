<%-- 
    Document   : modificar
    Created on : 8 ago. 2021, 13:09:56
    Author     : cielo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="css/estilosnuevo.css" rel="stylesheet" type="text/css"/>
</head>
<body>
        <div class="container">
            <h3 class="text-center">Bienvenidos al Sistema</h3>
            <div class="row">
                <form class="" action="" >
                    <div class="container col-lg-3">
                    <div class="form-group text-center">
                        <img src="img/logosf.png" class="background-image" alt="" height="50" width="50"/>
                        <p><strong></strong>Modificar</p>
                    </div>
                    <div class="mb-3">
                      <label for="id" class="form-label"></label>
                      <input type="hidden" class="form-control" id="id" name="id" aria-describedby="email">
                    </div>
                    <div class="mb-3">
                      <label for="producto" class="form-label">Producto</label>
                      <input type="text" class="form-control" id="producto" name="producto" aria-describedby="email">
                    </div>
                    <div class="mb-3">
                      <label for="descripción" class="form-label">Descripción</label>
                      <input type="text" class="form-control" id="descripción" name="descripción">
                    </div>
                    <div class="mb-3">
                      <label for="precio" class="form-label">Precio</label>
                      <input type="text" class="form-control" id="precio" name="precio">
                    </div>
                    <button type="submit" class="btn btn-primary">Modificar</button>
                    </div>
                </form>
            </div>
        </div>
           
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script><!-- comment -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
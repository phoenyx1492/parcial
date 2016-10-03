<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Registrar Alumno</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    
    <h1>REGISTRAR ALUMNO</h1>        
    <h1>USUARIO: ${user}</h1> <br>
    
    <p>Introduce datos del alumno.</p>
    
    <form action="registrarAlumno" method="post">               
        
        <label class="pad_top">Codigo</label>        
        <input type="text"   name="id" required><br>        
        
        <label class="pad_top">Nombre</label>        
        <input type="text" name="firstName" required><br>        
        
        <label class="pad_top">Apellidos</label>        
        <input type="text" name="lastName" required><br>           
                      
        <label class="pad_top">Email</label>        
        <input type="email" name="email" required><br>   
        
        <label>&nbsp;</label>        
        <input type="submit" value="REGISTRAR ALUMNO" class="margin_left">   
        
    </form>        
    
</body>
</html>
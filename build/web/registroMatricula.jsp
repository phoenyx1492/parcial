<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Registrar Matricula</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
    </head>
    
    <body>
        <h1>REGISTRO DE MATRICULA</h1>        
        <h1>${alumno.firstName} ${alumno.lastName}</h1><br>              
        
        <p>Ingrese datos de los cursos a matricularse:</p>   
               
        <form action="registrarMatricula" method="post">
            <table>
                
                <thead>
                    <tr>
                      <th>Nombre</th>
                      <th>Ciclo</th>
                      <th>Creditos</th>
                      <th>Horario</th>
                    </tr>
                </thead>
                
                <tbody>
                    <tr>                    
                        <td><input type="text" name="cicloC1" class="input-table"></td>
                        <td><input type="text" name="nombreC1" class="input-table"></td>
                        <td><input type="text" name="creditosC1" class="input-table"></td> 
                        <td><input type="text" name="horario1" class="input-table"></td>
                    </tr>                
                    <tr>                    
                        <td><input type="text" name="cicloC2" class="input-table"></td>
                        <td><input type="text" name="nombreC2" class="input-table"></td>
                        <td><input type="text" name="creditosC2" class="input-table"></td> 
                        <td><input type="text" name="horario2" class="input-table"></td>
                    </tr>                             
                    <tr>                    
                        <td><input type="text" name="cicloC3" class="input-table"></td>
                        <td><input type="text" name="nombreC3" class="input-table"></td>
                        <td><input type="text" name="creditosC3" class="input-table"></td> 
                        <td><input type="text" name="horario3" class="input-table"></td>
                    </tr> 
                    <tr>                    
                        <td><input type="text" name="cicloC4" class="input-table"></td>
                        <td><input type="text" name="nombreC4" class="input-table"></td>
                        <td><input type="text" name="creditosC4" class="input-table"></td> 
                        <td><input type="text" name="horario4" class="input-table"></td>
                    </tr> 
                    <tr>                    
                        <td colspan="3" align="center">
                            <input type="submit" value="REGISTRAR MATRICULA">                         
                            <input hidden type="text" name="idAlumno" value="${alumno.id}">                        
                        </td>
                    </tr>
                </tbody>
            </table>            
        </form>
    </body>
</html>

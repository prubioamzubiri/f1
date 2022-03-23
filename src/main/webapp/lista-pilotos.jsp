<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pilotos de f1 2022</title>
</head>
<body>

<table class="center_table">

  <tr>

    <td>Foto del piloto</td>
    <td>Nombre del Piloto</td>
    <td>Número del piloto</td>
    <td>Mundiales Ganados</td>
    <td>Año de nacimiento</td>   
    <td>Año de debut</td>    


  </tr>


  <c:forEach var="p" items="${pilotos}">
    <tr>
      <td> <img src="${p.foto}" alt="" width="80" height="80"></td>
      <td> ${p.nombre} </td>
      <td> ${p.numero} </td>
      <td> ${p.mundiales}</td>
      <td> ${p.ano_nacimiento} </td>
      <td> ${p.primera_temporada}</td>
    </tr>
  </c:forEach>
  
  <tr>
    <td><img src="fotos/pilotos/fernando-alonso-2022.png" alt="" width="80" height="80"></td>
    <td>Fernando Alonso</td>
    <td>14</td>
    <td>2</td>
    <td>1981</td>
    <td>2001</td>


  </tr>
  
  <tr>

    <td><img src="fotos/pilotos/sebastian-vettel-2022.png" alt="" width="80" height="80"></td>
    <td>Sebastian Vettel</td>
    <td>5</td>
    <td>4</td>
    <td>1987</td>
    <td>2007</td>


  </tr>

</table>


</body>
</html>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>

<title>Listado de Alumnos por Nombre</title>
</head>
<body> 

 <div class="container">
 <h1>Alumno por nombre</h1>
		 <div class="col-md-23" >  
			  <form id="idFormElimina" action="eliminaModalidad">
			  		<input type="hidden" id="id_elimina" name="id">
			  </form>	
				
		       <form accept-charset="UTF-8"  action="listaAlumnoPorNombre" class="simple_form" id="defaultForm2"  method="post">
					<div class="row">
						<div class="col-md-3">	
							<div class="form-group">
							  	<input class="form-control" id="id_nonbre_filtro"  name="filtro" placeholder="Ingrese el nombre" type="text" maxlength="30"/>
							</div>
				
						</div>
					</div>			
					<div class="row">
						<div class="col-md-3">
							<button type="submit" class="btn btn-primary" id="validateBtnw1" >FILTRA</button><br>&nbsp;<br>
						</div>
						
					</div>
					<div class="row" > 
						<div class="col-md-12">
								<div class="content" >
						
									<table id="tableAlumno" class="table table-striped table-bordered" >
					
										<thead>
											<tr>
												<th>ID</th>
												<th>Nombre</th>
												<th>Apellido</th>
												<th>Fecha</th>
												<th>Correo</th>												
												<th>Actualiza</th>
												<th>Elimina</th>
											</tr>
										</thead>
										<tbody>
												   
												<c:forEach items="${ALUMNOS}" var="x">
													<tr>
														<td>${x.idAlumno}</td>
														<td>${x.nombre}</td>
														<td>${x.apellido}</td>
														<td>${x.fechaNacimiento}</td>
														<td>${x.correo}</td>														
													</tr>
												</c:forEach>
										</tbody>
										</table>	
									
								</div>	
						</div>
					</div>
		 		</form>
		  </div>
</div>

</body>
</html> 
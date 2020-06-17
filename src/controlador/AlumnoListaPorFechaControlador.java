package controlador;

import java.io.IOException;
import java.sql.Date;

import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Alumno;
import model.AlumnoModel;

/**
 * Servlet implementation class AlumnoListaPorFechaControlador
 */
@WebServlet("/AlumnoListaPorFechaControlador")
public class AlumnoListaPorFechaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
			AlumnoModel m = new AlumnoModel();
		
		
		try {		
			
			Date fecha1 = Date.valueOf(request.getParameter("desde"));
			Date fecha2 = Date.valueOf(request.getParameter("hasta"));
			
			List<Alumno> lista = m.listaAlumnoPorFecha(fecha1,fecha2);			
			
			request.setAttribute("ALUMNOS", lista);
			
			
			request.getRequestDispatcher("/listaAlumnoPorFecha.jsp").forward(request, response);
			
		} catch (Exception e) {
			List<Alumno> lista2 = m.listaAlumno();
			request.setAttribute("ALUMNOS", lista2);
			request.getRequestDispatcher("/listaAlumnoPorFecha.jsp").forward(request, response);
		}
		
	}

}

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

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		
				Date fil1 = Date.valueOf(request.getParameter("fecha1"));
				Date fil2 = Date.valueOf(request.getParameter("fecha2"));
			
				
				
				AlumnoModel m = new AlumnoModel();
				List<Alumno> lista = m.listaAlumnoPorFecha(fil1,fil2);
				
				
				request.setAttribute("ALUMNOS", lista);
				
				
				request.getRequestDispatcher("/listaAlumnoPorFecha.jsp").forward(request, response);;
	}

}

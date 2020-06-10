package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Alumno;
import model.AlumnoModel;

/**
 * Servlet implementation class AlumnoListaPorApellidoControlador
 */
@WebServlet("/AlumnoListaPorApellidoControlador")
public class AlumnoListaPorApellidoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				//1. recibe el filtro del JSP
				String fil = request.getParameter("apellido");				
				
				
				AlumnoModel m = new AlumnoModel();
				List<Alumno> lista = m.listaAlumnoPorApellido(fil);
				
				
				request.setAttribute("ALUMNOS", lista);
				
				
				request.getRequestDispatcher("/listaAlumnoPorApellido.jsp").forward(request, response);;
				
	}

}

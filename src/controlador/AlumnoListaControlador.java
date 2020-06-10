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
 * Servlet implementation class AlumnoListaControlador
 */
@WebServlet("/listaAlumnoPorNombre")
public class AlumnoListaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1. recibe el filtro del JSP
		String fil = request.getParameter("filtro");
		
		
		//2. realiza la consulta en la BD
		AlumnoModel m = new AlumnoModel();
		List<Alumno> lista = m.listaAlumnoPorNombre(fil);
		
		//3. Se envia la data a la memoria request
		request.setAttribute("ALUMNOS", lista);
		
		//4. Se reenvia al JSP listaAlumnoPorNombre
		request.getRequestDispatcher("/listaAlumnoPorNombre.jsp").forward(request, response);;
		
	}

}

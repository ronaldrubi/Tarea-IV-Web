package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ProfesorRepository;
import domain.Profesor;

import util.ProfesorDTO;
import util.ProfesorAssembler;

public class InsertarProfesor extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      ProfesorRepository profesores = (ProfesorRepository) context.getBean("profesorRepository");
    try {
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String titulo = request.getParameter("titulo");
        String area = request.getParameter("area");
        String telefono = request.getParameter("telefono");
		Profesor prof = new Profesor();
        try {
			if (cedula!=null) prof.setCedula(cedula);
            if (nombre!=null) prof.setNombre(nombre);
            if (titulo!=null) prof.setTitulo(titulo);
            if (area!=null) prof.setArea(area);
            if (telefono!=null) prof.setTelefono(telefono);
                profesores.insertProfesor(prof);
        } catch (Exception e) {}
        response.sendRedirect("listaProfesores");
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}
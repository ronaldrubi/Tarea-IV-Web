package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.GrupoRepository;
import domain.Grupo;
import util.GrupoDTO;
import util.GrupoAssembler;

public class DetalleGrupo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      GrupoRepository grupos =
        (GrupoRepository) context.getBean("grupoRepository");
    try {
      String id = request.getParameter("id");
      int idGrupo = Integer.parseInt(id);
      Grupo grupo = grupos.findGrupo(idGrupo);
      GrupoDTO dto = GrupoAssembler.CreateDTO(grupo);
      request.setAttribute("grupo",dto);
      forward("/detalleGrupo.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}
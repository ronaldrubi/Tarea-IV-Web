package util;

public class GrupoDTO {
  private int id;
  private String numero;
  private String sigla;
  private String nombre;
  private String horario;
  private String aula;
  private String id_profesor;

  public int getId() {return id;}
  public String getNumero() {return numero;}
  public String getSigla() {return sigla;}
  public String getNombre() {return nombre;}
  public String getHorario() {return horario;}
  public String getAula() {return aula;}
  public String getId_profesor() {return id_profesor;}
  public void setId(int id) {this.id=id;}
  public void setNumero(String num) {numero=num;}
  public void setSigla(String sig) {sigla=sig;}
  public void setNombre(String nom) {nombre=nom;}
  public void setHorario(String hor) {horario=hor;}
  public void setAula(String aul) {aula=aul;}
  public void setId_profesor(String id_prof) {id_profesor=id_prof;}
}
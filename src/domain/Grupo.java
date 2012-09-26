package domain;

public class Grupo {
  private int id;
  private String numero;
  private String sigla;
  private String nombre;
  private String horario;
  private String aula;
  private String id_profesor;

  public Grupo () {};
  public void setId(int id) {this.id=id;}
  public void setNumero(String numero) {this.numero=numero;}
  public void setSigla(String sigla) {this.sigla=sigla;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setHorario(String horario) {this.horario=horario;}
  public void setAula(String aula) {this.aula=aula;}
  public void setId_profesor(String id_profesor) {this.id_profesor=id_profesor;}
  public int getId() {return id;}
  public String getNumero() {return numero;}
  public String getSigla() {return sigla;}
  public String getNombre() {return nombre;}
  public String getHorario() {return horario;}
  public String getAula() {return aula;}
  public String getId_profesor() {return id_profesor;}
}

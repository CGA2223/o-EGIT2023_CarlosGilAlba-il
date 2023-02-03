package persona;

public class persona {
private String nombre;
private String apellido;
private int edad;
public persona(String nombre, String apellido, int edad) {
  this.nombre = nombre;
  this.apellido = apellido;
  this.edad = edad;
}
public void  cumpleanios(){
  edad++;
  System.out.println(edad);
}
}

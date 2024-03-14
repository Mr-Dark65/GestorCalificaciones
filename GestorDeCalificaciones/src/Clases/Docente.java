package Clases;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Docente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String materia;

    public Docente(String nombre, String apellido, String cedula, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.materia = materia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}

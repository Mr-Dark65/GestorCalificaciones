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
    private ArrayList<String> materias;

    public Docente() {
        materias = new ArrayList<>();
    }

    public Docente(String nombre, String apellido, String cedula, ArrayList<String> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.materias = materias;
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

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void agregarMateria(String materia) {
        materias.add(materia);
    }
}

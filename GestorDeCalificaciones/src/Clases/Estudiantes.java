package Clases;


public class Estudiantes {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private Materia materias;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String cedula, Materia materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.materias = materias;
    }

    
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Materia getMaterias() {
        return this.materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }
    
    
    
}

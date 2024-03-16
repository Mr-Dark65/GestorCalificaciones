package Clases;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Materia {
    private String nombreMateria;
    private ArrayList<Estudiante> estudiante;
    
    public Materia(){
        
    }

    public Materia(String nombre) {
        this.nombreMateria = nombre;
        this.estudiante = new ArrayList<>();
    }

    // Getter y setter
    public String getNombre() {
        return nombreMateria;
    }

    public void setNombre(String nombre) {
        this.nombreMateria = nombre;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante.add(estudiante);
    }
    
}

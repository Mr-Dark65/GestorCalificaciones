package Clases;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Almacen {

    protected static Almacen instance;

    public ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public ArrayList<Docente> informacion = new ArrayList<>();
    public ArrayList<Materia> materias = new ArrayList<>();

    Almacen() {
    }

    public static Almacen getInstance() {
        if (instance == null) {
            instance = new Almacen();
        }
        return instance;
    }

}

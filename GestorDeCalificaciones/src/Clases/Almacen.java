package Clases;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Almacen {
    
    private static Almacen instance;

    public ArrayList<Estudiante> estudiantes = new ArrayList<>();
    

    private Almacen() {
    }

    public static Almacen getInstance() {
        if (instance == null) {
            instance = new Almacen();
        }
        return instance;
    }
    
}

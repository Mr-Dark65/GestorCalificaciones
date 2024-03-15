/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thexe
 */
public class Controles {

    public boolean verificarCedula(String cedula) {
        if (cedula.length() != 10) {
            return false;
        }
        for (int i = 0; i < cedula.length(); i++) {
            if (!Character.isDigit(cedula.charAt(i))) {
                return false;
            }
        }
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            if (i % 2 == 0) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }
            suma += digito;
        }
        int ultimoDigito = Character.getNumericValue(cedula.charAt(9));
        int digitoVerificador = (suma % 10 == 0) ? 0 : (10 - (suma % 10));

        return ultimoDigito == digitoVerificador;
    }

    public boolean validarCamposEstudiante(String nombre, String apellido, String cedula, String materia) {
        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || materia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!cedula.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "La cédula debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!nombre.matches("[a-zA-Z]+") || !apellido.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Los campos de nombre, apellido y materia deben contener solo letras.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean verificarCedulaDocente(String cedula) {
        Almacen almacen = Almacen.getInstance();

        for (Docente docente : almacen.informacion) {
            if (docente.getCedula().equalsIgnoreCase(cedula)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarEstudianteMateria(String cedulaEstudiante, String materia) {
        // Obtener la instancia de Almacen
        Almacen almacen = Almacen.getInstance();

        // Obtener la lista de estudiantes
        ArrayList<Estudiante> estudiantes = almacen.estudiantes;

        // Iterar sobre los estudiantes y buscar el estudiante con la cédula dada
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedulaEstudiante)) {
                // Verificar si el estudiante tiene la materia
                for (String materiaEstudiante : estudiante.getMateria()) {
                    if (materiaEstudiante.equalsIgnoreCase(materia)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

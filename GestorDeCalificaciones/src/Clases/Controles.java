/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

    public boolean validarFecha(String fechaString) {
        int dia, mes, anio;
        String[] fechaArray = fechaString.split("/");
        try {
            if (!(fechaArray.length == 3)) {
                return false;
            }
            dia = Integer.parseInt(fechaArray[0]);
            mes = Integer.parseInt(fechaArray[1]);
            anio = Integer.parseInt(fechaArray[2]);
        } catch (NumberFormatException e) {
            //Formato de fechaHoy inválido. Por favor, ingrese una fechaHoy en el formato dd/mm/yyyy o d/m/yyyy
            return false;
        }
        if (anio < 2024) {
            return false;
        }
        if (mes >= 1 && mes <= 12) {

            // Validar fecha biciesta(febrero)
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                if (mes == 2 && dia >= 30) {
                    return false;
                }
            } else {
                if (mes == 2 && dia >= 29) {
                    return false;
                }
            }

            // Validar mes con 31 días
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 32) {
                return false;
            } // Validar mes con 30 días
            else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 31) {
                return false;
            }
        } else if (mes > 31) {
            mes = 0;
            return false;
        } else {
            return false;
        }
        return true;
    }

    public boolean validarNota(String nota) {
        double notaVerificada;

        try {
            notaVerificada = Double.parseDouble(nota);
            return notaVerificada <= 10.0;
        } catch (Exception e) {
            return false;
        }

    }

   public void TypingNumsDec(JTextField txt, java.awt.event.KeyEvent evt) {

        char caracter = evt.getKeyChar();
        if (!(caracter >= '0' && caracter <= '9') && caracter != '.') {
            evt.consume();
        }
        if (txt.getText().contains(".") && caracter == '.') {
            evt.consume();
        }
        if (txt.getText().contains(".")) {
            if (txt.getText().length() > txt.getText().indexOf(".") + 2) {
                evt.consume();
            }
            if (!(txt.getText().matches("^\\d+(\\.\\d{0,1})?$"))) {
                evt.consume();
            }
        }

    }
      public boolean txtOnlyNumbers(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            return false;
        }
        return true;
    }

}

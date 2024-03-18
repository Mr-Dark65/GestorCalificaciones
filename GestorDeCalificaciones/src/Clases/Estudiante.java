/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author thexe
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<String> materia;
    private double nota;
    private String fecha;
    
    public Estudiante(){
        materia = new ArrayList<>();
    }
    
    public Estudiante(String nombre, String apellido, String cedula, ArrayList<String> materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.materia = materia;
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

    public ArrayList<String> getMateria() {
        return this.materia;
    }

    public void agregarMateria(String materias) {
        materia.add(materias);
    }
    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", materia=" + materia + ", nota=" + nota + ", fecha=" + fecha + '}';
    }
    
    
    
    
    
}

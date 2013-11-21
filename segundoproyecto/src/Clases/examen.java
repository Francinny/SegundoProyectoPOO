/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import javax.swing.JInternalFrame;

/**
 *
 * @author Francinny
 */
public class examen{
    private String nombre;
    private LinkedList <seccion> secciones;

    public examen(String desc) {
        nombre= desc;
    }

    public examen(String nombre, LinkedList<seccion> secciones) {
        this.nombre = nombre;
        this.secciones = secciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSecciones(LinkedList<seccion> secciones) {
        this.secciones = secciones;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<seccion> getSecciones() {
        return secciones;
    }
    
    
}

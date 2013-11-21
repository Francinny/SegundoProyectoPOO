/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Francinny
 */
public class Controlador {
 
 private LinkedList <examen> examenes = new LinkedList<>();
 private LinkedList <preguntas> preguntas = new LinkedList<>();
 private LinkedList <seccion> seccion = new LinkedList<>();

    public LinkedList<preguntas> getPreguntas() {
        return preguntas;
    }

    public LinkedList<seccion> getSeccion() {
        return seccion;
    }

    public LinkedList <examen> getExamenes() {
        return examenes;
    }
    
    
    /**
     * Inserta examen en la lista de examenes
     * @param e examen a insertar 
     */
    
    public void insertar(examen e){
     examenes.add(e);
    }
    
    /**
     * Inserta seccion en la lista de secciones
     * @param s 
     */
    public void insertar(seccion s){
     seccion.add(s);
    }
    
   
}

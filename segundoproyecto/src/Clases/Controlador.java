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

    public LinkedList getExamenes() {
        return examenes;
    }
}

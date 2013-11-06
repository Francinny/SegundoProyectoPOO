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
public class seccion extends JInternalFrame{

private String descripcion;
LinkedList <preguntas> preguntas;

    public seccion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LinkedList<preguntas> getPreguntas() {
        return preguntas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreguntas(LinkedList<preguntas> preguntas) {
        this.preguntas = preguntas;
    }
   
}

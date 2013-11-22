/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

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
    
   
    
     public void cargaDinamica() {
        try {

            if (GUI.Sistema.jFileChooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

                String nameFile = GUI.Sistema.jFileChooser1.getSelectedFile().getName().toString();
                String a = "";
                for (int i = 0; i < nameFile.length(); i++) {
                    if (String.valueOf(nameFile.charAt(i)).compareTo(".") == 0) {
                        a = nameFile.substring(0, i);
                    }
                }

                FileClassLoader loaderFile = new FileClassLoader(GUI.Sistema.jFileChooser1.getSelectedFile().getParent());
                Class c = loaderFile.loadClass(a);

                try {
                   
                    JInternalFrame j = new JInternalFrame() ;
                    j = (JInternalFrame)c.newInstance();
                    GUI.Sistema.jDesktopPane1.add(j);
                    ((Pregunta)j).insertarInfo();
                 

                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (Exception ex) {
                 

                }
            }
        } catch (ClassNotFoundException ex) {
           

        }
    }
}

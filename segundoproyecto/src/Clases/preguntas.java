
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
public class preguntas extends JInternalFrame implements Pregunta{

   
    
    private String pregunta;
    private String respuesta;
    private LinkedList opciones;
    private String num_Pregunta;
    private String respuestaSeleccionada;
    private double pAcierto;
    private int valorpts;
    
    
   
    public preguntas(String preg, String resp, LinkedList opc, String num_Preg, 
             String respSelec, double pAc, int valpts ) {
        pregunta = preg;
        respuesta = resp;
        opciones = opc;
        num_Pregunta = num_Preg;
       
        respuestaSeleccionada= respSelec;
        pAcierto= pAc;
        valorpts=valpts;
        
    } 

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public LinkedList getOpciones() {
        return opciones;
    }

    public String getNum_Pregunta() {
        return num_Pregunta;
    }

    public String getRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public double getpAcierto() {
        return pAcierto;
    }

    public int getValorpts() {
        return valorpts;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setOpciones(LinkedList opciones) {
        this.opciones = opciones;
    }

    public void setNum_Pregunta(String num_Pregunta) {
        this.num_Pregunta = num_Pregunta;
    }

    public void setRespuestaSeleccionada(String respuestaSeleccionada) {
        this.respuestaSeleccionada = respuestaSeleccionada;
    }

    public void setpAcierto(double pAcierto) {
        this.pAcierto = pAcierto;
    }

    public void setValorpts(int valorpts) {
        this.valorpts = valorpts;
    }
 

    @Override
    public void insertarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evaluarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplegarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

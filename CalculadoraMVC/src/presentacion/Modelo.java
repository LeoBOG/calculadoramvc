/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author LOREJUE021
 */
public class Modelo {
    private Ventana ventana;

    public void iniciar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        getVentana().setSize(400, 400);
        getVentana().setVisible(true);
    }

    private Ventana getVentana() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ventana == null){
            ventana = new Ventana(this);
        }
        return ventana;
    }   
}

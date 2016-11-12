/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LOREJUE021
 */
import presentacion.*;

public class Launcher {
    private Modelo miApp;
   
    public Launcher() {
        miApp = new Modelo();
        miApp.iniciar();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Launcher();
    }
}

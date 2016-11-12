/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.*;

/**
 *
 * @author LOREJUE021
 */
public class Ventana extends JFrame{
  private JLabel lblNum1, lblNum2, lblResultado;
  private JTextField txtNum1, txtNum2;
  private JButton btnSumar;

  private Controlador control;
  private Modelo modelo;

  public Ventana (Modelo modelo){
    this.modelo = modelo;
    iniciarComponentes();
    capturarEventos();
  }

  public void iniciarComponentes(){
    lblNum1 = new JLabel();
    lblNum1.setText("Numero 1");
    lblNum1.setSize(60,30);
    lblNum1.setLocation(20,30);
    
    lblNum2 = new JLabel();
    lblNum2.setText("Numero 2");
    lblNum2.setSize(60,30);
    lblNum2.setLocation(20,50);

    lblResultado = new JLabel();
    lblResultado.setText("Resultado");
    lblResultado.setSize(60,30);
    lblResultado.setLocation(20,70);

    txtNum1 = new JTextField();
    txtNum1.setSize(60,30);
    txtNum1.setLocation(60,30);  

    txtNum2 = new JTextField();
    txtNum2.setSize(60,30);
    txtNum2.setLocation(60,50);  
       
    btnSumar = new JButton("Sumar");
    btnSumar.setSize(60, 30);
    btnSumar.setLocation(40,70);
   
    getContentPane().setLayout(null);
    getContentPane().add(lblNum1);
    getContentPane().add(lblNum2);
    getContentPane().add(lblResultado);
    getContentPane().add(txtNum1);
    getContentPane().add(txtNum2);
    getContentPane().add(btnSumar);
  }

  protected void capturarEventos(){
//    btnSumar.addActionListener(getControl());
  }

  public Controlador getControl(){
    if(control == null){
      control = new Controlador(this);
    }
    return control;
  }
}
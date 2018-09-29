/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6.ventana;

import javax.swing.*;

/**
 *
 * @author alumno
 */
public class VentanaAgregarComp extends JFrame{
    
    JLabel etiqComputadora,etiqId,etiqNombre,etiqModelo,etiqPrecio;
    
    JTextField campoId,campoNombre,campoModelo,campoPrecio;
    
    JButton ok,cancelar;
    
    JPanel etiqComp,etiqIdCampo,etiqNombreCampo,etiqModeloCampo,etiqPrecioCampo,botones;
    
    
    
    
    
    public VentanaAgregarComp(){
        
        configurarVentana();
        
        
        
        
        
    }
    
    
    public void configurarVentana(){
        
        setTitle("Agregar Computadora");
        
        setSize(500,300);
        
        setLocationRelativeTo(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        
    }
    
    public void configurarComponentes(String nombre){
        
        
        
    }
    
}

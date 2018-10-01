/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6.ventana;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alumno
 */
public class VentanaAgregarComp extends JFrame implements ActionListener{
    
    JLabel etiqComputadora,etiqId,etiqNombre,etiqModelo,etiqPrecio;
    
    JTextField campoId,campoNombre,campoModelo,campoPrecio;
    
    JButton ok,cancelar;
    
    JPanel panelSuperior,panelCentro,panelInferior;
    
    
    
    
    
    public VentanaAgregarComp(VentanaPrincipal vPrincipal){
        
        configurarVentana();
        
        
        // panel superior  --> etiqueta COMPUTADORA
        
        panelSuperior = new JPanel();
        
        etiqComputadora = new JLabel("COMPUTADORA");
        
        panelSuperior.add(etiqComputadora);
        
        add(panelSuperior,BorderLayout.NORTH);
        
        // panel inferior --> botones
        
        panelInferior = new JPanel();
        
        ok = new JButton("OK");
        
        cancelar = new JButton("CANCELAR");
        
        panelInferior.add(ok);
        
        panelInferior.add(cancelar);
        
        add(panelInferior,BorderLayout.SOUTH);
        
        
        // panel centro --> etiquetas y campos
        
        
        panelCentro = new JPanel();
        
        etiqId = new JLabel("Id: ");
        
        campoId = new JTextField(10);
        
        panelCentro.add(etiqId);
        
        panelCentro.add(campoId);
        
        etiqNombre = new JLabel ("Nombre: ");
        
        campoNombre = new JTextField(10);
        
        panelCentro.add(etiqNombre);
        
        panelCentro.add(campoNombre);
        
        etiqModelo = new JLabel("Modelo: ");
        
        campoModelo = new JTextField(10);
        
        panelCentro.add(etiqModelo);
        
        panelCentro.add(campoModelo);
        
        etiqPrecio = new JLabel("Precio: ");
        
        campoPrecio = new JTextField(10);
        
        panelCentro.add(etiqPrecio);
        
        panelCentro.add(campoPrecio);
        
        add(panelCentro,BorderLayout.CENTER);
        
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                             
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                vPrincipal.setVisible(true);
                
            }
            
        });
        
        
    }
    
    
    public void configurarVentana(){
        
        setTitle("Agregar Computadora");
        
        setSize(200,200);
        
        setLocationRelativeTo(this);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        
    }
    
    public void configurarComponentes(String nombre){
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
    }
    
}

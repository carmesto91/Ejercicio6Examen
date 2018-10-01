/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6;

import ar.edu.frc.milexamen6.ventana.VentanaPrincipal;

/**
 *
 * @author alumno
 */
public class Ejecutable {
    
    
    public static void main(String[] args) {
        
        VentanaPrincipal x = new VentanaPrincipal();
        x.setBounds(0,0,400,250);
        x.setLocationRelativeTo(null);
        x.setResizable(false);
        x.setVisible(true);
        
    }
    
}

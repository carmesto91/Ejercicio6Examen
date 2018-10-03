
package ar.edu.frc.milexamen6.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VentanaPrincipal extends JFrame implements ActionListener
{
    private JButton agregarComputadora, comprar;
    private JLabel Bienvenida;
    
    public VentanaPrincipal()
    {
       setLayout(null);
       setTitle("Bienvenido");
       
       Bienvenida = new JLabel("BIENVENIDO! ELIJA SU OPCIÓN");
       Bienvenida.setBounds(20,50,200,30);
       add(Bienvenida);
       
       agregarComputadora = new JButton("Agregar Computadora");
       agregarComputadora.setBounds(20,100,170,30);
       agregarComputadora.addActionListener(this);
       add(agregarComputadora);
       
       comprar = new JButton("Comprar Computadora");
       comprar.setBounds(200,100,170,30);
       comprar.addActionListener(this);
       add(comprar); 
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == agregarComputadora)
        {
            VentanaAgregarComp agregComp = new VentanaAgregarComp(this);
            
            this.setVisible(false);
            
            
            
        }
        if(e.getSource() == comprar)
        {
             Venta v = new Venta();
             v.setBounds(0,0,500,350);
             v.setLocationRelativeTo(null);
             v.setResizable(false);
             v.setVisible(true);
        
            
        }
    }
    
    
}

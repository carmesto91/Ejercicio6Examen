
package ar.edu.frc.milexamen6.ventana;
import java.awt.event.*;
import javax.swing.*;


public class StockDisponible extends JFrame implements ActionListener
{
    private JLabel lblDisponibles, lblModelo;
    private JTextField txtModelo;
    private JButton btnComprar, btnCancelar;
    private JTextArea area;
    private JScrollPane scroll;
    
    public StockDisponible()
    {
        setLayout(null);
        setTitle("Elija la Computadora a comprar");
        
        lblDisponibles = new JLabel("Computadoras disponibles");
        lblDisponibles.setBounds(20,20,200,30);
        add(lblDisponibles);
        
        area = new JTextArea();
        scroll = new JScrollPane(area);
        scroll.setBounds(20,60,250,250);
        add(scroll);
        
        lblModelo = new JLabel("Modelo: ");
        lblModelo.setBounds(20,330,100,30);
        add(lblModelo);
        
        txtModelo = new JTextField();
        txtModelo.setBounds(130,330,140,30);
        add(txtModelo);
        
        btnComprar = new JButton("Comprar");
        btnComprar.setBounds(20,380,120,30);
        add(btnComprar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(150,380,120,30);
        add(btnCancelar);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== btnCancelar)
        {
            
        }
        
    }
}

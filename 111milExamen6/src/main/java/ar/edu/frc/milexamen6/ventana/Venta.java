
package ar.edu.frc.milexamen6.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Venta extends JFrame implements ActionListener 
{
    private JLabel lblMarca, lblPrecio;
    private JTextField txtMarca;
    private JComboBox comboPrecio;
    private JButton btnConsultar;
    
    public Venta()
    {
        setLayout(null);
        setTitle("Consultar Computadoras a Comprar");
        
        lblMarca = new JLabel("Marca: ");
        lblMarca.setBounds(20,20,100,30);
        add(lblMarca);
        
        txtMarca = new JTextField();
        txtMarca.setBounds(120,20,150,30);
        add(txtMarca);
        
        lblPrecio = new JLabel("Precio: ");
        lblPrecio.setBounds(20,60,100,30);
        add(lblPrecio);
        
        comboPrecio = new JComboBox();
        comboPrecio.setBounds(120,60,150,30);
        add(comboPrecio);
        
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(80,130,100,30);
        btnConsultar.addActionListener(this);
        add(btnConsultar);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnConsultar)
        {
           StockDisponible sd = new StockDisponible();
           sd.setBounds(0,0,330,500);
           sd.setLocationRelativeTo(null);
           sd.setResizable(false);
           sd.setVisible(true);
           sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
}

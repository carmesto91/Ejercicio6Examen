
package ar.edu.frc.milexamen6.ventana;
import ar.edu.frc.dao.ComputadoraDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Venta extends JFrame implements ActionListener 
{
    private JLabel lblMarca, lblPrecioHasta, lblPrecioDesde, lblNombre;
    private JTextField txtMarca, txtNombre;
    private JComboBox comboPrecioHasta, comboPrecioDesde;
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
        
        lblNombre=new JLabel("Modelo:");
        lblNombre.setBounds(20, 60, 100, 30);
        add(lblNombre);
        
        txtNombre=new JTextField();
        txtNombre.setBounds(120, 60, 150, 30);
        add(txtNombre);
       
        lblPrecioDesde = new JLabel("Precio Desde: ");
        lblPrecioDesde.setBounds(20,100,100,30);
        add(lblPrecioDesde);
        
        comboPrecioDesde = new JComboBox();
        comboPrecioDesde.setBounds(120,100,150,30);
        add(comboPrecioDesde);
        comboPrecioDesde.addItem(0);
        comboPrecioDesde.addItem(10000);
        comboPrecioDesde.addItem(20000);
        comboPrecioDesde.addItem(30000);
        comboPrecioDesde.addItem(40000);
        comboPrecioDesde.addItem(50000);
        
        lblPrecioHasta = new JLabel("Precio Hasta: ");
        lblPrecioHasta.setBounds(20,150,100,30);
        add(lblPrecioHasta);
        
        comboPrecioHasta = new JComboBox();
        comboPrecioHasta.setBounds(120,150,150,30);
        add(comboPrecioHasta);
        comboPrecioHasta.addItem(10000);
        comboPrecioHasta.addItem(20000);
        comboPrecioHasta.addItem(30000);
        comboPrecioHasta.addItem(40000);
        comboPrecioHasta.addItem(50000);
        comboPrecioHasta.addItem(100000);
        
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(80,230,100,30);
        btnConsultar.addActionListener(this);
        add(btnConsultar);
        
    }
    public void actionPerformed(ActionEvent e)
    {   int pDesde=Integer.parseInt(comboPrecioDesde.getSelectedItem().toString());
        int pHasta=Integer.parseInt(comboPrecioHasta.getSelectedItem().toString());
        ArrayList a=new ArrayList();
        a.add(ComputadoraDao.getInstance().buscar(txtMarca.getText(), txtNombre.getText(), pDesde,pHasta));
     // ComputadoraDao.getInstance().buscar(txtMarca.getText(), txtNombre.getText(), pDesde,pHasta);
        if(e.getSource() == btnConsultar)
        {
            if(a.isEmpty() ){
                JOptionPane.showMessageDialog(null, "no se encontro Computadora");
            }else{
           StockDisponible sd = new StockDisponible();
           sd.setBounds(0,0,430,500);
           sd.setLocationRelativeTo(null);
           sd.setResizable(false);
           sd.setVisible(true);
           sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
        }}
    }
    
}


package ar.edu.frc.milexamen6.ventana;
import ar.edu.frc.dao.ComputadoraDao;
import ar.edu.frc.milexamen6.Computadora;
import java.awt.event.*;
import java.util.List;
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
        area.setEditable(false);
        scroll = new JScrollPane(area);
        scroll.setBounds(20,60,360,250);
        add(scroll);
        
        lblModelo = new JLabel("Modelo: ");
        lblModelo.setBounds(80,330,60,30);
        add(lblModelo);
        
        txtModelo = new JTextField();
        txtModelo.setBounds(190,330,190,30);
        add(txtModelo);
        
        btnComprar = new JButton("Comprar");
        btnComprar.setBounds(60,380,120,30);
        add(btnComprar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(215,380,120,30);
        btnCancelar.addActionListener(this);
        add(btnCancelar);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent we) {
                
                ComputadoraDao computadoraDao = ComputadoraDao.getInstance();
                
                List<Computadora> listaComputadora = computadoraDao.devolverComputadora();
                
                for(Computadora comp:listaComputadora){
                    
                    area.append("ID: "+comp.getId()+" MODELO: " + comp.getModelo()+" NOMBRE: " + comp.getNombre()+" PRECIO: " + comp.getPrecio());
                    area.append("\n");
                    
                    
                }
                
                
                
            }
            
            
            
});
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== btnCancelar)
        {
            System.exit(0);
        }
        
    }
}

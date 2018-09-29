/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.dao;
import ar.edu.frc.conexion.Conexion;
import ar.edu.frc.milexamen6.Computadora;
import ar.edu.frc.milexamen6.ItemStock;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class ItemStockDao {
    
    Conexion con = Conexion.getInstance();
    
    public ItemStockDao(){
    }
    
    public List<ItemStock> listarItems(){
        List<ItemStock> listado = new ArrayList<>();
        ResultSet resultados = con.consultarSQL("SELECT * from ItemStock");
        try{
            while(resultados.next()){
                ItemStock item = new ItemStock();
                item.setCantidad(resultados.getInt("Cantidad"));

                int idComputadora = resultados.getInt("Id_computadora");
                Computadora computadora = new ComputadoraDao().buscar(idComputadora);
                item.setComputadora(computadora);

                listado.add(item);
            }
            
        }catch(Exception ex){}
        return listado;
    }
    
}

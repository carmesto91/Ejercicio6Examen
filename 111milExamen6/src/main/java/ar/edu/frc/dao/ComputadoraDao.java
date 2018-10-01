/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.dao;

import ar.edu.frc.conexion.Conexion;
import ar.edu.frc.milexamen6.Computadora;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class ComputadoraDao {
    
    
    private static ComputadoraDao instance;
    
    public static ComputadoraDao getInstance(){
        
        if(instance == null){
            
            instance = new ComputadoraDao();
            
        }
        
        return instance;
        
        
    }
    
    private ComputadoraDao(){
        
        
        
    }
    
    Conexion con = Conexion.getInstance();
    
    public void agregarComputadora(Computadora computadora){
        
        
        String consulta = "insert into computadora values("+computadora.getId()+",'"+computadora.getNombre()+"','"+computadora.getModelo()+"',"+computadora.getPrecio()+");";
        
        
        
    } 

    Computadora buscar(int idComputadora) {
        //
        return null;
    }
    
    
    public List<Computadora> devolverComputadora(){
        
        List<Computadora> computadora = new ArrayList();
        
        
        
        try {
            
            ResultSet rs = con.consultarSQL("select * from computadora");
            
            while(rs.next()){
                
                Computadora comp = new Computadora(rs.getInt(1),rs.getString("nombre"),rs.getString("modelo"),rs.getInt(4));
                
                computadora.add(comp);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComputadoraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return computadora;
        
        
        
        
    }
    
    
    
}

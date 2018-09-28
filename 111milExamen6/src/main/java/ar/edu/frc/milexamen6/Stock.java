/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Stock {
    
    public Stock(){
    
    item = null;
    
    }
    
    
    List<ItemStock> item;

    public List<ItemStock> getItem() {
        return item;
    }

    public void setItem(List<ItemStock> item) {
        this.item = item;
    }
    
    
}

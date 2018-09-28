/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Stock {
   private  List<ItemStock> items;
    
    public Stock()
    {
    
        items = new ArrayList<ItemStock>();
    
    }

    public List<ItemStock> getItem() {
        return items;
    }

    public void setItem(List<ItemStock> item) {
        this.items= item;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

import java.util.ArrayList;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public interface IDataAccessObject {
    
    public  void addToFile(Object object);
    public  ArrayList<Object> readObjects(String nameClass);
    public ArrayList<Object> findObjects(int queryFind, String nameCollection);
}

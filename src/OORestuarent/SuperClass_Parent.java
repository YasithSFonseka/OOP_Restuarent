/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestuarent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasith Fonseka
 */
public class SuperClass_Parent {
    
    public double chickenB;
    public double chickenL;
    public double chickenBM;
    public double chickenCB;
    
    public double vanilaCone;
    public double classicVanila;
    public double vanilaMS;
    public double chocalateMS;
    
    public double Meals;
    public double Drinks;
    public double TotalOfDM;
    
    public double AllTotalOfMD;
    
    public double GetAmount(){
        
        Meals = chickenB + chickenL + chickenBM + chickenCB;
        
        Drinks = vanilaCone + classicVanila + vanilaMS + chocalateMS;
        
        TotalOfDM = Meals + Drinks;
        
        AllTotalOfMD = TotalOfDM;
        
        return AllTotalOfMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restuarent Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //===========================================================================================================
    public double pchickenB = 10.50;
    public double pchickenL = 3.25;
    public double pchickenBM = 4.90;
    public double pchickenCB = 11.50;
    
    public double pvanilaCone = 2.50;
    public double pclassicVanila = 1.25;
    public double pvanilaMS = 4.25;
    public double pchocalateMS = 5.00;
  
    //===========================================================================================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount * mcTax;
        return FindTax;
    }
    
    //===========================================================================================================
    
}

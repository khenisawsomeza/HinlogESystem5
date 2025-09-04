/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

    

/**
 *
 * @author khenshi
 */
public class Grades extends HinlogESystem{
    
    static int subjid;
    
    public Grades(){
        connectDB();
    }
    
    public void connectDB(){
       DBConnect();
    }
    
    public void saveRecord(String eid){
        
    }
    
}

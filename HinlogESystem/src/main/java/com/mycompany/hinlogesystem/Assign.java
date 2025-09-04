/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

/**
 *
 * @author khenshi
 */
public class Assign {
    private static int subId;
    
    public void setsubjid(int a){       
        subId = a;       
    }    
    
    public int getsubjid(){       
        return subId;       
    }
    
    public String AssignSubj(int tid){
        
        String query = "INSERT INTO Assign (tid, subid) values(" + tid + "," +  getsubjid() +");";
        
        return query;
              
    }
    
    public String DeleteSubj(int tid){
        
        String query = "DELETE FROM Assign WHERE tid = " + tid + " AND subid = ";
        
        return query;
    }
}

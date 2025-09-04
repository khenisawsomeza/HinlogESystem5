/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author khenshi
 */
public class Enrolled extends HinlogESystem {
    
    private static int subId;
    
    public void setsubjid(int a){       
        subId = a;       
    }    
    
    public int getsubjid(){       
        return subId;       
    }
    
    public String enrollStud(int studid){
        
        String query = "INSERT INTO Enroll (studid, subjid) values(" + studid + "," +  getsubjid() +");";
        
        return query;
              
    }
    
    public String DropSubj(int studid){
        
        String query = "DELETE FROM Enroll WHERE studid = " + studid + " AND subjid = ";
        
        return query;
    }
}

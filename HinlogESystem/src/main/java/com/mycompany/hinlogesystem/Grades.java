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
    
    static String subjid;
    
    public Grades(){
        connectDB();
    }
    
    public void connectDB(){
       DBConnect();
    }
    
    public void saveRecord(String prelimGrade, String midtermGrade, String prefinalGrade, String finalGrade, String eid){
        try {
        String insertQuery = "INSERT INTO grades " +
                    "(eid, Prelim, Midterm, Prefinal, Final) VALUES " +
                    "('" + eid + "', '" + prelimGrade + "', '" + midtermGrade + "', '" +  prefinalGrade + "', '" + finalGrade + "')";
            st.executeUpdate(insertQuery);
            System.out.println("Insert Success");
        } catch(Exception ex){
            System.out.println("Failed to Insert Grades");
        }
    }
    
    public void updateRecord(String prelimGrade, String midtermGrade, String prefinalGrade, String finalGrade, String eid){
        try {
            String updateGradeQuery = String.format("UPDATE Grades SET Prelim = '%s', Midterm = '%s', Prefinal = '%s', Final = '%s'"
                                                  + "WHERE eID = %s", prelimGrade, midtermGrade, prefinalGrade, finalGrade, eid);
            st.executeUpdate(updateGradeQuery);
            System.out.println("Update Success");
        } catch(Exception ex){
            System.out.println("Failed to Update Grades");
        }
    }
    
}

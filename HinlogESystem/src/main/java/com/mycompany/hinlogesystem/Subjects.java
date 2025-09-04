/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Subjects extends HinlogESystem {
    int subId, subUnits;
    String subCode, subDescription, subSchedule;
    
    Subjects(){
        connectDB();
    }
    
    public void connectDB(){
        DBConnect();
        StudentsForm form = new StudentsForm();
    }
    
    public void saveRecord(int units, String code, String description, String schedule){
        String query = "insert into subjects (subUnits, subCode, subDescription, subSchedule)  values(" + units + ",'" + code + "','" + description + "','" + schedule +"');";
        
        try {
            st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        }
    }
    
    public void deleteRecord(int id){
        String query = "delete from subjects where subId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
        
        String query2 = "DELETE FROM Enroll WHERE subjid = " + id;
        try {
            st.executeUpdate(query2);
            System.out.println("Drop Success");
        } catch (Exception ex){
            System.out.println("Failed to Drop: " + ex);
        }
        
        String query3 = "DELETE FROM Assign WHERE subid = " + id;
        try {
            st.executeUpdate(query3);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
    }
    public void updateRecord(int id, int units, String code, String description, String schedule){
        String query = "UPDATE subjects SET " +
               "subId = '" + id + "', " +
               "subUnits = '" + units + "', " +
               "subCode = '" + code + "', " +
               "subDescription = '" + description + "', " +
               "subSchedule = '" + schedule + "' " +
               "WHERE subId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}

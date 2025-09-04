/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Students extends HinlogESystem{
    int studId;
    String studName, studAddress, studContact, studCourse, studGender, studYrLvl;
    
    Students(){
        connectDB();
    }   
    
    public void connectDB(){     
        DBConnect();
        StudentsForm form = new StudentsForm();
    }
    
    public void saveRecord(String name, String address, String contact, String course, String gender, String yrLvl){
        
        String username = null;
        String password = null;

        try {
            String insertQuery = "insert into students (studName, studAddress, studContact, studCourse, studGender, studYrLvl) values('" + name + "','" + address + "','" + contact + "','" + course + "','" + gender + "','" + yrLvl + "');";
            st.executeUpdate(insertQuery);
            System.out.println("Insert Success");             
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        } 
        
        try {
            String selectIdQuery = "SELECT MAX(studId) AS newId FROM " + db + ".students;";
            rs = st.executeQuery(selectIdQuery);
            
            String newId = "";
            if (rs.next()){
                newId = rs.getString("newId");
            }
            
            username = newId + name;
            password = "AdDU" + name;
            
            String createUserQuery = "CREATE USER '"+ username+ "'@'%' IDENTIFIED BY '" + password + "';";
            st.executeUpdate(createUserQuery);
            
        } catch (Exception ex){
            System.out.println("Failed to create user / user already exists: " + ex);
        }
        
        try {
            String updatePrivilageQuery = "GRANT SELECT ON " + db + ".* TO '" + username + "'@'%';";
            st.executeUpdate(updatePrivilageQuery);
            
            String flushQuery = "FLUSH PRIVILEGES;";
            st.executeUpdate(flushQuery);
            
        } catch (Exception ex){
            System.out.println("Failed to grant privileges ");
        }
        
    }
    
    public void deleteRecord(int id, String name){

        String query = "delete from students where studId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
        
        String query2 = "DELETE FROM Enroll WHERE studid = " + id;
        try {
            st.executeUpdate(query2);
            System.out.println("Drop Success");
        } catch (Exception ex){
            System.out.println("Failed to Drop: " + ex);
        }
        
        String username = id + name;
        String revokeQuery = "REVOKE ALL PRIVILEGES ON " + db + ".* FROM '" + username + "'@'%'";  
        String deleteQuery = "DROP USER '" + username + "'@'%';";
        boolean exists = checkStudentExists(id, name);
        
        if (exists){
            try {
                st.executeUpdate(revokeQuery);
                System.out.println("Revoke Success");
            } catch (Exception ex){
                System.out.println("Failed to Revoke: " + ex);
            }
        } else {
            try {
                st.executeUpdate(deleteQuery);
                System.out.println("delete user Success");
            } catch (Exception ex){
                System.out.println("Failed to delete user: " + ex);
            }
        }
    }
    
    public boolean checkStudentExists(int id, String name) {
    boolean exists = false;
    try {
        // db1
        String q1 = "SELECT * FROM 1stSem_Sy2025_2026.students WHERE studId = " + id + " AND studName = '" + name + "'";
        rs = st.executeQuery(q1);
        if (rs.next()) {
            exists = true;
        }

        // db2
        String q2 = "SELECT * FROM 2ndSem_Sy2025_2026.students WHERE studId = " + id + " AND studName = '" + name + "'";
        rs = st.executeQuery(q2);
        if (rs.next()) {
            exists = true;
        }

        // db3
        String q3 = "SELECT * FROM Summer_Sy2025_2026.students WHERE studId = " + id + " AND studName = '" + name + "'";
        rs = st.executeQuery(q3);
        if (rs.next()) {
            exists = true;
        }

    } catch (Exception e) {
        System.out.println("failed to check if user exists");
    }
    return exists;
}
    
    public void updateRecord(int id, String name, String address, String contact, String course, String gender, String yrLvl){
        String query = "UPDATE students SET " +
               "studName = '" + name + "', " +
               "studAddress = '" + address + "', " +
               "studContact = '" + contact + "', " +
               "studCourse = '" + course + "', " +
               "studGender = '" + gender + "', " +
               "studYrLvl = '" + yrLvl + "' " +
               "WHERE studId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}

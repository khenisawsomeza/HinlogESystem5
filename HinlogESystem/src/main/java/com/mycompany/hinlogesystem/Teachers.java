/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinlogesystem;

public class Teachers extends HinlogESystem{
    int teachId;
    String teachName, teachAddress, teachContact, teachEmail, teachDepartment;
    
    Teachers(){
        connectDB();
    }
    
    public void connectDB(){
        DBConnect();
        TeachersForm form = new TeachersForm();
    }
    
    public void saveRecord(String name, String address, String contact, String email, String department){
        
        String query = "insert into teachers (teachName, teachAddress, teachContact, teachEmail, teachDepartment) values('" + name + "','" + address + "','" + contact + "','" + email +"','" + department + "');";
        try {
            st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex){
            System.out.println("Failed to Insert: " + ex);
        }
        
        String username = null;
        String password = null;
        
        try {
            String selectIdQuery = "SELECT MAX(teachId) AS newId FROM " + db + ".teachers;";
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
            String updatePrivilageQuery = "GRANT SELECT, INSERT, UPDATE ON " + db + ".* TO '" + username + "'@'%';";
            st.executeUpdate(updatePrivilageQuery);
            
            String flushQuery = "FLUSH PRIVILEGES;";
            st.executeUpdate(flushQuery);
            
        } catch (Exception ex){
            System.out.println("Failed to grant privileges ");
        }
        
        
    }
    
    public void deleteRecord(int id, String name){
        String query = "delete from teachers where teachId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
        }
        
        String query2 = "DELETE FROM Assign WHERE tid = " + id;
        try {
            st.executeUpdate(query2);
            System.out.println("Delete Success");
        } catch (Exception ex){
            System.out.println("Failed to Delete: " + ex);
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
        String q1 = "SELECT * FROM 1stSem_Sy2025_2026.teachers WHERE teachId = " + id + " AND teachName = '" + name + "'";
        rs = st.executeQuery(q1);
        if (rs.next()) {
            exists = true;
        }

        // db2
        String q2 = "SELECT * FROM 2ndSem_Sy2025_2026.teachers WHERE teachId = " + id + " AND teachName = '" + name + "'";
        rs = st.executeQuery(q2);
        if (rs.next()) {
            exists = true;
        }

        // db3
        String q3 = "SELECT * FROM Summer_Sy2025_2026.teachers WHERE teachId = " + id + " AND teachName = '" + name + "'";
        rs = st.executeQuery(q3);
        if (rs.next()) {
            exists = true;
        }

    } catch (Exception e) {
        System.out.println("failed to check if user exists");
    }
    return exists;
}
    
    public void updateRecord(int id, String name, String address, String contact, String email, String department){
        String query = "UPDATE teachers SET " +
               "teachId = '" + id + "', " +
               "teachName = '" + name + "', " +
               "teachAddress = '" + address + "', " +
               "teachContact = '" + contact + "', " +
               "teachEmail = '" + email + "', " +
               "teachDepartment = '" + department + "' " +
               "WHERE teachId = " + id;
        
        try {
            st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex){
            System.out.println("Failed to Update: " + ex);
        }
    }
}

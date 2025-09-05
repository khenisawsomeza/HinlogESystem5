package com.mycompany.hinlogesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class HinlogESystem {
    
    static Connection con;
    static Statement st;
    static ResultSet rs;
    
    static String db = "";
    static String uname = "root";
    static String pswd = "@Lemeosa1221";

    public static void main(String[] args) {     


        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }  
    
    public static void DBConnect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.4.44.83:3306/"+db+"?zeroDateTimeBehavior=CONVERT_TO_NULL", uname, pswd);
            st = con.createStatement();
            System.out.println("Connected: " + db);
        } catch (Exception ex){
            System.out.println("Failed to Connect: " + ex);
        }
        
    }
    
    public static void switchDB(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.4.44.83:3306/"+db+"?zeroDateTimeBehavior=CONVERT_TO_NULL", uname, pswd);
            st = con.createStatement();
            JOptionPane.showMessageDialog(null,"Database Switched: " + db, "New Database", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception ex){
            System.out.println("database not found: " + ex);
            createTables();
        }      
        
    }
    
    public static void createTables(){
        
        try {
            String createData = "CREATE DATABASE IF NOT EXISTS `" + db + "`";
            st.executeUpdate(createData);
            String useDatabase = "USE " + db;
            st.executeUpdate(useDatabase);
            System.out.println("Switched to database: " + db);

            //create Students Table
            String createStudentsTable = "CREATE TABLE IF NOT EXISTS students (" +
            "studId INT PRIMARY KEY AUTO_INCREMENT," +
            "studName TEXT," +
            "studAddress TEXT, " +
            "studContact TEXT, " +
            "studCourse TEXT, " +
            "studGender TEXT, " +
            "studYrlvl TEXT" +
            ") AUTO_INCREMENT = 1001";
            st.executeUpdate(createStudentsTable);

            // Create Subjects table
            String createSubjectsTable = "CREATE TABLE IF NOT EXISTS subjects (" +
                "subId INT PRIMARY KEY AUTO_INCREMENT, " +
                "subUnits INT, " +
                "subCode TEXT, " +
                "subDescription TEXT, " +
                "subSchedule TEXT" +
                ") AUTO_INCREMENT = 2001";
            st.executeUpdate(createSubjectsTable);

            // Create Teachers table
            String createTeachersTable = "CREATE TABLE IF NOT EXISTS teachers (" +
                "teachId INT PRIMARY KEY AUTO_INCREMENT, " +
                "teachName TEXT, " +
                "teachAddress TEXT, " +
                "teachContact TEXT, " +
                "teachEmail TEXT, " +
                "teachDepartment TEXT" +
                ") AUTO_INCREMENT = 3001";
            st.executeUpdate(createTeachersTable);

            // Create TransactionCharges table
            String createTransactionChargesTable = "CREATE TABLE IF NOT EXISTS TransactionCharges (" +
                "TransID INT PRIMARY KEY AUTO_INCREMENT, " +
                "Department TEXT, " +
                "SubjUnits DECIMAL(10,2), " +
                "Insurance DECIMAL(10,2), " +
                "Computer DECIMAL(10,2), " +
                "Laboratory DECIMAL(10,2), " +
                "Cultural DECIMAL(10,2), " +
                "`Library` DECIMAL(10,2), " +
                "Facility DECIMAL(10,2)" +
                ")";
            st.executeUpdate(createTransactionChargesTable);

            // Create Enroll table (depends on Students and Subjects)
            String createEnrollTable = "CREATE TABLE IF NOT EXISTS Enroll (" +
                "eid INT PRIMARY KEY AUTO_INCREMENT, " +
                "studid INT, " +
                "subjid INT," +
                "FOREIGN KEY (studid) REFERENCES students(studId) ON DELETE CASCADE, " +
                "FOREIGN KEY (subjid) REFERENCES subjects(subId) ON DELETE CASCADE," +
                "UNIQUE (studid, subjid)" +
                ")";
            st.executeUpdate(createEnrollTable);

            // Create Assign table (depends on Teachers and Subjects)
            String createAssignTable = "CREATE TABLE IF NOT EXISTS Assign (" +
                "subid INT UNIQUE," +
                "tid INT," +
                "FOREIGN KEY (subid) REFERENCES subjects(subId) ON DELETE CASCADE, " +
                "FOREIGN KEY (tid) REFERENCES teachers(teachId) ON DELETE CASCADE" +
                ")";
            st.executeUpdate(createAssignTable);

            // Create Grades table (depends on Enroll)
            String createGradesTable = "CREATE TABLE IF NOT EXISTS Grades (" +
                "GradeID INT PRIMARY KEY AUTO_INCREMENT, " +
                "eid INT UNIQUE, " +
                "Prelim TEXT, " +
                "Midterm TEXT, " +
                "Prefinal TEXT, " +
                "Final TEXT, " +
                "FOREIGN KEY (eid) REFERENCES Enroll(eid) ON DELETE CASCADE" +
                ")";
            st.executeUpdate(createGradesTable);

            // Create Invoice table (depends on Students and TransactionCharges)
            String createInvoiceTable = "CREATE TABLE IF NOT EXISTS Invoice (" +
                "Invoicenum INT PRIMARY KEY AUTO_INCREMENT, " +
                "studid INT, " +
                "TransID INT" +
                ")";
            st.executeUpdate(createInvoiceTable);

            System.out.println("All database structures created successfully!");

            JOptionPane.showMessageDialog(null,"Database Created: " + db, "New Database", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex){
            System.out.println("Failed to Create Database: " + ex);
        }

        DBConnect();

        }
}

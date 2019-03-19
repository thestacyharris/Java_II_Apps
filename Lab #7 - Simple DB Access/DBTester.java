
/**********************************************
 Class: CIST 2372 Java II
 Semester:  Spring 2019
 Instructor:  Ron Enz
 Description:  Solution to Lab 7
 Due:  03/19/2019
 @author Stacy Harris
 @version 1.0
 By turning in this code, I pledge
 1.  That I have completed the programming assignment independently.
 2.  I have not copied the code from a student or any other source.
 3.  I have not given my code to any student.
 ***********************************************/

import java.sql.*;

public class DBTester {

    public static void main(String[] args){
        try{
            System.out.println("Starting DB Tester..........");
            //load driver - Step #1
            Connection con =
                    DriverManager.getConnection("jdbc:ucanaccess:///Users/jeebz/Documents/College/CIST2372 - Java II/Lab 7 - Simple Database Access/RegistrationDB.mdb");

            //Create Statement - Step #3
            Statement stmt = con.createStatement();

            //Execute Statement - Step #4
            String sql;
            sql = "select * from Instructors";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);

            //Process Data
            while (rs.next()){
                System.out.println("Instructor ID: " + rs.getString(1));
                System.out.println("First Name: " + rs.getString(2));
                System.out.println("Last Name: " + rs.getString(3));
                System.out.println("Street: " + rs.getString(4));
                System.out.println("City: " + rs.getString(5));
                System.out.println("State: " + rs.getString(6));
                System.out.println("Zipcode: " + rs.getString(7));
                System.out.println("Office#: " + rs.getString(8));
                System.out.println("email: " + rs.getString(9));
                System.out.println("=============================");
            }

            //close connection - Step #6
            con.close();

        } // end try
        catch(Exception e){
            System.out.println("PP: " + e);
        }
    } //end Main

} //end Class

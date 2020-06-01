/**********************************************
 Class: CIST 2372 Java II
 Semester:  Spring 2019
 Instructor:  Ron Enz
 Description:  Solution to Lab 4
 Due:  02/20/2019
 @author Stacy Harris
 @version 1.0
 By turning in this code, I pledge
 1.  That I have completed the programming assignment independently.
 2.  I have not copied the code from a student or any other source.
 3.  I have not given my code to any student.
 ***********************************************/

import java.io.*;

public class FileDetails {

    public FileDetails(String fd){
        File f1 = new File(fd);

        System.out.println("Does it exist?" + f1.exists());
        System.out.println("The file has " + f1.length()+ " bytes.");
        System.out.println("Can it be read?" + f1.canRead());
        System.out.println("Can it be written?"+ f1.canWrite());
    }

    public static void main (String[] args){
        FileDetails fd = new FileDetails("\\Mac\\Home\\Documents\\College\\CIST2372 - Java II\\FileApp\\srcFileDetails.class");
    } //end Main
} //end Class

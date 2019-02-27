/**********************************************
 Class: CIST 2372 Java II
 Semester:  Spring 2019
 Instructor:  Ron Enz
 Description:  Solution to Lab 5
 Due:  02/27/2019
 @author Stacy Harris
 @version 1.0
 By turning in this code, I pledge
 1.  That I have completed the programming assignment independently.
 2.  I have not copied the code from a student or any other source.
 3.  I have not given my code to any student.
 ***********************************************/

package lab5;

import java.io.*;

public class WriteString {
    public WriteString(String fileName, String string){
        File f1;
        f1 = new File(fileName);

        try {
            if (f1.length() == 0L) {
                FileOutputStream fout;
                fout = new FileOutputStream(fileName);
                PrintStream ps = new PrintStream(fout);
                ps.println(string);
                System.out.println("File Created!");
            }
            else{
                System.out.println("File is not empty.");
            }
        }
        catch(Exception e){
            System.out.println("File not created.");
        }
    } //end WriteString
    
    public static void main(String[] args){
        WriteString ws = new WriteString("f1.txt", "Hello world");
    } //end Main
    
} //end Class

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

public class FileWrite {
    public FileWrite(String fn, String data){
        File f1 = new File(fn);

        try{
            if(f1.length()== 0L){
                FileOutputStream fout;
                fout = new FileOutputStream(fn);

                byte ba2[] = new byte[data.length()];

                ba2 = data.getBytes();
                fout.write(ba2);
                fout.close();
            }
            else{
                System.out.println("File is not empty.");
            }
        }
        catch (IOException ie){
            System.out.println(ie);
        }
    } //end Constructor

    public static void main(String[] args)
    {
        FileWrite fw = new FileWrite("myfile.txt", "Go Braves.");
    } //end Main
} //end Class

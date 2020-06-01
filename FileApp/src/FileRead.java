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

public class FileRead {
    public FileRead(String fr) {

        File f1 = new File(fr);
        try{
            if(f1.length()!= 0L){
                FileInputStream fin;
                fin = new FileInputStream("myfile.txt");

                byte ba[] = new byte[(int)f1.length()];

                fin.read(ba);
                String s1;
                s1 = new String (ba);
                System.out.println("File data: " + s1);
                fin.close();
            }
            else{
                System.out.println("File is empty.");
            }
        }
        catch (IOException ie){
            System.out.println(ie);
        }
    } //end Constructor

    public static void main(String[] args)
    {
        FileRead fr = new FileRead("\\Mac\\Home\\Documents\\College\\CIST2372 - Java II\\FileApp\\src\\myfile.txt");
    }
} //end Class

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

public class ReadInts {
    public ReadInts(String fileName){
        File f1;
        f1 = new File(fileName);

          try{
               if (f1.length() !=0L){
                    System.out.println("Starting to read file.");
                    FileInputStream fin = new FileInputStream(f1);
                    DataInputStream din = new DataInputStream(fin);
                    for (int i = 0; i < fileName.length(); ++i)
                        System.out.println(din.readInt());
                    
               }
               else {
                    System.out.println("File is empty.");
               }
          }
          catch(IOException e){
               System.out.println(e);
          }
    } //end ReadInts
    
    public static void main(String[] args){
        ReadInts ri = new ReadInts("mydata.dat");
    } //end Main 
} //end Class

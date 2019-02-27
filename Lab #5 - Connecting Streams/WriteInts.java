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

public class WriteInts {
    
    public WriteInts(String fileName, int arr[]) throws FileNotFoundException{
        FileOutputStream fout = new FileOutputStream(fileName);
        DataOutputStream dout = new DataOutputStream(fout);
        
        try{
            for(int i = 0; i < arr.length; ++i){
                dout.writeInt(arr[i]);
            }
            
        }
        catch(FileNotFoundException nf){
            System.out.println("File does not exist.");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    } //end WriteInts
    
    public static void main(String[] args) throws FileNotFoundException{
        int myArr[] = {16, 31, 90, 45, 89};
        WriteInts wi = new WriteInts("mydata.dat", myArr);
    }
    
} //end Class

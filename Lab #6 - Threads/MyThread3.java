/**********************************************
 Class: CIST 2372 Java II
 Semester:  Spring 2019
 Instructor:  Ron Enz
 Description:  Solution to Lab 6
 Due:  03/06/2019
 @author Stacy Harris
 @version 1.0
 By turning in this code, I pledge
 1.  That I have completed the programming assignment independently.
 2.  I have not copied the code from a student or any other source.
 3.  I have not given my code to any student.
 ***********************************************/
package mythread;

public class MyThread3 extends Thread{

    int x;
    
    public MyThread3(int x){
        this.x = x;
    }
  
    public void run(){
        
        for(int i = 0; i<=x ; i++){
            System.out.println("Thread running..." + x);
            
        }
        System.out.println("Thread finished.");
    } //end Run

   
    public static void main(String[] args) {
        MyThread3 mt1, mt2, mt3, mt4;
        mt1 = new MyThread3(100);
        mt2 = new MyThread3(200);
        mt3 = new MyThread3(300);
        mt4 = new MyThread3(400);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        
    } //end Main
    
} //end Class


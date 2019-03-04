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

public class MyThread2 implements Runnable{

    int x;
    
    public MyThread2(int x){
        this.x = x;
    }
  
    @Override
    public void run(){
        
        for(int i = 0; i<=x ; i++){
            System.out.println("Thread running..." + x);
            
        }
        System.out.println("Thread finished.");
    } //end Run

   
    public static void main(String[] args) {
        MyThread2 mt1, mt2;
        mt1 = new MyThread2(400);
        mt2 = new MyThread2(550);
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
        
    } //end Main
    
} //end Class

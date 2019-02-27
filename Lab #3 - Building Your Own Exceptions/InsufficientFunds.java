/**********************************************
 Class: CIST 2372 Java II
 Semester:  Spring 2019
 Instructor:  Ron Enz
 Description:  Solution to Lab 3
 Due:  02/13/2019
 @author Stacy Harris
 @version 1.0
 By turning in this code, I pledge
 1.  That I have completed the programming assignment independently.
 2.  I have not copied the code from a student or any other source.
 3.  I have not given my code to any student.
 ***********************************************/


class InsufficientFundsException extends Exception{

    private String msg = "Insufficeint Funds.";

    public  String toString() {
        return msg;
    } //end toString

    public void display(){
        System.out.println(msg);
    } //end display

} //end class

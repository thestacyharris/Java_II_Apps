/**
 * Class: CIST 2372 Java II
 * Semester:  Spring 2019
 * Instructor:  Ron Enz
 * Description:  Solution to Lab 2
 * Due:  02/06/2019
 * @author Stacy Harris
 * @version 1.0
 *
 * By turning in this code, I pledge
 * 1.  That I have completed the programming assignment independently.
 * 2.  I have not copied the code from a student or any other source.
 * 3.  I have not given my code to any student.
 *
 */

public class TestExceptions {

    public static void main(String[] args){
        int myArr[] = new int[10];
        int x,y,z;
        x=0;
        y=10;

        try {
            z = y / x;
        }

        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception.  Cannot divide by zero.");
        }

        try {
            myArr[10] = 0;
        }

        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Index Out of Bounds Exception.");
        }

    } //end Main

} //end Class

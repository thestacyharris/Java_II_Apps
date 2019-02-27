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

public class Account {

    public double balance;
    public String owner;
    public int accountNum;

    //set and get account balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    //set and get account owner
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

    //set and get account number
    public void setAccountNum(int accountNum) {
        this.accountNum= accountNum;
    }
    public int getAccountNum() {
        return accountNum;
    }

    //generic constructor
    public Account(){

    }

    //deposit method
    public void deposit(double depositNum){
        balance += depositNum;
    } //end Deposit method

    //withdraw method


    public void withdraw(double withdrawNum) throws InsufficientFundsException{
        try {
            if (withdrawNum > balance) {
                throw new InsufficientFundsException();
            } else
                balance -= withdrawNum;
        }
        catch (InsufficientFundsException e){
            System.out.println(e);
            e.display();
        }

    } //end Withdraw method


    //3-arg constructor
    public Account(int accountNum, String owner, double balance){
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    //displays account information
    public void display(){
        System.out.println("The account number is:  " +getAccountNum());
        System.out.println("The account owner is:  " +getOwner());
        System.out.println("The account balance is:  " +getBalance());
    } //end Display method

    public static void main(String [] args) {
        try {
            Account a1;
            a1 = new Account(2222, "Frank", 500);
            a1.deposit(100.00);
            a1.withdraw(900.00);
            a1.display();
        }
        catch (InsufficientFundsException e){
            System.out.println(e);
        }

    } //end Main

}  //end Class

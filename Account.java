/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author zozel
 */
public class Account implements Bank_Interface {
   //   Scanner sc=new Scanner(System.in);
    static int count=0;
    protected String name;
    protected String password;
    protected int id;
    protected double balance=5000;
    protected LocalDate dateCreated;
    protected static int minimum_passwordlenght=6;
    //Data Show

    public Account(String name, String password, LocalDate dateCreated) {
        this.name = name;
        this.id = count;
        this.password = password;
        this.dateCreated = dateCreated;
        count++;
    }
     public Account(){
         
     }
        @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
        
    @Override
        public void withdraw(double withdrawAmount){
       if (withdrawAmount>0&&this.balance>=withdrawAmount){
           this.balance-=withdrawAmount;
           System.out.println(withdrawAmount+"Are withdrawn successfully");
       }
       else{
           System.out.println("your balance is unsufficient");
       }
    }
     
    @Override
         public void deposit(double depositAmount){
      if (depositAmount<=0){
          System.out.println("insufficient number");
      }
      else{
             this.balance += depositAmount;
        System.out.println( depositAmount+"Are  deposited successfully");
      }
    }
      
    @Override
      public double checkBalance(){
        return this.balance;
    }   

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public static int getMinimum_passwordlenght() {
        return minimum_passwordlenght;
    }

    public static void setCount(int count) {
        Account.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public static void setMinimum_passwordlenght(int minimum_passwordlenght) {
        Account.minimum_passwordlenght = minimum_passwordlenght;
    }
    
        
      
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */

import java.util.Date; //Used for creating a Date object
import java.text.DateFormat; //Used for specifying the format of the date
import java.text.NumberFormat; //Used for specifying the type of currency

public class TestPayroll 
{
    
    public static void main(String[] arg)
    {
        //Set up the formatters   
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
                
        System.out.println("\nPayroll For Week Ending " + df.format(d));
        System.out.println("--------------------------------------");
        
        //Define employee 1
        Payroll employee1 = new Payroll("444-4444", 30, 25);
        employee1.calculateSalary();
        displaySalary(employee1, nf);
        
        //Define employee 2 
        Payroll employee2 = new Payroll("555-5555", 20, 50);
        employee2.calculateSalary();
        employee2.calculateTotal();//adds salary to running total of pay
        displaySalary(employee2, nf);
         
        //Re-Define employee 1
        System.out.println("\tIncrease " + employee1.getEmployeeId() + " by 10 hours");
        employee1.increaseHours(10); //10hrs increase
        //re-calculate the salary and print
        employee1.calculateSalary();
        employee2.calculateTotal();//adds salary to running total of pay
        displaySalary(employee1, nf);

        System.out.println("Total payout amount.. " + nf.format(Payroll.getTotalPayout()));
        System.out.println("-------------End of Report-------------");    
    }
    
    public static void displaySalary(Payroll e, NumberFormat nf)
    {
        System.out.println("\tEmployee # ......" + e.getEmployeeId() + "\n " 
                            + "\tHours Worked.... " + e.getHoursWorked() + " hours" + "\n" 
                            + "\tHourly Rate..... " + nf.format(e.getHourlyPay()) + "/hour"+ "\n" 
                            + "\tYour Salary is.. " + nf.format(e.getSalary())
                            );
        System.out.println("\t------------------------------\n");
    }
}


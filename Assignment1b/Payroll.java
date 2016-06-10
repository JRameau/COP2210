/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Payroll 
{
    
    private String id;
    private double hrlyPay;
    private double hrsWorked;
            
    private double salary;
    private static double total_payout;    
           
    public Payroll(String eId, double hWorked, double pay )
    {
        id = eId;
        hrsWorked = hWorked;
        hrlyPay = pay; 
    }
    
    public String getEmployeeId()
    {
        return id;
    }
    
    public double getHoursWorked()
    {
        return hrsWorked;
    }
    
    public double getHourlyPay()
    {
        return hrlyPay;
    }

    public double getSalary()
    {
        return salary;
    }
      
    public static double getTotalPayout() 
    {   
        return total_payout;
    }
    
    public void increaseHours(int amount)
    {
        hrsWorked = hrsWorked + amount;        
    }
        
    public void calculateSalary()
    {
        salary = hrsWorked * hrlyPay;
    }
    
    public void calculateTotal()
    {
       total_payout = total_payout + salary;
    }
}


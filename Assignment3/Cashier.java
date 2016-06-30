/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Cashier 
{
    private final int SILVER_DOLLAR = 100, QUARTER = 25, DIME = 10, NICKEL = 5, PENNY = 1;
    
    private String name;
    private double price, change, tender;
    private int items;

    private static double total_price, average_price, amount_tendered; 
    private static int  total_dollars, 
                        total_quarters, 
                        total_dimes,  
                        total_nickels, 
                        total_pennies,
                        total_items;
    
    public Cashier()
    {
        
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getQuantity()
    {
        return items;
    }
    
    public double getTotal()
    {
        
        return total_price;
    }
    
     public double getItemTotal()
    {
        return total_items;
    }

    public double getAverage()
    {
        return average_price;
    }
    
    public double getChange()
    {
        return change;
    }
    
    public int getDollars()
    {
        return total_dollars;     
    }
    
    public int getQuarters()
    {
        return total_quarters;
    }
    
    public int getDimes()
    {
        return total_dimes;
    }
    
    public int getNickels()
    {
        return total_nickels;
    }
    
    public int getPennies()
    {
        return total_pennies;
    }
    
    public double tendered()
    {
        return amount_tendered;
    }

    public void add (String n, double p, int q)
    {
        items = q;
        name = n;
        price = p * q;       
    }
    
    public void average()
    {
        average_price = total_price/total_items;
    }
    
    public void calculate()
    {
        total_price += price;
    }
    
    public void itemTotal()
    {
        total_items += items;
    }
    
    public void tendered(Double a)
    {
        amount_tendered = a;
    }
    
    public void calculateChange()
    {
        change = amount_tendered - total_price;
    }
    
    public void makeChange()
    {        
        tender = 100 * change;
        
        while (tender >= SILVER_DOLLAR)
        {    
            tender = tender - SILVER_DOLLAR;
        
            total_dollars++;
        }    
           
        while (tender >= QUARTER)
        {    
            tender = tender - QUARTER;
        
            total_quarters++;
        }
            
        while (tender >= DIME)
        {    
            tender = tender - DIME;
            
            total_dimes++;
        }   
        
        while (tender >= NICKEL)
        {    
            tender = tender - NICKEL;
            
            total_nickels++;
        }    
        
        while (tender >= PENNY)
        {    
            tender = tender - PENNY;
            
            total_pennies++;
        }
    }
}


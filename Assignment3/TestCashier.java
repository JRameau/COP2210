/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TestCashier 
{
    public static void main(String[] arg)
    {
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        NumberFormat n = NumberFormat.getIntegerInstance();
        
        String s;
   
        s = "\nWelcome - Thanks for Stopping By! " + "\t" + df.format(d) + "\n\n";
               
        Cashier c = new Cashier();
        
        String name = GetData.getWord("Enter name of item");
        double price = GetData.getDouble("Enter price of item");
        int qty = GetData.getInt("Enter quantity of item");
        c.add(name, price, qty);
        s = s + display(c, n);
        c.itemTotal(); //adds quantity to running total
        c.calculate(); //adds price to running total
        

        String name2 = GetData.getWord("Enter name of item");
        double price2 = GetData.getDouble("Enter price of item");
        int qty2 = GetData.getInt("Enter quantity of item");
        c.add(name2, price2, qty2);
        s = s + display(c, n);
        c.itemTotal();
        c.calculate();        
       
        
        String name3 = GetData.getWord("Enter name of item");
        double price3 = GetData.getDouble("Enter price of item");
        int qty3 = GetData.getInt("Enter quantity of item");
        c.add(name3, price3, qty3);
        s = s + display(c, n);
        c.itemTotal();
        c.calculate(); 
        
 
        String name4 = GetData.getWord("Enter name of item");
        double price4 = GetData.getDouble("Enter price of item");
        int qty4 = GetData.getInt("Enter quantity of item");
        c.add(name4, price4, qty4);
        s = s + display(c,n);
        c.itemTotal();
        c.calculate();

        // Now average the price of the items
        c.average();

        // Make payment
        double amount = GetData.getDouble("Enter amount of money for payment");

        c.tendered(amount); // For example twenty dollars were tendered
        
        c.calculateChange();
        
        c.makeChange();
        
        s = s + generateReceipt(c);
        
        JTextArea text = new JTextArea(s,15,32);
        JScrollPane pane = new JScrollPane(text);
        
        JOptionPane.showMessageDialog(null, pane,"ABC Market", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static String display(Cashier c, NumberFormat n)
    {
        //Display each items name, quantity, and total price in a scrollabe pane
        String s = c.getName() + "(" + n.format(c.getQuantity()) + ")" + "..............." + c.getPrice() + "\n";
        
        return s;
    }
    
    static String generateReceipt(Cashier c)
    {
        // Write the necessary code that will generate a customer’s receipt.
        // The output must be displayed in a scrollable pane 
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        String s;
        
        s = "___________________________________";
        s = s + "\n" + "\tTotal.............. " + nf.format(c.getTotal());
        
        s = s + "\n\nThe number of items purchased is: " + c.getItemTotal()
                        + "\nThe average price per item is: " + nf.format(c.getAverage())
                        + "\n\nAmount tendered is: " + nf.format(c.tendered())
                        + "\nThe change is: " + nf.format(c.getChange())
                        + "\n\nThe change includes" 
                        + "\n" + c.getDollars() + " dollar(s)"
                        + "\n" + c.getQuarters() + " quarter(s)"
                        + "\n" + c.getDimes() + " dime(s)"
                        + "\n" + c.getNickels() + " nickel(s)"
                        + "\n" + c.getPennies() + " cent(s)";    
        
        return s;
    }
}


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

public class TestHotel 
{
    public static void main(String[] arg)
    {
	NumberFormat f = NumberFormat.getCurrencyInstance();
		
	// Create customer objects, calculate amounts, display receipts
	Hotel customer1 = new Hotel("10 - M", 2, 2);
        customer1.calculate();
        /*
        customer1.calculateRoomCost();        
        customer1.calculateTax();
        customer1.calculateSubTotal();
        customer1.calculateMealCosts();
        customer1.calculateTip();
        customer1.calculateAmtDue();
        */
        display(customer1, f);	

        Hotel customer2 = new Hotel("12 - B");
        customer2.addNights(1);
        customer2.calculate(); 
        /*
        customer2.calculateRoomCost();        
        customer2.calculateTax();
        customer2.calculateSubTotal();
        customer2.calculateMealCosts();
        customer2.calculateTip();
        customer2.calculateAmtDue();
        */
        display(customer2, f);
		

        Hotel customer3 = new Hotel("12 - C", 2);	
        customer3.addGuest(1);
        customer3.calculate();
        /*
        customer3.calculateRoomCost();        
        customer3.calculateTax();
        customer3.calculateSubTotal();
        customer3.calculateMealCosts();
        customer3.calculateTip();
        customer3.calculateAmtDue();
        */
        display(customer3, f);
    
        
        display(f);
	}
	
    static void display(Hotel  h, NumberFormat f)
    {
        // Set up and display heading and date for each receipt
        System.out.println("\tThe ABC Cheap Lodging, Inc");
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println("\tDate: \t" + df.format(d));
			
		
        //Display expenses line by line including subtotal as shown in the output
        System.out.println("Room#            " + h.getRoomNum() 
                         + "\nRoom Rate        " + f.format(h.getRoomRate())
                         + "\nLength of stay   " + h.getNightsNum() + " night(s)\n"
                         + "No. of guests    " + h.getGuestsNum()
                         + "\nRoom cost        " + f.format(h.getRoomCost())
                         + "\nTax6.5%          " + f.format(h.getTax())
                         + "\n\tSubtotal      " + f.format(h.getSubTotal())
                         + "\nTelephone        " + f.format(h.getPhone()) 
                         + "\nMeal charges     " + f.format(h.getMeal()) 
                         + "\nTip              " + f.format(h.getTip())
                        );
                
        //Display total
        System.out.println("\nTOTAL AMOUNT DUE\t.........." + f.format(h.getAmtDue()));

        //Display thank you message
        System.out.println("\nThanks for staying at The ABC Cheap Lodging, Inc" );
        System.out.println("\tPlease come again !!!");
        System.out.println("\n");
    }
    
    static void display(NumberFormat f)
    {      
    // Complete this method so that it displays the summary amounts as shown in the output
        System.out.println("\t\tOfficial Use Only");
        System.out.println("\n\t\tToday's Summary");
        System.out.println("\t    Room       ..... " + f.format(Hotel.getRoomTotal())
                         + "\n\t    telephone  ..... " + f.format(Hotel.getPhoneTotal())
                         + "\n\t    Meal       ..... " + f.format(Hotel.getMealTotal())
                         + "\n\t    Tips       ..... " + f.format(Hotel.getTotalTips())
                         + "\n\t    Tax        ..... " + f.format(Hotel.getTaxTotal())
                        );
        System.out.println("\t    ______________________________");
        System.out.println("\t    Gross transaction .." + f.format(Hotel.getGross()));
        System.out.println("\nProcess completed.");
    }
}

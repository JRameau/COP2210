/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class Hotel 
{
    private String room;
    private int guests;
    private int nights;
    
    private static final double ROOM_RATE = 79.95;
    private static final double TAX_RATE = 0.065;
    private static final double PHONE_RATE = 5.75;
    private static final double MEAL_RATE = 12.95;
    private static final double TIP_AMT = 0.075;
    
    private double tax;
    private double tip;
    private double meal;
    private double roomCost;
    
    private static double subTotal;    
    private static double amtDue;
    private static double grossRevenue;
    
    private static double total_room;
    private static double total_meal;
    private static double total_tips;
    private static double total_tax;
    private static double total_phone;
    
    public Hotel(String room)
    {
        this.room = room;
        guests = 1;
        nights = 1;
    }
    
    public Hotel (String room, int nights)
    {
        this(room);
        this.nights = nights;
    }
    
    public Hotel(String room, int nights, int guests)
    {
        this(room, nights);
        this.guests = guests;   
    }
    
    public String getRoomNum()
    {
        return room;
    }
    
    public double getRoomRate()
    {
        return ROOM_RATE;
    }
    
    public int getGuestsNum()
    {
        return guests;
    }
    
    public int getNightsNum()
    {
        return nights;
    }
    
    public double getRoomCost()
    {
        return roomCost;
    }
    
    public double getTax()
    {
        return tax;
    }
    
    public double getPhone()
    {
        return PHONE_RATE;
    }
    
    public double getMeal()
    {
        return meal;
    }
    
    public double getTip()
    {
        return tip;
    }
    
    public double getAmtDue()
    {
        return amtDue;
    }
    
    public double getSubTotal()
    {
        return subTotal;
    }
    
    public static double getRoomTotal()
    {
        return total_room;
    }
    
    public static double getMealTotal()
    {
        return total_meal;
    }
    
    public static double getPhoneTotal()
    {
        return total_phone;
    }
    
    public static double getTaxTotal()
    {
        return total_tax;
    }
    
    public static double getTotalTips()
    {
        return total_tips;
    }
    
    public static double getGross()
    {
        return grossRevenue;
    }

    public void calculate()
    {
        roomCost = ROOM_RATE * nights * guests;
        tax = TAX_RATE * roomCost;
        subTotal = roomCost + tax;
        meal = MEAL_RATE * guests * nights; 
        tip = TIP_AMT * (subTotal + PHONE_RATE + meal);
        amtDue = subTotal + PHONE_RATE + meal + tip;
        total_room += roomCost;
        total_meal += meal;
        total_phone += PHONE_RATE;
        total_tax += tax;
        total_tips += tip;
        grossRevenue = total_room + total_meal + total_phone + total_tax + total_tips;    
    }
    
    public void addNights(int amount)
    {
        nights = nights + amount;
    }
    
    public void addGuest(int amount)
    {
        guests = guests + amount;
    }
    /*
    public void calculateTax()
    {
        tax = TAX_RATE * roomCost;
    }
    
    public void calculateSubTotal()
    {
        subTotal = roomCost + tax;
    }
    public void calculateRoomCost()
    {
        roomCost = ROOM_RATE * (nights + guests);
    }
    
    public void calculateMealCosts()
    {
        meal = MEAL_RATE * (guests + nights);
    }
    
    public void calculateTip()
    {
        tip = TIP_AMT * (subTotal + PHONE_RATE + meal);
    }
    
    public void calculateAmtDue()
    {
        amtDue = subTotal + PHONE_RATE + meal + tip;
    }
    */
}

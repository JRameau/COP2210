/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
import javax.swing.JOptionPane;

public class GetData 
{
    public static String getWord(String n)
    {
        return JOptionPane.showInputDialog(n);
    }
    
    public static double getDouble(String n)
    {
        return Double.parseDouble(getWord(n));
    }
    
    public static int getInt(String n)
    {
        return Integer.parseInt(getWord(n));
    }
}


/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * 
 * @author: Stephen Connelly
 * @date: Febuary 7st, 2021
 * 
 */

import java.util.Scanner;//importing scanner

public class Minutes
{
    
    public static void main(String[] args)
    {
        
        Scanner keyboard;// naming scanner 'keyboard' 
        keyboard = new Scanner(System.in);

        System.out.println("Please type (integral) number of weeks");
        int w = keyboard.nextInt(); //next line user inputs weeks
        System.out.println("Please type (integral) number of days");
        int d = keyboard.nextInt();//next line user inputs days
        
        int dTotal=7*w+d;//formula to turns weeks into days and adds other days
        int m =dTotal*1440;//(days * 60 minuts * 24 hours)

        System.out.println("Hey, minutes is " + m);
        
        
    }
}
 
/**
 * This program accepts a series of positive intergers
 * and reports their average
 * 
 * @author: Stephen Connelly
 * @date: febuary 7th, 2021 
 */
 // get value, add it to a sum, add count, get next value and so on until user inputs -1 
 //and then divide sum by count 

import java.util.Scanner;

public class Average{
    
    public static void main(String[] args){

        double total = 0;
        double count = 0;
        int valueNext = 0;//initializing values

        System.out.println("Welcome to Average, input -1 when you're done inputting \n");//user inputs -1 to stop code
        Scanner scanneroidtron = new Scanner(System.in);//naming scanner 

        while(valueNext >= 0)//makes sure user is only inputting positive integers
        {
            System.out.println("Please enter value \n");
            valueNext = scanneroidtron.nextInt();
            if (valueNext != -1){
                total = total + valueNext;//ads values to running total
                count++;//keeps count after each value inputted
            }else{
            System.out.println("End of Algorithm \n");
            }
        }
        double averageInt = total/count;//used double to get decimal values

        System.out.println("The average of the values you have inputted is the interger \n" + averageInt);
        
    }
}
 
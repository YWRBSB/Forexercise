/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Yuri
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader myNumber = new BufferedReader(new InputStreamReader(System.in));
        
        int num1=0;
        int num2=0;
       
         
                System.out.println(" Please enter 1st number");     
          
        try {
              num1 = Integer.parseInt(myNumber.readLine());
               
                System.out.println("Please enter 2nd number");
              num2 = Integer.parseInt(myNumber.readLine());
              
        if (num1 > num2) 
                System.out.println(num1+ " is bigger than " +num2);
        else if (num1 == num2)
                System.out.println(num1+ " is equal " +num2);
        else
                System.out.println(num2+ " is bigger than "+num1);
        }  
   
        catch (Exception e){
               System.out.println("This is not a number!");
            
        }
    }
    
}

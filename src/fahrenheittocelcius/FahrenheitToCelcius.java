/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelcius;

import java.util.Scanner;

/**
 *
 * @author 92019179
 */
public class FahrenheitToCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Temp in fahrenheit");
         int fn = in.nextInt();
         int cel = +(((fn - 32) * 5) / 9); 
         System.out.println("the Temp in celsius is " +cel);
    }

    
}

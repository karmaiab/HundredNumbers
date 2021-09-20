/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundrednumbers;

import java.util.Scanner;

/**
 *
 * @author Danek
 */
public class HundredNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        System.out.printf(String.join("%n",
                "The number: %1$-5d"), number);
        int ones = number%10;
        System.out.println("Ones:" +ones);
        int tens = number/10%10;
        System.out.println("Tens:" +tens);
        int hundreds = number/100;
        System.out.println("Hundreds:" +hundreds);
    }
    
}

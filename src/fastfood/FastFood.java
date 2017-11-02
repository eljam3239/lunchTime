/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fastfood;
import java.util.Scanner;
/**
 *
 * @author eljam3239
 */
public class FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int numBurg;
       int numSalad;
       int numFF;
       int numSoda;
       System.out.println("Welcome to lunch. How many burgers would you like? ");// TODO code application logic here
       numBurg = input.nextInt();
       
       System.out.println("How many salads?");
       numSalad = input.nextInt();
       System.out.println("How many orders of french fries?");
       numFF = input.nextInt();
       System.out.println("How mant sodas?");
       numSoda = input.nextInt();
       Food burger = new Food(numBurg, 1.85, 9, 33, 1);
       Food salad = new Food(numSalad, 2, 1, 11, 5); 
       Food fries = new Food(numFF, 1.30, 11, 36, 4); 
       Food soda = new Food(numSoda, 0.95, 0, 38, 0);
       System.out.println("Each hamburger has "+burger.returnFacts());
       System.out.println("Each salad has "+salad.returnFacts());
       System.out.println("Each order o' fires has "+fries.returnFacts());
       System.out.println("Each soda has "+soda.returnFacts());
       System.out.println("Your order will come to "+Food.returnPrice());
       
    }
    
}

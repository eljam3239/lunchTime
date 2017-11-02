/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fastfood;

import java.text.NumberFormat;

/**
 *
 * @author eljam3239
 */
public class Food {
    private int quantity;
    private double price;
    private double fat;
    private double carbs;
    private double fiber;
    static private double orderPrice;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    public Food(int quant,double p, double fatt, double carb, double fibe){
        quantity = quant;
        price = p;
        fat = fatt;
        carbs=carb;
        fiber= fibe;
        orderPrice += quant*p; 
    }
    
    public static double returnPrice(){
        
        return orderPrice;
    }
    public String returnFacts(){
        String out;
        out = fat+"g of fat, "+carbs+"g of carbs, and "+fiber+"g of fiber.";
        return out;
    }
    
}

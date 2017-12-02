/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestDeliveryMan;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Food {

    public String getFoodID() {
        return FoodID;
    }

    public void setFoodID(String FoodID) {
        this.FoodID = FoodID;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    private String FoodID;
    private String FoodName;
    private String FoodType;
    private double FoodPrice;

    public Food(String FoodID, String FoodName, String FoodType, double FoodPrice) {
        this.FoodID = FoodID;
        this.FoodName = FoodName;
        this.FoodType = FoodType;
        this.FoodPrice = FoodPrice;

    }

    public Food() {

    }
    private int size = 0;
    private final static int Max_Size = 100;
    Food[] listFood = new Food[Max_Size];

    public void addFood() {

        Scanner reader = new Scanner(System.in);
        String name, type;
        double price;

        System.out.println("Enter the food name:");
        name = reader.nextLine();
        System.out.println("Enter the food type:");
        type = reader.nextLine();
        System.out.println("Enter the price for food");
        price = reader.nextDouble();

        if (!name.equals("") && price != 0.0 && !type.equals("")) {
            listFood[size] = new Food("F000"+size,name,type,price);
            size++;

        } else {
            System.out.println("Please do not leave any blank space");
        }
    }
    public void showFood(){
        System.out.println("FoodID"+"       " + "FoodName"+"     RM" + "FoodPrice"+"     " + "FoodType");
        System.out.println("---------------------------------------------------------------------------");

        for(int i=0;i<size;i++){
            System.out.println(listFood[i].FoodID+"   " + listFood[i].FoodName+"   RM" + listFood[i].FoodPrice+"   " + listFood[i].FoodType);
        }
         System.out.println("---------------------------------------------------------------------------");

    }

    

    @Override
    public String toString() {
        return null;
    }

}

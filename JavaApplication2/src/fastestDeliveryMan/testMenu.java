/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestDeliveryMan;

/**
 *
 * @author USER
 */
import java.util.*;

public class testMenu {

   

    public static void main(String[] args) {
        boolean selection =true;
        String ans ;
        Food food = new Food();
        do{
            
            food.addFood();
            
            food.showFood();
            Scanner reader = new Scanner(System.in);
            System.out.println("Do you want to continous adding menu?(Y/N)");
            ans = reader.nextLine();
            if(ans.equals('y')  || ans.equals('Y')){
                selection = true;
            }else if (ans.equals('n')  || ans.equals('N')){
                selection = false;
                break;
            }else{
                //repleac the que.
            }
        }while(selection == true);
    }

}

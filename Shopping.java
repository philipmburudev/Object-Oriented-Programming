//This program is to create a shopping list. It asks for the item, the number of items and the price of the item. 
//It then calculates the total price of the items.

import java.util.Scanner;


public class Shopping {
    public static void main(String[] args){
        int numberofdrinks, priceperdrink, totalprice;
        String item;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item: ");
        item = input.nextLine();
        System.out.println("Enter the number of "+ item);
        numberofdrinks = input.nextInt();
        System.out.println("Enter the price of the: " + item);  
        priceperdrink = input.nextInt();
        totalprice = numberofdrinks * priceperdrink;
        System.out.println("The total price of " + item + "is " + totalprice);


    }
}



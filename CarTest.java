package mycar;

import java.util.Scanner;
public class CarTest {

    public static void main(String[] args){


        Car car1 = new Car();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Name: " );
        car1.setName(input.nextLine());
    
        System.out.println("Enter Model: " );
        car1.setModel(input.nextLine());

        System.out.println("Enter Color: " );
        car1.setColor(input.nextLine());

        System.out.println("Enter Year: " );
        car1.setYear(input.nextInt());

   
        System.out.println("\n" + "Name: " + car1.getName());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());
    
}

}

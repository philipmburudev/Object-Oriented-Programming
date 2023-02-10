package mylaptop;

public class LaptopTest {

    public static void main(String[] args){

        //create a new object called laptop1 of type Laptop and assign it variables using blue-print from Laptop.java
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Apple");
        laptop1.setModel("Macbook Pro");
        laptop1.setColor("Silver");


        //print out the details of the laptop
        System.out.println("My laptop is an " + laptop1.getBrand() + " " + laptop1.getModel() + " and it is " + laptop1.getColor() + " in color.");



        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Hp");
        laptop2.setModel("Pro");
        laptop2.setColor("Black");

        System.out.println("My second laptop is a " + laptop2.getBrand() + " " + laptop2.getModel() + " and it is " + laptop2.getColor() + " in color.");

    }
    
}

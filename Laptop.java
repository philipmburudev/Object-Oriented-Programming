package mylaptop;

public class Laptop {

    //declare instance variables
    private String brand;
    private String model;
    private String color;
    

    //default constructor which will help us create/build new objects of type Laptop in the LaptopTest class
    Laptop(){}



    //create a mutator method that returns nothing but sets the brand of the laptop. Here we use the this. keyword to refer to the instance variable. 
    //This is called variable hiding

    // public void setBrand(String brand){
    //     this.brand = brand;
    // }


    // public void setModel(String model){
    //     this.model = model;
    // }


    // public void setColor(String color){
    //     this.color = color;
    // }



    //create an mutator method without this. keyword. Here we create a new brand variable (lBrand) and assign it to the instance variable brand
    public void setBrand(String lBrand){
        brand = lBrand;
    }

    public void setModel(String lModel){
        model = lModel;
    }
    
    public void setColor(String lColor){
        color = lColor;
    }



    //create an accessor method that gets and returns the brand of the laptop
    String getBrand(){
        return brand;
    }

    String getModel(){
        return model;
    }

    String getColor(){
        return color;
    }


}

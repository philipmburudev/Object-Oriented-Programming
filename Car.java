package mycar;

public class Car {

    String name;
    String model;
    String color;
    int year;




    Car(){}

    //mutator method 
    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }


    String getName(){
        return name;
    }

    String getModel(){
        return model;
    }

    String getColor(){
        return color;
    }

    int getYear(){
        return year;
    }


}
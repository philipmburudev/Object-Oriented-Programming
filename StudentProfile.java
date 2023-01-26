
//This code creates a students profile. It asks fro their name and each then calculates the mean age of the students

import java.util.Scanner;

class StudentProfile{
    public static void main(String[] args){
        String student1;
        String student2;
        String student3;

        int age1;
        int age2;
        int age3;

        Scanner keyboard = new Scanner(System.in);  //to create a scanner object and store it in a variable called keyboard


        System.out.println("Student 1, What is your name?: ");
        student1 = keyboard.nextLine();
        System.out.println(student1 + ", what is your age?: ");
        age1 = keyboard.nextInt();
        System.out.println("your name is " + student1 + " and your age is " + age1);


        keyboard.nextLine(); //to create a new line


        System.out.println("Student 2, What is your name?: ");
        student2 = keyboard.nextLine();
        System.out.println(student2 + ", what is your age?: ");
        age2 = keyboard.nextInt();
        System.out.println("your name is " + student2 + " and your age is " + age2);


        keyboard.nextLine();


        System.out.println("Student 3, What is your name?: ");
        student3 = keyboard.nextLine();
        System.out.println(student3 + ", what is your age?: ");
        age3 = keyboard.nextInt();
        System.out.println("your name is " + student3 + " and your age is " + age3);


        //to find the average of age
        int mean = ((age1 + age2 + age3) / 3);
        System.out.println("The mean age of the three students is " + mean);

    }
}


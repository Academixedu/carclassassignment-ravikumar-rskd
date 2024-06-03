package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();
        System.out.println("\n....*********......");

        // Bank class details
        Bank bank = new Bank("SBI", "Ravikumar", "34433382110", 2500.00);
        // Display bank details
       bank.displayAccountDetails();
        // modify bank details
        bank.setAccountNumber("34433381002");
        bank.setBalance(25000.00);
        // Diplay updated Bank deatails
        System.out.println("\nUpdated Bank details:");
        bank.displayAccountDetails();
        System.out.println("\n....*********......");

        // Bike class details
        Bike bike = new Bike("Yamaha", "FZ-v3.0", 2024, "Red", 150000);
        // Print details of Bike
        bike.displayBikeDetails();
        // modify details of bike
        bike.setModel("FZ-v4.0");
        bike.setPrice(160000);
        
        System.out.println("\nUpdated Bike details:");
        bike.displayBikeDetails();
        System.out.println("\n....*********......");

        //Student class details
        //Created student object
        Student student=new Student("Ravikumar ", 23, "19131A0273", "Yes");
        student.displayStudentDetails();
        //Modify student details
       System.out.println("\nUpdated student details:");
        student.setName("Giri");
        student.setAge(22);
        //Print updated details
        student.displayStudentDetails();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author hp
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

  
    public Person() {
        this.name = "Babun";
        this.age = 23;
        this.gender = "Male";
        this.address = "Mohammadpur";
    }

    
    public Person(String name, int age) {
        this(); 
        this.name = name;
        this.age = age;
    }

    
    public Person(String name, int age, String gender, String address) {
        this(name, age); 
        this.gender = gender;
        this.address = address;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }

    
    public void greet() {
        System.out.println("Hi, I'm " + this.name);
    }

    
    public void greet(String message) {
        System.out.println("Hi, I'm " + this.name + ". " + message);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        Person person2 = new Person("Taqi", 25);
        person2.displayInfo();

        Person person3 = new Person("Babun", 23, "Male", "Mohammadpur");
        person3.displayInfo();

        person1.greet();
        person2.greet("So, what's up!");
    }
}

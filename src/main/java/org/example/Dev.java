package org.example;




public class Dev {
   private Laptop laptop;
    private int age=8;

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("thsis is dev constructo for laptop");
    }
    public Dev(){
        System.out.println("Dev class here");
    }

    public void build(){


    System.out.println("Building Dev page ");
    laptop.compiler();
}

public Dev(int age){
        this.age=age;
        System.out.println("Dev 1 contructor");
}

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
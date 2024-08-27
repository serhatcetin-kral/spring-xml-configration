package org.example;

public class Dev {
 private Computer computer;

    public Dev(){
        System.out.println("Dev conctructor");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public void build(){


   System.out.println("Building Dev page ");
     computer.compiler();
}


}
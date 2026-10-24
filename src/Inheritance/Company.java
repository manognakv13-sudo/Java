package Inheritance;


class Person{
    String name = "anand";

}

class Employee extends Person{
    String employeeId = "1234QWE";
}

class Manger extends Employee{
    int teamSize = 40;

    void display(){
        System.out.println("name  " +super.name);
        System.out.println("id  " + super.employeeId);
        System.out.println("team  " +teamSize);
    }
}
public class Company {
    public static void main(String[] args) {


        Manger m = new Manger();
        m.display();
    }
}

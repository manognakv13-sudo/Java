package PolymorphismTasks;


class Animal{
    void makeSound(){
        System.out.println("bahh bahh");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("meow meow");
    }
}
class Cow extends Animal{
    void makeSound(){
        System.out.println("ambah ambah");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a= new Dog();
        a.makeSound();

        a= new Cat();
        a.makeSound();

        a= new Cow();
        a.makeSound();

    }
}

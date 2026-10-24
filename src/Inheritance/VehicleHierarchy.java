package Inheritance;


import org.w3c.dom.ls.LSOutput;

class vehicle{
    String brand = "bajaj";

    void start(){
        System.out.println("the vehicle starts like buzz!!");
    }
}
class Car extends vehicle{

    String brand = super.brand;

    @Override
    void start(){
        super.start();
        System.out.println("the car starts like voooooh! ");
    }
}

class bike extends vehicle{

    String brand = "hayaboosa";

    @Override
    void start(){
        System.out.println("the bike starts like ronnnanaronnnana! ");
    }
}


public class VehicleHierarchy {
    public static void main(String[] args) {


        vehicle v = new bike();
        System.out.println(v.brand);
        v.start();

        vehicle v1 = new Car();
        System.out.println(v1.brand);
        v1.start();
    }
}

package SuperKeywordTask;



class Vehicle{
    String brand ;
    Vehicle(String brand){
        this.brand = brand;
    }
}
class Car extends Vehicle{
    String model ;
    Car(String model){
        super("benz");
        this.model = model;
    }
    void display(){
        System.out.println("the car brand is:"+super.brand);
        System.out.println("the brand model is:"+this.model);
    }


}
public class Wheelers {
    public static void main(String[] args) {
        Car c = new Car("7898");

        c.display();

        Vehicle vehicle = new Car("9090");
        System.out.println(vehicle.brand);

    }

}

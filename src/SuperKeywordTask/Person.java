package SuperKeywordTask;



class persons{
    String name = "manonga";
    void display(){
        System.out.println("this is parent class");
    }

}
class Employee extends persons{
    String name = "manukv";
    @Override
    void display(){
        System.out.println("this is child class");
        System.out.println(super.name);
        System.out.println(this.name);
        super.display();
    }

}
public class Person {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.display();
        persons persons = new persons();
        persons.display();
    }
}

package abstractTask;

public abstract class Employee {
    Employee(){

    }
    String name = "manogna k V";

    public void displayName(){
        System.out.println("this is employee name :"+name);
    }

    abstract void calculateSalary(float amount);
}

class FUllTimeEmployee extends Employee{

    @Override
    void calculateSalary(float amount) {
        System.out.println("the full time employee salary is "+ amount*30 );
    }
}

class PartTimeEmployee extends Employee{
    @Override
    void calculateSalary(float amount) {
        System.out.println("the part time employee salary is "+ amount*15);
    }
}

package abstractTask;

public abstract class Shape{
    abstract double calculateArea(double radius);

}

class circle extends Shape{

    @Override
    double calculateArea(double radius) {
        double area = 3.14 * (radius*radius);
        return area;
    }
}

class Rectangle extends Shape{
    double breadth ;
    Rectangle(double breadth){
        this.breadth = breadth;
    }

    @Override
    double calculateArea(double length) {

        double area = length * breadth;
        return area;
    }
}
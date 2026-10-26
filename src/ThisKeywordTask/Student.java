package ThisKeywordTask;

public class Student {
    String name ;
    int age;
    Student(String name,int age ){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println("age is "+age);
        System.out.println("name is "+name);
    }

    public static void main(String[] args) {
        Student student = new Student("manogna k v", 21);
        student.display();

    }
}

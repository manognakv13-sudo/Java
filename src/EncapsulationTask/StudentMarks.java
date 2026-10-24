package EncapsulationTask;

public class StudentMarks {
    private String name ;
    private long marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        if(marks > 100 || marks < 0){
            throw new ArithmeticException("please enter marks between 0-100");
        }
        this.marks = marks;
    }
     void display(){
        System.out.println("the student name is "+ name);
        System.out.println("the student marks is "+ marks);
    }

    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setName("manogna k v");
        studentMarks.setMarks(10);
        studentMarks.display();
    }


}

package lab_5_tasks;/*Create a Student class that stores student data, provides methods for initializing and displaying
student data.Also provide a parameterized constructor for initializing student class data members.
 */

class Student{
    private String name;
    private String rollNo;
    private int year;
    private String semester;

    Student(String name, String rollNo, int year, String semester){
        this.name=name;
        this.rollNo=rollNo;
        this.year=year;
        this.semester=semester;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getSemester() {
        return semester;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student= new Student("Syeda Anoosha","21SW004",2021,"2nd");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll Number: " + student.getRollNo());
        System.out.println("Student Semester: " + student.getSemester());
        System.out.println("Student Year: " + student.getYear());
    }
}
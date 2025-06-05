import java.util.*;
class Student {
    String name;
    String std;
    Student(String n, String s) {this.name = n; this.std = s;}
    public String toString() { return "name: " + name + " std: " + std;}
}
public class ArrayListDemo { 
    public static void main(String[] args) {
        ArrayList<Student> studList = new ArrayList<>();
        studList.add(new Student("ABC", "SY"));
        studList.add(new Student("XYZ", "SY"));
        for(Student s: studList) {
            System.out.println("Name: " + s.name);
            System.out.println("Std: " + s.std);
        }
    }
}

package stream;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        Student student1 = new Student("Bob",'m',20,3,3.5);
        Student student2 = new Student("Den",'m',19,2,4.8);
        Student student3 = new Student("Vika",'f',21,4,6.7);
        Student student4 = new Student("Lena",'f',18,1,4.9);
        Student student5 = new Student("John",'m',22,5,5.4);

        Faculty faculty1 = new Faculty("Economic");
        Faculty faculty2 = new Faculty("Applied Mathematics");
    }
}
class Faculty {

    String name;
    List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
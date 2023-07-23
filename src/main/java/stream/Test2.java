package stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        Student student1 = new Student("Bob",'m',20,3,3.5);
        Student student2 = new Student("Den",'m',19,2,4.8);
        Student student3 = new Student("Vika",'f',21,4,6.7);
        Student student4 = new Student("Lena",'f',18,1,4.9);
        Student student5 = new Student("John",'m',22,5,5.4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.stream()
                .map(e -> {e.setName(e.getName().toUpperCase());return e;})
                .filter(student -> student.getSex()=='f')
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

//        students.stream()
//                .sorted(Comparator.comparing(Student::getAge))
//                .forEach(System.out::println);

       // System.out.println(students);

//       students = students.stream()
//                .filter(e -> e.age >18 && e.avgGrade > 4.3)
//                .collect(Collectors.toList());
//        System.out.println(students);

    }




}
class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}

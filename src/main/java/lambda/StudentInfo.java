package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Collections.*;

public class StudentInfo {

    void testStudent(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

    private static double avgOfSmth(List<Student> list, Function<Student,Double> f) {
        double res = 0;
        for (Student st : list) {
            res += f.apply(st);
        }
        res = res/list.size();
        return res;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Bob",'m',20,3,3.5);
        Student student2 = new Student("Den",'m',19,2,4.8);
        Student student3 = new Student("Vika",'f',21,4,6.7);
        Student student4 = new Student("Lena",'f',18,1,4.9);
        Student student5 = new Student("John",'m',22,5,5.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo studentInfo = new StudentInfo();

        double res = avgOfSmth(students,student -> (double)student.course);
        System.out.println(res);
//        students.sort((stud1, stud2) -> stud1.age - stud2.age);
//        System.out.println(students);
//        System.out.println("-----------------------------------");
//        studentInfo.testStudent(students, (Student s) -> s.avgGrade > 4);
//        System.out.println("-----------------------------------");
//        studentInfo.testStudent(students,(Student s) -> s.age < 20);
//        System.out.println("-----------------------------------");
//        studentInfo.testStudent(students,(s -> s.age > 17 && s.avgGrade < 5 && s.sex == 'f'));
//
//        Predicate<Student> p1 = student -> student.avgGrade > 5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//        studentInfo.testStudent(students,p1);
//        studentInfo.testStudent(students,p1.negate());





    }
//    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//
//        for (Student s : students) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> students, int age) {
//
//        for (Student s : students) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> students,int age, double grade,char sex) {
//
//        for (Student s : students) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }


}
//interface CheckStudent {
//
//    boolean checks(Student s);
//
//}
//class CheckOverGrade implements CheckStudent{
//
//    @Override
//    public boolean checks(Student s) {
//        return s.avgGrade > 4;
//    }
//}
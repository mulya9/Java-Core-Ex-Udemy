package work_vis_file.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    String name;
    String department;
    int age;
    transient double salary;
    Car car1;

    public Employee(String name, String department, int age, double salary, Car car1) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car1 = car1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car1=" + car1 +
                '}';
    }
}

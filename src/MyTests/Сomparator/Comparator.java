package src.MyTests.Сomparator;

import java.util.ArrayList;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Alex", 1000, 23, 5));
        employeeList.add(new Employee("Nikita", 1500, 35, 10));
        employeeList.add(new Employee("Igor", 1200, 18, 1));
        employeeList.add(new Employee("Ivan", 1300, 30, 6));
        employeeList.add(new Employee("Katya", 2000, 45, 7));
        employeeList.add(new Employee("Natasha", 780, 18, 0));

        java.util.Comparator<Employee> name = new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        java.util.Comparator<Employee> age = new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        };
        java.util.Comparator<Employee> salary = new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary;
            }
        };
        java.util.Comparator<Employee> experience = new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.experience - o2.experience;
            }
        };
        employeeList.sort(name);
        System.out.println(employeeList.toString());

    }
}

class Employee {
    int salary;
    int age;
    int experience;
    String name;

    public Employee(String name, int salary, int age, int experience) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Имя - " + name + "\n" + " Возраст - " + age + "\n" + " Опыт работы - " + experience + "\n"
                + "Зарплата - " + salary + "\n";
    }
}

package MAP;

import java.util.HashMap;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Zack", "chicago", 25);
        Employee e2 = new Employee("Dima", "Denver", 26);
        Employee e3 = new Employee("Alex", "Zion", 35);
        Employee e4 = new Employee("David", "New York", 55);

        HashMap<Long, Employee> employees = new HashMap();

        employees.put(e1.id, e1);
        employees.put(e2.id, e2);
        employees.put(e3.id, e3);
        employees.put(e4.id, e4);

        System.out.println(e1.name);

        printNames(employees);
        printID(employees);
    }

    public static void printNames(HashMap<Long, Employee> map1) {

        for (Employee e : map1.values()) {
            System.out.println(e.name);
        }
    }

    public static void printID(HashMap<Long, Employee> map1) {

        System.out.println(map1.keySet());

    }
}

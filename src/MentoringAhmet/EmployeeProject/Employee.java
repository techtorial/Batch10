package MentoringAhmet.EmployeeProject;

import java.time.LocalDate;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double taxCalculation(){
        if(salary>1000){
            return salary*0.03;
        }
        return 0.0;
    }
    public double bonusCalculation(){
        int extraHours = workHours-40;
        if(extraHours>0){
            return extraHours*30;
        }
       return 0.0;
    }
    public double increaseSalary(){
        LocalDate date = LocalDate.now();

        int year = date.getYear()-hireYear;
        if(year<10){
            return salary*0.05;
        }else if(9<year && year<20){
            return salary*0.1;
        }else{
            return salary*0.15;
        }
    }
    public void information(){
        System.out.println("Name : " + name);
        System.out.println("Salary : "+ salary );
        System.out.println("WorkHours : " + workHours);
        System.out.println("HireYear : " + hireYear);
        System.out.println("Tax : " + taxCalculation()+"$");
        System.out.println("Bonus : " + bonusCalculation()+"$");
        System.out.println("IncreaseSalary : " + increaseSalary());
        double totalSalary = (salary-taxCalculation())+bonusCalculation();
        System.out.println("Total Salary with tax and Bonus : " + totalSalary);
        System.out.println("Total Salary with increase salary : " + (salary+increaseSalary()));
    }

}

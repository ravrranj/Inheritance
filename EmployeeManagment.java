

// Employee Management System

//Base class

class Employee {
    String name;
    int id;
    double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
    }
}

//Single Inheritance: FullTimeEmployee extends Employee
class FullTimeEmployee extends Employee {
    double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus){
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Full-Time Bonus: $" + bonus + ", Total Salary: $" + calculateSalary());

  }
}

//Single Inheritance: FullTimeEmployee extends Employee
class FullTimeEmployee extends Employee {
   double bonus;

   public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
    super(name, id, baseSalary);
    this.bonus = bonus;
   }
   
   public double calculateSalary() {
    return baseSalary + bonus;
   }

   public void displayDetails() {
    super.displayDetails();
    System.out.println("Full-time Bonus: $" + bonus + ", Total Salary: $" + calculateSalary());
   }
}
//Single Inheritance: PartTimeEmployee extends employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
    super(name, id, hourlyRate * hoursWorked);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Part-Time hours worked: " + hoursWorked + ", Total Salary: $" + calculateSalary());
    }

}

//Multilevel Inheritance Manager extends FullTimeEmployee
class Manager extends FullTimeEmployee {
    double performanceBonus;
    
    public Manager(String name, int id, double baseSalary, double bonus, double performanceBonus) {
        super(name, id, baseSalary, bonus);
        this.performanceBonus = performanceBonus;
    }

    public double calculateSalary() {
        return super.calculateSalary() + performanceBonus;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manager Performance Bonus: $" + performanceBonus + ",Final Salary: $" + calculateSalary());
    }
}
//Main Class
public class EmployeeManagment {
 public static void main(String[] args) {
    FullTimeEmployee fte = new FullTimeEmployee("Kamal", 2125678, 35000, 2000);
    PartTimeEmployee pte = new PartTimeEmployee("Rohith" , 1125672, 28000, 1000);
    Manager mgr = new Manager("Ravi", 32679002, 47000, 5000, 1000);

    System.out.println("--------------Employee Details----------------");
    fte.displayDetails();
    System.out.println();
    pte.displayDetails();
    System.out.println();
    mgr.displayDetails();
    System.out.println();
 }
}
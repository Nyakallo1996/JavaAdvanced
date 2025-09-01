package ex03_1_exercise;

public class EmployeeApp {
    public static void main(String[] args) {
        Admin adm = new Admin("Dianne Jacobs", 25, 3000.00);// This creates an instance of the Admin class (likely a subclass of Employee) with the name "Dianne Jacobs", age 25, and salary 3000.00.
        Engineer eng = new Engineer("Netta Gallant", 40, 9000.00);
        Manager man = new Manager("Geroma Kayser", 31, 7500.00, "Finance");
        Director dir = new Director("Ginny Sayles", 31, 6250.00, "Marketing");

        System.out.println("---Admin---"); // This prints a section header "---Admin---" to indicate the following lines will describe the Admin.
        System.out.println(adm.getName() + " our Administrative Assistant, earns R" + adm.getSalary()); // This prints the name and salary of the admin using getter methods: getName() and getSalary().
        System.out.println("---Engineer---");
        System.out.println("Our company engineer is " + eng.getName());
        System.out.println("---Manager---");
        System.out.println(man.getName() + " is the " + man.getDeptName() + " Manager.");
        System.out.println("---Director---");
        System.out.println(dir.getName() + " is the " + dir.getDeptName() + " Director.");
    }
}

// This program creates and displays details about four employees of different roles: Admin, Engineer, Manager, and Director. Each object is instantiated with personal and job-specific data (like name, age, salary, and department). Then, their details are printed to the console using accessor methods like getName(), getSalary(), and getDeptName().
//
//To fully work, this code assumes the existence of Admin, Engineer, Manager, and Director classes, likely all extending a common Employee superclass.
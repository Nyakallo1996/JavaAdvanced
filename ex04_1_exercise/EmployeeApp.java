package ex04_1_exercise;

public class EmployeeApp {
    public static void main(String[] args) {
        Admin adm = new Admin("Dianne Jacobs", 25, 3000.00);
        Engineer eng = new Engineer("Netta Gallant", 40, 9000.00);
        Manager man = new Manager("Geroma Kayser", 31, 7500.00, "Finance");
        Director dir = new Director("Ginny Sayles", 31, 6250.00, "Marketing");

        System.out.println("---Admin---");
        System.out.println(adm.printInfo());
        System.out.println("---Engineer---");
        System.out.println(eng.printInfo());
        System.out.println("---Manager---");
        System.out.println(man.printInfo());
        System.out.println("---Director---");
        System.out.println(dir.printInfo());
    }
}

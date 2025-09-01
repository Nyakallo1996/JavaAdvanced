package ex04_2_exercise;

public class Director extends Manager {
    Director(String name, int age, double salary,String deptName) {
        super(name, age, salary,deptName);
    }
    @Override
    public String printInfo() {
        return super.printInfo();
    }
}

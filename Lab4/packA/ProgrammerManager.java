package Java.OOP.Lab4.packA;

/*
 * 65050252
 */

 public class ProgrammerManager extends Programmer implements ManagerRoles {

    public ProgrammerManager(String n, int exp, int sal) {
        super(n, exp, sal);
    }

    public void sayHi() {
        addSkills("solidity");
        addSkills("typescript");
        System.out.println("Coding in " + getSkills());
    }

    public String coding() {
        return "";
    }

    public int evaluate(Programmer p) {
        return p.salary += p.salary*0.15;
    }

    @Override
    public String toString() {
        return "ManagerProgrammer [name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
    }
}
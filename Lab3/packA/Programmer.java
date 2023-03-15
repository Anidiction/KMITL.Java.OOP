package Java.OOP.Lab3.packA;

/*
 * 65050252
 */

 public class Programmer extends EmpTmp {

    public Programmer(String n, int exp, int sal) {
        this.name = n;
        this.salary = sal;
        this.experience = exp;
    }
    public String toString() {
        return "Programmer [name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
    }

    @Override
    public void sayHi() {
        System.out.println("hi from " + name);
    }

    public String coding() {
        return "I love java";
    }

}

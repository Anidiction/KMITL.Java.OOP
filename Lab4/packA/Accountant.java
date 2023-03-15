package Java.OOP.Lab4.packA;

/*
 * 65050252
 */

 public class Accountant extends Employee {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;


    public String tellProfit() {
        int randNum = (int) (Math.random() * 1000) + 1;
        return companyName + "'s profit is " + randNum + ". My salary is " + salary;
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says hello");
    }

    public static String tellMyRole() {
        return "I am an accountant at %s" + companyName;
    }
}
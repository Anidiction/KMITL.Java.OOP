package Java.OOP.Lab2;

import Java.OOP.Lab2.packA.Programmer;

public class Lab2_Inheritance {
    public static void main(String[] args) {
        q1();
    }

    static void q1() {
        Programmer p1 = new Programmer("ber1", 2, 500);
        System.out.println(p1); // Programmer [name=ber1, salary=500, experience=2]
    }
}

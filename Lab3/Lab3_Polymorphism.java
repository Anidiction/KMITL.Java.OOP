package Java.OOP.Lab3;

import java.util.ArrayList;
import Java.OOP.Lab3.packA.*;

public class Lab3_Polymorphism {
    public static void main(String[] args) {
        q1();
    }

    static void q1() {
        ArrayList<EmpTmp> aList = new ArrayList<>();
        aList.add(new Accountant("goodAtmyJob", 7, 6, 390, "sing"));
        aList.add(new Accountant("canRap", 4, 9, 480, "rap"));
        aList.add(new Salesperson("mr.salesperson", 5, 150, 5000));
        aList.add(new Salesperson("mr.kayan", 3, 260, 9000));
        aList.add(new Programmer("Keng", 2, 300));
        aList.add(new EmpTmp("invisible", 9, 120));

        System.out.println("Upcasting");
        for (EmpTmp e : aList) {
            // as an EmpTmp reference, its methods are of EmpTmp
            // but the method invoked is of the actual object type
            e.sayHi();
        }
        System.out.println("Downcasting");
        for (EmpTmp e : aList) { // downcasting
            String str;
            if (e instanceof Programmer) {
                str = ((Programmer) e).coding();
            } else if (e instanceof Salesperson) {
                str = ((Salesperson) e).makeQuotation();
            } else if (e instanceof Accountant) {
                str = ((Accountant) e).tellProfit();
            } else {
                continue;
            }
            System.out.println(str);
        }
    }
}

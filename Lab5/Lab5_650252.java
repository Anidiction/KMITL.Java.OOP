package Java.OOP.Lab5;

import java.util.Arrays;

public class Lab5_650252 {
    static int[] data = { 28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberOfEvenElement; // 4
    static ArrayProcessor q2IndexOfLargestEvenValue; // 1
    static ArrayProcessor myMedian; // n/2th element of sorted = 48

    public static void main(String[] args) {
        q1();
        q2();
        oneline();
    }

    static void q1() {
        q1NumberOfEvenElement = (arr) -> {
            int cnt = 0;
            for (int i : arr) {
                if(i % 2 == 0) {
                    cnt++;
                }
            }
            return cnt;
        };
        System.out.println(q1NumberOfEvenElement.calculate(data));
    }

    static void q2() {
        q2IndexOfLargestEvenValue = (arr) -> {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    if (arr[i] > max) {
                        max = arr[i];
                        maxIndex = i;
                    }
                }
            }
            return maxIndex;
        };
        System.out.println(q2IndexOfLargestEvenValue.calculate(data));
    }

    static void oneline() {
        int[] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = (arr) -> tmp[tmp.length/2];
        System.out.println(myMedian.calculate(tmp)); // 48
    }
}
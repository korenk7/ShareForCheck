package Classwork1405;

import java.util.Scanner;

public class Recu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me x");
        int x = sc.nextInt();
        int y = method(x);
        System.out.println(y);
    }

    static int method(int x) {
        if (x < 0) {
            return 0;
        } else
        return (x + method(x - 1));
    }

}

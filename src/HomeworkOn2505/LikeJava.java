package HomeworkOn2505;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LikeJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println("Please enter the line");
        stringWork(scanner.nextLine());
        System.out.println("Task #2:");
        System.out.println("give me first");
        String first = scanner.nextLine();
        System.out.println("give me second");
        String second = scanner.nextLine();
        countIt(first, second);
        System.out.println("Task #3:");
        System.out.println("give me string");
        calculateLetters(scanner.nextLine());

        System.out.println("Task #4:");
        System.out.println("give me int for checking");
        dospace(scanner.nextInt());
        System.out.println("Task5");
        System.out.println("give me string for checking");
        spacechecking(scanner.nextLine());

    }

    static void stringWork(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("Last symbole of String");
        System.out.println(stringBuilder.charAt(stringBuilder.length() - 1));

        if (str.endsWith("!!!") == true) {
            System.out.println("ends with !!!");
        } else System.out.println("ends not with  !!!");

        if (str.startsWith("I like") == true) {
            System.out.println("starts with ilike yes");
        } else System.out.println("starts with ilike no");

        if (str.matches("(.*)Java(.*)")) {
            System.out.println("string is containe JAVA");
        } else System.out.println("string is NOT containe JAVA");

        System.out.println("position of substring");
        System.out.println("Index of Java is " + str.indexOf("Java"));
        System.out.println("Index of Java is " + str.lastIndexOf("Java"));

        System.out.println("change symbols a on o");
        System.out.println(str.replace('a', 'o'));

        System.out.println("Upper");
        System.out.println(str.toUpperCase());

        System.out.println("Lower");
        System.out.println(str.toLowerCase());

        System.out.println("Delete substring");
        System.out.println(str.replace("like", ""));


    }

    static void countIt(String first, String second) {

        StringBuilder stringBuilder = new StringBuilder();
        int result = Integer.parseInt(first) + Integer.parseInt(second);
        String stresult = String.valueOf(result);
        System.out.println(stringBuilder.append(first).append(" + ").append(second).append(" = ").append(stresult));
        StringBuilder stringBuilder2 = new StringBuilder();
        int result2 = Integer.parseInt(first) - Integer.parseInt(second);
        String strresult2 = String.valueOf(result2);
        System.out.println(stringBuilder2.append(first).append(" - ").append(second).append(" = ").append(strresult2));
        StringBuilder stringBuilder3 = new StringBuilder();
        int result3 = Integer.parseInt(first) * Integer.parseInt(second);
        String strresult3 = String.valueOf(result3);
        System.out.println(stringBuilder3.append(first).append(" * ").append(second).append(" = ").append(strresult3));
        System.out.println(stringBuilder.replace(7, 8, "ravno"));
        System.out.println(stringBuilder2.replace(7, 8, "ravno"));
        System.out.println(stringBuilder3.replace(7, 8, "ravno"));
        System.out.println(stringBuilder.replace(7, 12, "="));
        System.out.println(stringBuilder2.replace(7, 12, "="));
        System.out.println(stringBuilder3.replace(7, 12, "="));

    }

    static void calculateLetters(String str) {
        int countsmall = 0;
        int countbig = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            for (int j = 97; j < 123; j++) {
                if (array[i] == j) {
                    countsmall++;
                }
            }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 65; j < 91; j++) {
                if (array[i] == j) {
                    countbig++;
                }
            }

        }
        System.out.println("count of small letters is " + countsmall);
        System.out.println("count of big letters is " + countbig);
    }

    static void dospace(Integer i) {
        String str = String.valueOf(i);
        StringBuilder stringBuilder = new StringBuilder(str);
        int n = stringBuilder.length();
        while (n > 3) {
            stringBuilder.insert(n - 3, " ");
            n = n - 3;
        }

        System.out.println(stringBuilder.toString());
    }


    static void spacechecking(String str) {
        String[] strings = str.trim().split("\\s*(\\s)");
        for (String substr : strings) {
            System.out.print(substr.trim() + " ");
        }

    }

}



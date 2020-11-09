package Classwork0106Collections;

import java.util.*;

public class Collectiontask2 {
   // выбор самой короткой строки из 5 введённых
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Task2");
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int stringcounter = i + 1;
            System.out.println("give me " + stringcounter + " string with few words");
            words.add(scanner.nextLine());
        }

        int minLenght2 = words.get(0).length();
        int[] arrayOfIndexes = new int[5];

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() <= minLenght2) {
                minLenght2 = words.get(i).length();

            }
        }
        System.out.println(minLenght2);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == minLenght2) {
                arrayOfIndexes[i] = i;
                System.out.println("shotest strings is " +words.get(i)+" num of string "+(i+1));
            }
        }
        System.out.println(words);
    }
}

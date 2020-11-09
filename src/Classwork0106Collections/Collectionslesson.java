package Classwork0106Collections;

import java.util.*;

public class Collectionslesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // задание 3 сортировка в коллекциях
        System.out.println("------------------------------------------------------");
        System.out.println("Task 3");
        List<String> books = new ArrayList<>();
        books.add("Anna Karenina");
        books.add("Faraway to arms");
        books.add("Alice it the wonderland");
        books.add("Dialogues of Platon");
        books.add("Philosophy of Java");
        books.add("three guys in the boat");
        System.out.println(books);
        Collections.sort(books);
        System.out.println(books);
        System.out.println("give me new book");
        books.add(scanner.nextLine());
        Collections.sort(books);
        System.out.println(books);

    }


}

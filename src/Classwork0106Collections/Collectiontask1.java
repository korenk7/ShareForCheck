package Classwork0106Collections;

import java.util.*;

public class Collectiontask1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1 работа с коллекциями данных, добавление, изменение данных
        List<String> cars = new ArrayList<>();
        cars.add("VW");
        cars.add("BMW");
        System.out.println("Inicialization");
        System.out.println(cars);
        System.out.println("add in begin of List");
        cars.add(0, "Kia");
        System.out.println(cars);
        System.out.println("show all elements");
        System.out.println(cars);
        System.out.println("delete all elements");
        cars.clear();
        System.out.println(cars);
        cars.add("Mazda");
        cars.add("Lexus");
        cars.add("Subaru");
        System.out.println("show size of list");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println("is list isEmpty");
        System.out.println(cars.isEmpty());
        System.out.println("delete first");
        cars.remove(0);
        System.out.println(cars);
        System.out.println("delete last");
        cars.remove(cars.size() - 1);
        System.out.println(cars);
        cars.add("Skoda");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println("Find index of Ford");
        System.out.println(cars.indexOf("Ford"));
        cars.add("VW");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Lexus");
        cars.add("Subaru");
        cars.add("Skoda");
        cars.add("Ford");
        System.out.println("Find longest string");
        String longest = null;
        int maxlenght = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > maxlenght) {
                maxlenght = cars.get(i).length();
                longest = cars.get(i);
            }
        }
        System.out.println(cars);
        System.out.println("Longest name is " + longest + " contains " + maxlenght + " symbols");
        String shoter = null;
        int minlenght = 1000;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() < minlenght) {
                minlenght = cars.get(i).length();
                shoter = cars.get(i);
            }
        }
        System.out.println(cars);
        System.out.println("Shoter name is " + shoter + " contains " + minlenght + " symbols");
        System.out.println("need to kill FORD");
        cars.remove("Ford");
        System.out.println(cars);
        System.out.println("Ford has been deleted");
        System.out.println(cars);
        cars.add("Ford");
        cars.add(4, "Ford");
        cars.add(6, "Ford");
        System.out.println(cars);
        System.out.println("Kill all Fords");
        for (int i = cars.size() - 1; i >= 0; i--) {
            if (cars.get(i) == "Ford") {
                cars.remove(cars.get(i));
            }

        }
        System.out.println(cars);
        System.out.println("All Fords has been killed");
        System.out.println("change elements");

        for (int i = cars.size() - 1; i >= 0; i--) {
            if (cars.get(i) == "Skoda") {
                cars.set(i, "SKODA");
            }
        }
        System.out.println(cars);
        System.out.println("Is list symmetry");
        List<String> cars1 = new ArrayList<>();
        cars1.add("VW");
        cars1.add("BMW");
        cars1.add("BMW");
        cars1.add("VW");
        System.out.println("test List for summetry");
        System.out.println(cars1);
        int counter = 0;
        int size = cars1.size() - 1;
        for (int i = 0; i < cars1.size() / 2; i++) {
            if (cars1.get(i) == cars1.get(size)) {
                size--;
                counter++;
            } else {
                System.out.println("isn't symmetry");
                break;
            }
            if (counter == cars1.size() / 2) {
                System.out.println("List is symmetry");
            }
        }
        cars.add("SKODA");
        cars.add("SKODA");
        System.out.println(cars);
        System.out.println("how many different");
        int different = cars.size();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 1 + i; j < cars.size(); j++) {
                if (cars.get(i) == cars.get(j)) {
                    different--;
                    break;
                }
            }
        }
        System.out.println("numbers of defferent values is " + different);
        System.out.println("change elements");
        String buff = null;
        for (int i = 0; i < cars.size() / 2; i++) {
            buff = cars.get(i);
            cars.set(i, cars.get(cars.size() - 1 - i));
            cars.set(cars.size() - 1 - i, buff);
        }
        System.out.println(cars);
        Collections.reverse(cars);
        System.out.println(cars);
//
//
        System.out.println("------------------------------------------------------");
//
    }
}

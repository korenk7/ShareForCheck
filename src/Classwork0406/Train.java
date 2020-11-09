package Classwork0406;

import java.util.*;

public class Train {
    private String model;
    private int length;
    private String sound;

    public Train() {
    }

    public Train(String model, int length, String sound) {
        this.model = model;
        this.length = length;
        this.sound = sound;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return length == train.length &&
                Objects.equals(model, train.model) &&
                Objects.equals(sound, train.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, length, sound);
    }

    @Override
    public String toString() {
        return String.format("Model: %s \nLength: %d \nSound: %s \n\n",
                getModel(), getLength(), getSound());
    }

    public static void main(String[] args) {

        LinkedList<Train> trains = new LinkedList<>();

        trains.add(new Train("Big Train", 100, "choo-choo"));
        trains.add(new Train("Medium Train", 50, "choooo"));
        trains.add(new Train("Small Train", 25, "ch"));
        trains.addLast(new Train("Not so small Train", 35, "choo"));
        trains.addFirst(new Train("Not so big Train", 75, "choo-ch"));


        System.out.println("How many trains?");
        System.out.println("Count of trains is " + trains.size());
        System.out.println("Show me all trains");
        System.out.println(trains.toString());
        System.out.println("Remove all trains");
        trains.clear();
        System.out.println("How many trains?");
        System.out.println("Count of trains is " + trains.size());
        System.out.println("trains list is empty? " + trains.isEmpty());

        trains.add(new Train("Big Train", 100, "choo-choo"));
        trains.add(new Train("Small Train", 25, "ch"));
        trains.add(new Train("Medium Train", 50, "choooo"));
        trains.add(new Train("Small Train", 25, "ch"));
        trains.add(new Train("Big Train", 100, "choo-choo"));
        trains.add(new Train("Small Train", 25, "ch"));
        trains.add(new Train("Medium Train", 50, "choooo"));
        trains.add(new Train("Small Train", 25, "ch"));
        trains.addLast(new Train("Not so small Train", 35, "choo"));
        trains.addFirst(new Train("Not so big Train", 75, "choo-ch"));
        trains.removeFirst();
        trains.removeLast();
        System.out.println(trains.contains(new Train("Small Train", 25, "ch")));


        Comparator<Train> sortmodel = (Train o1, Train o2) -> o1.getModel().compareTo(o2.getModel());
        trains.sort(sortmodel);

        System.out.println(trains);
        Comparator<Train> getsmallest = (Train o1, Train o2) -> o1.getLength() - o2.getLength();

        trains.sort(getsmallest);
        System.out.println("smallest is " + trains.getFirst());
        trains.remove(0);
        trains.remove(new Train("Small Train", 25, "ch"));
        System.out.println(trains);
        for (int i = trains.size()-1; i >= 0; i--) {
            if(trains.get(i).getModel() == "Small Train"){
                trains.remove(i);
            }
        }
        System.out.println("must be without small train");
        System.out.println(trains);
        for (int i = trains.size()-1; i >= 0; i--) {
            if(trains.get(i).getModel() == "Big Train"){
                trains.get(i).setModel("changed model of big train");
            }
        }
        System.out.println("changed model of big train");
        System.out.println(trains);
        trains.remove(1);
        trains.add(new Train("Medium Train", 50, "choooo"));
        System.out.println(trains);
        System.out.println("is symmetry trains");
        System.out.println(trains.get(0));
        System.out.println(trains.get(3));

        int counter = 0;
        int size = trains.size() - 1;
        for (int i = 0; i < trains.size() / 2; i++) {
            if (trains.get(i).equals(trains.get(size))) {
                size--;
                counter++;
            } else {
                System.out.println("isn't symmetry");
                break;
            }
            if (counter == trains.size() / 2) {
                System.out.println("List is symmetry");
            }
        }

        System.out.println("how many different");
        int different = trains.size();
        for (int i = 0; i < trains.size(); i++) {
            for (int j = 1 + i; j < trains.size(); j++) {
                if (trains.get(i).equals(trains.get(j))) {
                    different--;
                    break;
                }
            }
        }
        System.out.println("numbers of defferent values is " + different);
        trains.add(new Train("Small Train", 25, "ch"));
        System.out.println(trains);
        System.out.println("Change values");
        Collections.reverse(trains);
        System.out.println(trains);


    }

}

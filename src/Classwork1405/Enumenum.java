package Classwork1405;



enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
}

public class Enumenum {


    public static void main(String[] args) {
//        Person person = new Person();
//        Person.Account account = person.new Account(); //для нестатического внутненнего класса
//        System.out.println(account.toString());
//        Person.Account2 account2 = new Person.Account2(); // для статического внутренннего класса
//        account2.setLongPassword("euf");
//        System.out.println(account2.toString());






        Month[] month = Month.values();
        for (Month m : month) {
            ok(m);
        }

    }

    private static void ok(Month m) {

        switch (m) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.print(1 + m.ordinal());
                System.out.print(" - " + m);
                System.out.println(", Winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.print(1 + m.ordinal());
                System.out.print(" - " + m);
                System.out.println(", Spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.print(1 + m.ordinal());
                System.out.print(" - " + m);
                System.out.println(", Summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.print(1 + m.ordinal());
                System.out.print(" - " + m);
                System.out.println(", Autumn");
                break;


        }

    }

    }





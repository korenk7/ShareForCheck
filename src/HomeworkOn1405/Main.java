package HomeworkOn1405;

import java.util.Scanner;
//g

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        drowing();
    }

    static int chooseFigure() {
        System.out.println("choose figure: press ");
        System.out.println("1 - for Circle");
        System.out.println("2 - for Parallelogram");
        System.out.println("3 - for Triangle");
        System.out.println("4 - for Cube");
        System.out.println("5 - for Pyramida");
        System.out.println("6 - for Exit");
        return scanner.nextInt();
    }

    static void drowing() {
        switch (chooseFigure()) {
            case (1):

                Circle circle = new Circle();
                circle.draw();
                System.out.println("give me radius of cirkle");
                circle.setRadius(scanner.nextInt());
                System.out.println(circle.toString());
                drowing();
                break;

            case (2):
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.draw();
                System.out.println("give me side A");
                parallelogram.setSideA(scanner.nextInt());
                System.out.println("give me side B");
                parallelogram.setSideB(scanner.nextInt());
                System.out.println("give me height");
                parallelogram.setHeight(scanner.nextInt());
                System.out.println(parallelogram.toString());
                drowing();
                break;
            case (3):
                Triangle triangle = new Triangle();
                triangle.draw();
                System.out.println("give me side A");
                triangle.setSideA(scanner.nextInt());
                System.out.println("give me side B");
                triangle.setSideB(scanner.nextInt());
                System.out.println("give me height");
                triangle.setHeight(scanner.nextInt());
                System.out.println(triangle.toString());
                drowing();
                break;
            case (4):
                Cube cube = new Cube();
                cube.draw();
                System.out.println("give me side");
                cube.setSideA(scanner.nextInt());
                System.out.println(cube.toString());
                drowing();
                break;
            case (5):
                Pyramida pyramida = new Pyramida();
                pyramida.draw();
                System.out.println("give me side A");
                pyramida.setSideA(scanner.nextInt());
                System.out.println("give me side B");
                pyramida.setSideB(scanner.nextInt());
                System.out.println("give me height");
                pyramida.setHeight(scanner.nextInt());
                System.out.println(pyramida.toString());
                drowing();
                break;
            case (6):
                System.out.println("Finish the program");
        }

    }


}

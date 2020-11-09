package HomeworkOn1405;

public interface Figure {
    void draw(); // пустой метод для рисования фигуры
    void delete(); // пустой метод для удаления фигуры

    double calculatePerimeter(); // метод для подсчёта периметра потому что периметр есть у любой фигуры

    static final double Pi = 3.141592;
}

interface Figure2D extends Figure {
    double calculateArea();
}
interface Figure3D extends Figure {
    double calculateVolume();
}

class Circle extends FigureImpl implements Figure2D{
    public Circle(){

    }
    public Circle(int radius) {
        super(radius);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("you drawing a cirkle");
    }

    @Override
    public double calculateArea() {
        return Pi * Math.pow(getRadius(),2) ;
    }

    @Override
    public double calculatePerimeter() {
        return getRadius()*2*Pi;
    }

    @Override
    public String toString() {
        String info = String.format("Cirkle {radius: %d, area: %f, perimetr: %f }",getRadius(),calculateArea(),calculatePerimeter());
        return info;
    }
}
class Parallelogram extends FigureImpl implements Figure2D{
    public Parallelogram(){};
    public Parallelogram(int sideA, int sideB,int height) {
        super(sideA, sideB, height);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("you drawing a parallelogramm");
    }

    @Override
    public double calculateArea() {
        return getSideA()*getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return (getSideA()+getSideB())*2;
    }

    @Override
    public String toString() {
        String info = String.format("Parallelogramm {sideA: %d, sideB: %d, height: %d, area: %f perimetr: %f }",getSideA(), getSideB(),getHeight(),calculateArea(),calculatePerimeter());
        return info;
    }
}

class Triangle extends FigureImpl implements Figure2D{
    public Triangle(){

    }

    public Triangle(int sideA, int sideB, int height) {
        super(sideA, sideB, height);
    }

    @Override
    public double calculateArea() {
        return getHeight()*getSideB()*0.5;
    }

    @Override
    public double calculatePerimeter() {
        return getSideA()*2+getSideB();
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("you drawing a triangle");
    }

    @Override
    public String toString() {
        String info = String.format("Triangle {sideA: %d, sideB: %d, height: %d, area: %f perimetr: %f }",getSideA(), getSideB(),getHeight(),calculateArea(),calculatePerimeter());
        return info;
    }
}
class Cube extends FigureImpl implements Figure3D{
    public Cube(){

    }
    public Cube(int sideA) {
        super(sideA);
    }
    @Override
    public double calculateVolume() {
        return Math.pow(getSideA(),3);
    }
    @Override
    public double calculatePerimeter() {
        return getSideA() *4;
    }
    public void draw() {
        super.draw();
        System.out.println("you drawing a cube");
    }

    @Override
    public String toString() {
        String info = String.format("Cube {sideA: %d, sideB: %d, volume: %f perimetr: %f }",getSideA(), getSideA(),calculateVolume(),calculatePerimeter());
        return info;
    }
}
class Pyramida extends FigureImpl implements Figure3D{

    public Pyramida(){
        super();

    }
    public Pyramida(int sideA, int sideB, int height) {
        super(sideA, sideB, height);
    }
    public void draw() {
        super.draw();
        System.out.println("you drawing a pyramida");
    }


    @Override
    public double calculateVolume() {
        return getSideA()*getSideB()*getHeight()/3;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
    @Override
    public String toString() {
        String info = String.format("Pyramida {sideA: %d, sideB: %d, height: %d, volume: %f perimetr: %f }",getSideA(), getSideA(),getHeight(), calculateVolume(),calculatePerimeter());
        return info;
        //g
    }
}



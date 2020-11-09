package HomeworkOn1405;
//g
public abstract class FigureImpl implements Figure {
    private int sideA;
    private int sideB;
    private int radius;
    private int height;

    public FigureImpl(){

    }
    public FigureImpl(int sideA, int sideB, int radius, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.radius = radius;
        this.height = height;
    }

    public FigureImpl(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;

    }

    public FigureImpl(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("You draw a figure");
    }

    public void delete() {
        System.out.println("You delete a figure");
    }

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "FigureImpl{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}

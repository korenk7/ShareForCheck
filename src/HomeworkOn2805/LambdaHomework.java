package HomeworkOn2805;

import java.util.Scanner;

interface Expression {
    float cointIt(float a, float b, float c);
}

interface TestBinaryOperator<T> {
    T apply(T t1, T t2);
}

interface Expression0{
    float coint(float a);
}

public class LambdaHomework {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println("Sredree arifm");
        System.out.println("Give me first");
        float num1 = scanner.nextFloat();
        System.out.println("Give me second");
        float num2 = scanner.nextFloat();
        System.out.println("Give me thirt");
        float num3 = scanner.nextFloat();
        Expression expression = (a, b, c) -> {
            return (a + b + c) / 3;
        };
        System.out.println("average is " + expression.cointIt(num1, num2, num3));
        Expression expression1 = (a, b, c) -> {
            float maxab = Math.max(a, b);
            return Math.max(maxab, c);
        };
        System.out.println("Max of " + num1 + " " + num2 + " " + num3 + " is " + expression1.cointIt(num1, num2, num3));
        Expression expression2 = (a, b, c) -> {
            float minab = Math.min(a, b);
            return Math.min(minab, c);
        };
        System.out.println("Min of " + num1 + " " + num2 + " " + num3 + " is " + expression2.cointIt(num1, num2, num3));

        System.out.println("Task2");
        System.out.println("Give me first float");
        float num1float = scanner.nextFloat();
        System.out.println("Give me second float");
        float num2float = scanner.nextFloat();
        TestBinaryOperator<Float> binaryOperator = (t1, t2) -> {
            return t1 % t2;
        };
        System.out.println("rest of devide " + num1float + " " + num2float + " " + binaryOperator.apply(num1float, num2float));
        TestBinaryOperator<Float> binaryOperator1 = (t1, t2) -> t1 / t2;
        System.out.println("chastnoe of " + num1float + " " + num2float + " " + binaryOperator1.apply(num1float, num2float));
        System.out.println("Give me thitd float");
        float num3float = scanner.nextFloat();
        Expression expression3 = (a, b, c) -> a - b - c;
        System.out.println("raznost of 3 " + num1float + " " + num2float + " "+ num3float + expression3.cointIt(num1float,num2float,num3float));

        System.out.println("Task3");
        System.out.println("Округление дробного числа");
        float newfloat = scanner.nextFloat();
        Expression0 expression0 = a -> {
            return Math.round(a);
        };
        System.out.println("round of "+newfloat+" "+expression0.coint(newfloat));
        Expression0 expression01 = a -> Math.abs(a);
        System.out.println("abs of "+newfloat+" "+expression01.coint(newfloat));
        System.out.println("give me first double for pow");
        double pownum = scanner.nextDouble();
        System.out.println("give me pow");
        double pownum1 = scanner.nextDouble();
        TestBinaryOperator<Double> binaryOperator2 = (t1, t2) -> Math.pow(t1,t2);
        System.out.println(pownum+" in pow "+pownum1+" is "+binaryOperator2.apply(pownum,pownum1));


    }

}

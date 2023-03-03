package PolymorphismOverloading;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("No addition of this method: " + calc.add() );
        System.out.println("Addition of two integer: " + calc.add(4,6) );
        System.out.println("Addition of two double: " + calc.add(6.3,8.7));
        System.out.println("Addition of three integer: " + calc.add(4,10,3));
    }
}

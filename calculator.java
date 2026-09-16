public class Main {
    public static void calculator(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
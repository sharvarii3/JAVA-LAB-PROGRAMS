import java.util.Scanner;

//Name : Sharvari Godbole
//PRN : 23070126117
// Batch : AIML B2

class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);

//running a menu driven program to select operation
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Mean of an Array");
            System.out.println("7. Mode of an Array");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

// using sqitch case to alternate between choices 
            switch (choice) {
                case 1:
                    System.out.println("Sum is: " + calc.calculateSum());
                    break;
                case 2:
                    System.out.println("Difference is: " + calc.calculateDiff());
                    break;
                case 3:
                    System.out.println("Product is: " + calc.calculateMul());
                    break;
                case 4:
                    System.out.println("Quotient is: " + calc.calculateDiv());
                    break;
                case 5:
                    calc.printFibonacciSeries();
                    break;
                case 6:
                    calc.calculateMean();
                    break;
                case 7:
                    calc.calculateMode();
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

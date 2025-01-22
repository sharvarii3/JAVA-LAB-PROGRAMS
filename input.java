import java.util.Scanner;

//function to input 2 number to perform arithmetic operations
class Input {
    public int[] input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number:");
        int firstNumber = scan.nextInt();

        System.out.println("Enter Second number:");
        int secondNumber = scan.nextInt();

        return new int[]{firstNumber, secondNumber};
    }

//user input for fibonacci series
    public int inputSingle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scan.nextInt();
    }

//user input for array operations
    public int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Error: Array size must be greater than 0.");
            return new int[]{}; // Return an empty array for invalid input
        }

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}

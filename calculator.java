class calculator {
    public int calculateSum() {
        int[] numbers;
        Input in = new Input();
        numbers = in.input();
        return numbers[0] + numbers[1];
    }

    public int calculateDiff() {
        int[] numbers;
        Input in = new Input();
        numbers = in.input();
        return numbers[0] - numbers[1];
    }

    public int calculateMul() {
        int[] numbers;
        Input in = new Input();
        numbers = in.input();
        return numbers[0] * numbers[1];
    }

    public int calculateDiv() {
        int[] numbers;
        Input in = new Input();
        numbers = in.input();
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return numbers[0] / numbers[1];
    }

    public void printFibonacciSeries() {
        Input in = new Input();
        int n = in.inputSingle();
        if (n <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        System.out.println("Fibonacci Series up to " + n + " terms:");
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public void calculateMean() {
        Input in = new Input();
        int[] array = in.inputArray();
        if (array.length == 0) return;

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = (double) sum / array.length;
        System.out.println("Mean of the array is: " + mean);
    }

    public void calculateMode() {
        Input in = new Input();
        int[] array = in.inputArray();
        if (array.length == 0) return;

        int mode = array[0];
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }

        System.out.println("Mode of the array is: " + mode);
    }
}

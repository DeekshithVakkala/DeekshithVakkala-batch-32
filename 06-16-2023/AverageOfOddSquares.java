public class AverageOfOddSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = calculateAverageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfOddSquares(int[] numbers) {
        int count = 0;
        int sumOfSquares = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                int square = num * num;
                sumOfSquares += square;
                count++;
            }
        }

        if (count > 0) {
            return (double) sumOfSquares / count;
        } else {
            return 0; // Return 0 if there are no odd numbers in the array
        }
    }
}

class MinMax {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 1, 7};

        int min = array[0];
        int max = array[0];
        int i;
        for (i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
class Fibonacci {

    public static void main(String args[]) {

        int N = 10;
        int f = 0, s = 1, t, i;
        System.out.print(f+" "+ s);

        for (i = 2; i < N; i++) {
            t = f + s;
            System.out.print(" "+t);
            f = s;
            s = t;

        }
    }
}
public class Reversal{

    public static void main(String[] args){

        int a=123456, reversed =0;
        while(a!=0){

          int  reminder = a%10;

            reversed = reversed * 10 + reminder;
            a=a/10;

        }

        System.out.println("reversal number" + reversed);
    }
}


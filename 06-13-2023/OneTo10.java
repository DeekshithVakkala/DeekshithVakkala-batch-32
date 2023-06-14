 class OneTo10 implements Runnable {

    public void run(){
        for(int i =1; i<=10; i++){
            System.out.println(i);
        }
    }

     public static void main(String[] args) {
         OneTo10 a = new OneTo10();
         Thread b = new Thread(a);
         b.start();
     }
}
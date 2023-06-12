class Vowels {
    public static void main(String[] args)
    {
        int count=0;
        String str= "India";
        count= str.replaceAll("[^AEIOUaeiou]", "").length();

        System.out.println("vovels: " + count);
    }
}
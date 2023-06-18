public class StringVowels {
    public static void main(String[] args) {
        String[] strings = {"Java", "DotNet", "DataEngineering", "Devops", "Salesforse"};
        printStringVowels(strings);
    }

    public static void printStringVowels(String[] strings) {
        for (String str : strings) {
            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            if (vowelCount > 0) {
                System.out.println("String: " + str + " | Vowel Count: " + vowelCount);
            }
        }
    }
}

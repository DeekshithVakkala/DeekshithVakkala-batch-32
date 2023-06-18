import java.util.Arrays;

public class CapitalizationString {
    public static void main(String[] args) {
        String[] strings = {"India", "Telangana", "Warangal"};
        CapitalizationString(strings);
    }

    public static void CapitalizationString(String[] strings) {
        // Capitalize the first letter of each string
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.length() > 0) {
                char firstChar = Character.toUpperCase(str.charAt(0));
                strings[i] = firstChar + str.substring(1);
            }
        }

        // Sort the strings in alphabetical order
        Arrays.sort(strings);

        // Print the sorted strings
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

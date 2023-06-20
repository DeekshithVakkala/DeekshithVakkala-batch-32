import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Google");
        stringList.add("Microsoft");

        // Converting ArrayList to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Printing the Array
        System.out.println("Array: " + Arrays.toString(stringArray));
    }
}

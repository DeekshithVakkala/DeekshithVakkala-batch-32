import java.util.ArrayList;
import java.util.List;

public class RemoveLastObject {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Sita");
        stringList.add("Lakshman");

        System.out.println("Original List: " + stringList);

        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
        }

        System.out.println("Updated List: " + stringList);
    }
}
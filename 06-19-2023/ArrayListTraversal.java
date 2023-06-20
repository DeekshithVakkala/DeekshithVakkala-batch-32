import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayListTraversal {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Sita");

        System.out.println("for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println();

        System.out.println("enhanced for loop:");
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("forEach:");
        stringList.forEach(System.out::println);
        System.out.println();

        System.out.println("parallel stream:");
        stringList.parallelStream()
                .forEachOrdered(System.out::println);
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SortedNames {
    public static void main(String[] args) {
        List<String> reversed =
                Arrays.asList("Roman", "Olha", "Ivan", "John", "Jack", "Kate", "Nataly", "Zyzo", "Alan")
                        .stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(reversed);
    }
}
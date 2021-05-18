import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNames {
    private static List<IndexNames> names = Arrays.asList(new IndexNames(1, "Roman"),
            new IndexNames(2, "Olha"), new IndexNames(3, "Ivan"),
            new IndexNames(4, "John"), new IndexNames(5, "Jack"),
            new IndexNames(6, "Kate"), new IndexNames(7, "Nataly"));

    public static void main(String[] args) {
        String filtered = names.stream()
                .filter(name -> name.getIndex()% 2 != 0)
                .map(IndexNames::toString)
                .collect(Collectors.joining(", "));
        System.out.println(filtered);
    }
}
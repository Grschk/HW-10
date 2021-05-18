import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList(new String[]{"1, 2, 0", "4, 5"});
        String sorted = arrayList.stream()
                .flatMap((number) -> Arrays.stream(number.split(", ")))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(", "));
        System.out.println(sorted);

    }
}
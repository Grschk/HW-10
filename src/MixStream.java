import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStream {
    public static <A> Stream<A> zip(Stream<A> first, Stream<A> second) {
        Iterator<A> firstIterator = first.iterator();
        Iterator<A> secondIterator = second.iterator();
        Stream<A> mixingStream = Stream.empty();
        while (firstIterator.hasNext() & ((Iterator<?>) secondIterator).hasNext()){
            mixingStream = Stream.concat(mixingStream, Stream.of(firstIterator.next(),
                    secondIterator.next()));
        }
        return mixingStream;
    }
    public static void main(String[] args) {
        System.out.println(MixStream.zip(Arrays.stream(new String[]{"1", "2" ,"3", "4", "5"}),
                Arrays.stream(new String[]{"ONE", "TWO", "THREE", "FOUR", "FIVE"}))
                .collect(Collectors.joining(" ")));
    }
}
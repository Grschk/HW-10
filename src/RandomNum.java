import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNum {
    public static void main(String[] args) {
        long a = 25214903917l;
        long c = 11l;
        long m = (long) Math.pow(2.0, 48);
        long seed = 1l;
        RandomNum randomNum = new RandomNum();
        System.out.println(randomNum.generateStream(a, c, m, seed).collect(Collectors.toList()));
    }

    public Stream<Long> generateStream(long a,long c, long m, long seed){
        return Stream.iterate(seed, n -> (a * n + c) % m).limit(5);
    }
}
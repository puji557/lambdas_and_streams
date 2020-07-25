import java.util.stream.Stream;
 
public class example2 {
 
    public static void main(String[] args)
    {
        Stream<String> sample = Stream.of("bat", "buy", "bring", "brought");
        sample.filter(s -> s.startsWith("b") && s.length()==3)
        .forEach(System.out::println);
    }
} 
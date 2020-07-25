import java.util.*;
import java.util.stream.IntStream;
 
public class example1 {
 
    public static void main(String[] args)
    {
        IntStream sample = IntStream.of(2, 3, 4, 5, 6, 7, 8,10);  
        OptionalDouble object = sample.average();
        if (object.isPresent()) {
            System.out.println(object.getAsDouble());
        }
        else {
            System.out.println("-1");
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

//        List number = Arrays.asList(2,3,4,5);
//        List square = number.stream().map(x -> x * x).collect(Collectors.toList());


        List names = Arrays.asList("Sahal", "Arham", "Qadeer", "Saib");
        List result = (List) names
                .stream()
                .filter(s -> s.toString()
                        .startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(result);



















        List names1 = Arrays.asList("Qadeer", "Arham", "Sahal");
        List sorted = (List) names1.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);

        List num = Arrays.asList(1,2,3);
        List result2 = num.stream().map(x -> x.vl*x).collect(Collectors.toList());


    }
}

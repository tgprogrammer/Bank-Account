package gross_calculator;

import java.util.Arrays;
import java.util.List;

public class FunctionInterface {
    public static void main(String[] args) {
        int[] numbers = {2, 4 , 6, 8};

//        Arrays.stream(numbers).parallel().forEach(n -> System.out.println(n + 1 + " "));
            int result = Arrays.stream(numbers).reduce(0,(a,b) -> (a+b));
        System.out.println(result);
        List<String>  streamList = List.of("Tania",
                "Banana" ,
                "Hello World" ,
                "Job" ,
                "Salary" ,
                "me");

        //streams are performing the operations until stream returns something
        //so computing multiple logics is possible
//        streamList.stream().filter(c -> c.equals("Tania")).forEach(System.out::println);

        String resultedString = streamList.stream().sorted().reduce("", (a, b) ->  (a + " | " + b));
//        System.out.println(resultedString);
    }
}

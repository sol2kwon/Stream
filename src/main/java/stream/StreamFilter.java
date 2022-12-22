package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
//
//        Stream<Integer> numberStream = Stream.of(3,-5,7,10,-3);
//        Stream<Integer> fiteredNumberStream = numberStream.filter(x -> x > 0 );
//        List<Integer> filteredNumbers = fiteredNumberStream.collect(Collectors.toList());
//        System.out.println(filteredNumbers);

// 주석처리한 과정을 한번에 처리한다.
        List<Integer> newFilteredNumbers = Stream.of(3,-5,7,10,-3)
                .filter(x-> x > 0).collect(Collectors.toList());
        System.out.println(newFilteredNumbers);

    }
}

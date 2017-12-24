package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Traning4_62_65 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        List<String> words =Arrays.asList("a1", "z13", "c54", "a2", "a33", "d66", "zzzz");

        System.out.println("----- 4.62 ----");
        traning4_62(words);

        System.out.println("");
        System.out.println("----- 4.63 ----");
        traning4_63(words);

        System.out.println("");
        System.out.println("----- 4.64 ----");
        traning4_64(words);

        System.out.println("");
        System.out.println("----- 4.65 ----");
        traning4_65(words);


    }

    public static void traning4_62(List<String> words) {
        Map<String, List<String>> result =
                words.stream().
                collect(Collectors.groupingBy(w -> w.substring(0, 1)));

        result.entrySet().stream().forEach(System.out::println);
    }

    public static void traning4_63(List<String> words) {
        Map<String, Long> result =
                words.stream().
                collect(Collectors.groupingBy(w -> w.substring(0, 1), Collectors.counting()));

        result.entrySet().stream().forEach(System.out::println);
    }

    public static void traning4_64(List<String> words) {
        Map<String, Long> result =
                words.stream().
                collect(Collectors.groupingBy(w -> w.substring(0, 1), () -> new TreeMap<>(),
                Collectors.counting()));

        result.entrySet().stream().forEach(System.out::println);
    }

    public static void traning4_65(List<String> words) {
        Map<Boolean, List<String>> result =
                words.stream().
                collect(Collectors.partitioningBy(w -> w.length() > 2));

        result.entrySet().stream().forEach(System.out::println);
    }


}

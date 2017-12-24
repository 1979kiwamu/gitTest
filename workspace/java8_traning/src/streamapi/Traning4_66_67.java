package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Traning4_66_67 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // TODO 自動生成されたメソッド・スタブ
        List<String> words =Arrays.asList("a1", "z13", "c54", "a2", "a33", "d66", "zzzz");

        System.out.println("----- 4.66 ----");
        traning4_66(words);

        System.out.println("");
        System.out.println("----- 4.67 ----");
        traning4_67(words);


    }

    public static void traning4_66(List<String> words) {
        Map<String, String> result = words.stream().collect(Collectors.toMap(w -> w, w -> w));

        result.entrySet().stream().forEach(System.out::println);

    }

    public static void traning4_67(List<String> words) {
        Map<String, List<String>> result =
                words.stream().collect(Collectors.toMap(w -> w.substring(0, 1),
                        w -> {
                            List<String> list = new ArrayList<>();
                            list.add(w);
                            return list;
                        },
                        (u, v) -> {
                            u.addAll(v);
                            return u;
                        }));

        result.entrySet().stream().forEach(System.out::println);

    }

}

package streamapi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Traning4_52 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String result = IntStream.range(0, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);

    }

}

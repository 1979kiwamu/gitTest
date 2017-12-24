package streamapi;

import java.util.Arrays;
import java.util.List;

public class StartSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        List<String> list = Arrays.asList("abc", "def", "ghi");
        list.stream().forEach(data -> System.out.println(data));

    }

}

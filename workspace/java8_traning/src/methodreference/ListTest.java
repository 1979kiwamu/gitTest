package methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        List<String> data = Arrays.asList("a", "b", "c");
        List<String> after = new ArrayList<>();

        data.forEach(item -> after.add(item));

        after.forEach(item -> System.out.println(item));

    }

}

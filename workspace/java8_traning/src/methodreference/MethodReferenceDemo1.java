package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo1 {

    // public static void print(String text) {
    // System.out.println(text);
    // }

    public static void printAll(List<String> texts) {
        texts.forEach(System.out::println);
    }


    public static void main(String[] args) {
        // // TODO 自動生成されたメソッド・スタブ
        // Consumer<String> consumer1 = text ->
        // MethodReferenceDemo1.print(text);
        // consumer1.accept("Hello, World!");

        List<String> texts = Arrays.asList("data1", "data2", "data3");
        Consumer<List<String>> consumer2 = data -> MethodReferenceDemo1.printAll(data);
        consumer2.accept(texts);

    }

}

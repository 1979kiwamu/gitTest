package streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSearch {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ

        Path path = Paths.get("C:\\Users\\kiwamu\\workspace");
        Files.find(path,
                10,
                (pathName, attr) -> pathName.toString().endsWith(".java"))
        .forEach(System.out::println);

    }

}

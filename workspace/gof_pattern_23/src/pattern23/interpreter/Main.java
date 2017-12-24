package pattern23.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("program.txt"), StandardCharsets.UTF_8)) {
            reader.lines().forEach(line -> {
                System.out.println("text = \"" + line + "\"");
                Node node = new ProgramNode();
                try {
                    node.parse(new Context(line));
                } catch (ParseException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
                System.out.println("node = " + node);
            });

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

}

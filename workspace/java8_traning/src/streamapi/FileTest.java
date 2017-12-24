package streamapi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest {

    public static void main(String[] args) {
        lesson2();

    }

    public static void lesson1() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kiwamu\\Documents\\README.md"))) {
            reader.lines().forEach(System.out::println);

        } catch (FileNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

    }


    public static void lesson2() {
        Path path = Paths.get("C:\\Users\\kiwamu\\Documents\\README.md");
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

    }

}

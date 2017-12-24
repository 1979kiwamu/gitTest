package pattern20.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class BigChar {

    private char charname;
    private String fontdata;


    public BigChar(char charname) {
        this.charname = charname;

        try (BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));) {
            Stream<String> stream = reader.lines();
            StringBuilder build = new StringBuilder();

            stream.forEach(line -> {
                build.append(line);
                build.append("\n");
            });

            this.fontdata = build.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}

package pattern8.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
            String filename = title + ".html";
        try (Writer writer = new FileWriter(filename)) {
            writer.write(this.makeHTML());;
            System.out.println(filename + "を作成しました。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}

package pattern07.builder;

import java.io.*;
import java.util.Arrays;

public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filename));

        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");

    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");

    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        Arrays.asList(items).stream().forEach(data -> writer.println("<li>" + data + "</li>"));
        writer.println("</ul>");

    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }

}

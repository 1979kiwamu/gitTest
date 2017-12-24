package pattern12.decorator.tranning;

import pattern12.decorator.Display;
import pattern12.decorator.FullBorder;
import pattern12.decorator.SideBorder;

public class Main2 {

    public static void main(String[] args) {

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("good morning");
        md.add("hello");
        md.add("good night");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }

}

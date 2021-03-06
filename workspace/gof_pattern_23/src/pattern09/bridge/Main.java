package pattern09.bridge;

public class Main {

    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        CountDisplay d4 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d4.display();
        d4.multiDisplay(3);

    }

}

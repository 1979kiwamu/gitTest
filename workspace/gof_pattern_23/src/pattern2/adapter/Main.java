package pattern2.adapter;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        AbstractPrint p2 = new PrintBannerEx("Hello2");
        p2.printWeak();
        p2.printStrong();
    }

}

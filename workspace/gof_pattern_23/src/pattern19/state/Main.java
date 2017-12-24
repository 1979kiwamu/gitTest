package pattern19.state;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");

        while(true) {
            IntStream.range(0, 24).forEach(h -> {
                frame.setClock(h);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            });
        }
    }

}

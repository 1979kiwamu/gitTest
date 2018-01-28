package pattern05.singleton;

import java.util.stream.IntStream;

public class MainTranning1 {

    public static void main(String[] args) {

        IntStream.range(0, 10).parallel().forEach(i -> {
            TicketMaker maker = TicketMaker.getInstance();
            maker.getNextTicketNumber();
        });

    }

}

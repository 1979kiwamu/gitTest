package pattern05.singleton;

import java.util.stream.IntStream;

public class MainTranning2 {

    public static void main(String[] args) {

        IntStream.range(5, 10).parallel().forEach( i -> {
            int callIndex = i % 3;
            Triple.getInstance(callIndex);
        });

    }

}

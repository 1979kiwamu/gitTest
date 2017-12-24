package pattern20.flyweight;

import java.util.stream.IntStream;

public class BigString {

    private BigChar[] bigchars;

    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();


        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        IntStream.range(0, bigchars.length).forEach(i -> {
            bigchars[i].print();
        });
    }
}

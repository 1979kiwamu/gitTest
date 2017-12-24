package methodreference;

import java.util.function.Consumer;

public class EnvelopeTest {

    public static void main(String args[]) {
        Envelope<String> container = Envelope.create("Hello, World!");
        container.print(contents -> System.out.println(contents.toString()));;
    }

    static class Envelope<T> {
        private T contents;

        private Envelope(T contents) {
            this.contents = contents;
        }

        public static <S> Envelope<S> create(S contents) {
            return new Envelope<S>(contents);
        }

        public void print(Consumer<T> consumer) {
            consumer.accept(contents);
        }
    }
}

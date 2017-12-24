package chapter3.list3_5;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {

    R apply(S s, T t, U u);

}

package pattern05.singleton;

import java.util.Arrays;
import java.util.List;

public class Triple {
    private int id;
    private static List<Triple> instance = Arrays.asList(new Triple(0), new Triple(1), new Triple(2));

    private Triple() {
        //コンストラクタ使用不可
    }

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int index) {
        Triple triple = instance.get(index);
        System.out.println("ID番号<" + triple.id + ">を発行しました");
        return triple;
    }

}

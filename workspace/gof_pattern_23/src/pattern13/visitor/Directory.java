package pattern13.visitor;

import java.util.ArrayList;
import java.util.Iterator;


public class Directory extends Entry {

    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);

    }

    @Override
    public String getName() {
        // TODO 自動生成されたメソッド・スタブ
        return name;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    @Override
    public int getSize() {

        int size = 0;

        for (Entry entry : dir) {
            size += entry.getSize();
        }

        return size;
    }

}

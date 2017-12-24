package pattern13.visitor;

public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
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

    @Override
    public int getSize() {
        // TODO 自動生成されたメソッド・スタブ
        return size;
    }

}

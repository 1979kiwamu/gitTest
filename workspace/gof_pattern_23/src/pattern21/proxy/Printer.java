package pattern21.proxy;

import java.util.stream.IntStream;

public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("Printerのインスタンスを生成中");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printerのインスタンス(" + name + ")を生成中");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;

    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);

        IntStream.range(0, 5).forEach(i -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        });

        System.out.println("完了。");

    }
}

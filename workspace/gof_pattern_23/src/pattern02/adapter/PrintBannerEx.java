package pattern02.adapter;

public class PrintBannerEx extends AbstractPrint {

    private Banner banner;

    public PrintBannerEx(String string) {
        this.banner = new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}

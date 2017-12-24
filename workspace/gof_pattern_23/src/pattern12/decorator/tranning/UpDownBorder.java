package pattern12.decorator.tranning;

import pattern12.decorator.Border;
import pattern12.decorator.Display;

public class UpDownBorder extends Border {

private char borderChar;
    public UpDownBorder(Display display) {
        super(display);
    }

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(display.getColumns());
        } else if (row == display.getRows() +1) {
            return makeLine(display.getColumns());
        } else {
            return display.getRowText(row -1);
        }
    }

    private String makeLine(int count) {
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < count ; i++) {
            buf.append(borderChar);
        }
        return buf.toString();
    }

}

package pattern12.decorator.tranning;

import java.util.ArrayList;
import java.util.List;

import pattern12.decorator.Display;

public class MultiStringDisplay extends Display {

    private List<String> dispList = new ArrayList<String>();
    private int maxColumns = 0;

    public void add(String disp) {
        dispList.add(disp);

        if (maxColumns < disp.getBytes().length) {
            maxColumns = disp.getBytes().length;
        }
    }

    @Override
    public int getColumns() {
        return maxColumns;
    }

    @Override
    public int getRows() {
        return dispList.size();
    }

    @Override
    public String getRowText(int row) {
        StringBuilder build = new StringBuilder();

        String text =dispList.get(row);
        build.append(text);

        if (text.getBytes().length != maxColumns) {
            int count = maxColumns - text.getBytes().length;

            for (int i = 0; i < count; i++) {
                build.append(' ');
            }
        }

        return build.toString();
    }

}

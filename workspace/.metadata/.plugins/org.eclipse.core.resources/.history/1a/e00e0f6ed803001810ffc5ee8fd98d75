package pattern8.abstractfactory.tablefactory;

import pattern8.abstractfactory.factory.Factory;
import pattern8.abstractfactory.factory.Link;
import pattern8.abstractfactory.factory.Page;
import pattern8.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

}

package pattern08.abstractfactory.listfactory;

import pattern08.abstractfactory.factory.Factory;
import pattern08.abstractfactory.factory.Link;
import pattern08.abstractfactory.factory.Page;
import pattern08.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}

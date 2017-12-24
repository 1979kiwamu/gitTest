package pattern8.abstractfactory.listfactory;

import pattern8.abstractfactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");

        content.forEach(item -> buffer.append(item.makeHTML()));

        buffer.append("</ul>\n");
        buffer.append("<hr><addressL>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }

}

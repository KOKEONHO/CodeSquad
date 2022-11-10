package precourse.week_02.mission01.Question02;

public class Book implements Cloneable {

    private String name;
    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void renameBook(String string) {
        name = string;
    }

    public void renameAuthor(String string) {
        author = string;
    }

    public String showBookInfo() {
        return "[" + name + "|" + author + "]";
    }

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

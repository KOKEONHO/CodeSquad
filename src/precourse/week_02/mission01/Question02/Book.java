package precourse.week_02.mission01.Question02;

public class Book {

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
}

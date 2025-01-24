package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    // 기본생성자
    /*
    생성자가 있으므로 자바는 기본생성자를 만들어주지 않음
     */
    public Book() {
        this("", "", 0);
    }

    // title과 author만을 매개변수로 받는 생성자
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
    }
}

package jarai.patterns.gof.structural.decorator;


public class Book {

    public String author;
    public String title;

    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void Show() {
        System.out.println("\nBook ------ ");
        System.out.println(" Author: " + author);
        System.out.println(" Title:  " + title);
    }
}

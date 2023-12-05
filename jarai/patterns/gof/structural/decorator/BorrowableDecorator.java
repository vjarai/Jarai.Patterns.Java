package jarai.patterns.gof.structural.decorator;


import java.util.ArrayList;

/// <summary>
/// Verleiht einem item die Fähigkeit ausgeliehen zu werden.
/// </summary>
public class BorrowableDecorator extends Book {
    private final Book book;
    private final ArrayList<String> _borrowers = new ArrayList<>();


    public BorrowableDecorator(Book book) {
        this.book = book;
    }

    public void BorrowItem(String name) {
        _borrowers.add(name);
    }

    public void ReturnItem(String name) {
        _borrowers.remove(name);
    }

    public void Show() {
        book.Show();

        for (var borrower : _borrowers)
            System.out.printf(" borrower: " + borrower);
    }
}

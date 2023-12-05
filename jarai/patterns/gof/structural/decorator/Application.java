package jarai.patterns.gof.structural.decorator;


public class Application {

    public static void main(String[] args) {

        var buch = new Book("Rowling", "Harry Potter");

        var ausleihbaresBuch = new BorrowableDecorator(buch);
        ausleihbaresBuch.BorrowItem("Fritz");
        ausleihbaresBuch.Show();

    }
}

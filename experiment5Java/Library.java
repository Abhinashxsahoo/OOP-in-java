public class Library {
    public static void main(String[] args) {
        // Example usage
        Book book = new Book("1984", "George Orwell", "1234567890");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);
        Journal journal = new Journal("Nature", "Nature Publishing Group", 2025, 2);

        book.checkOut();
        dvd.checkOut();
        journal.checkOut();

        book.returnItem();
        dvd.returnItem();
        journal.returnItem();
    }
}

abstract class LibraryItem {
    private String title;
    private boolean isCheckedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
}

class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class DVD extends LibraryItem {
    private String director;
    private int duration; // duration in minutes

    public DVD(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
}

class Journal extends LibraryItem {
    private String publisher;
    private int year;
    private int issueNumber;

    public Journal(String title, String publisher, int year, int issueNumber) {
        super(title);
        this.publisher = publisher;
        this.year = year;
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
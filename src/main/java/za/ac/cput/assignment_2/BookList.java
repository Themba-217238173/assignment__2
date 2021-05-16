package za.ac.cput.assignment_2;

//*  Author
//   Name         : Themba Khanyile
//   StudentNumber:217238173

public class BookList extends  CollectionModel
{
    String bookTitle;
    int    bookNumber;

    public BookList(String bookTitle, int bookNumber) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    public static void add(BookList l) {
    }

    public static void put(BookList l) {
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookNumber=" + bookNumber +
                '}';
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }


}

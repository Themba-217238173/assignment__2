package za.ac.cput.assignment_2;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookListTestTest
{
    //BookList list = new BookList();
    List<BookList> book = new ArrayList<>();


    @Test
    public void testAdd()
    {
        for (int a = 0; a < 1;a++)
        {
            String bookTitle = "Shakespear";
            int bookNumber = a;
            BookList Shakespear = new BookList(bookTitle,bookNumber);
            book.add(Shakespear);

        }
        assertEquals(1 ,book.size());
        System.out.println(book.toString());
        }



    @Test
    public void testRemove()

    {
        for (int i = 0 ; i< 1 ; i++)
        {
            String bookTitle = "NetworkingBook";
            int bookNumber = i;
            BookList NetworkingBook =    new BookList(bookTitle,i);
            book.add(NetworkingBook);
            book.remove(NetworkingBook);
        }

        Assertions.assertEquals(0 ,book.size());
        System.out.println("Updated BookList: "+book.toString());

    }
    @Test
    public void testSearch() {

        BookList researchBook;
        {
            String bookTitle = "researchBook";
            int bookNumber = 1;
            researchBook = new BookList(bookTitle, bookNumber);
            book.add(researchBook);

        }
        assertTrue(book.contains(researchBook));
        System.out.println("Book found : " + book.contains(researchBook));
    }


}

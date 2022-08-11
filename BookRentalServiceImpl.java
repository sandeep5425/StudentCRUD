public class BookRentalServiceImpl implements BookRentalService {

    static BookRental[] bookRentalArray = new BookRental[2];
    static int i = 0;

    @Override
    public void createBookRental(BookRental rental) {
        bookRentalArray[i++] = rental;
    }

    @Override
    public BookRental[] getRental() {
        return bookRentalArray;
    }

    @Override
    public BookRental updateBookRental(BookRental bookRental) {
        for (int i = 0; i < 2; i++) {
            if (bookRentalArray[i].getBookId() == bookRental.getBookId()) {
                bookRentalArray[i] = bookRental;
                return bookRentalArray[i];
            }
        }
        return null;
    }

    @Override
    public void deleteBookRental(int rentalId) {
        for (int i = 0; i < 2; i++) {
            if (bookRentalArray[i].getrentalId() == rentalId) {
                bookRentalArray[i] = null;
            }
        }
    }

    @Override
    public BookRental[] searchByCustomerId(int userId) {
        BookRental[] temp = new BookRental[2];
        int i = 0;
        for (BookRental br : bookRentalArray) {
            if (br.getUserId() == userId) {
                temp[i++] = br;
            }
        }
        return temp;
    }

    @Override
    public BookRental[] searchByBookId(int bookId) {
        BookRental[] temp = new BookRental[2];
        int i = 0;
        for (BookRental br : bookRentalArray) {
            if (br.getBookId() == bookId) {
                temp[i++] = br;
            }
        }
        return temp;
    }
}

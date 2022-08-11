public interface BookRentalService {
    void createBookRental(BookRental rental);
    BookRental updateBookRental(BookRental bookRental);
    void deleteBookRental(int rentalId);
    BookRental[] searchByCustomerId(int userId);
    BookRental[] searchByBookId(int bookId);
    BookRental[] getRental();
}

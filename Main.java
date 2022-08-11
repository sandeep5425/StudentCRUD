import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book b= new Book();
        //Read values for BOOK
        b.setBookId(2343);
        b.setTitle("title");
        b.setDescription("description");
        b.setAuthor("Ddsf");
        b.setAvailableQuantity(4);
        b.setTotalQuantity(7);
        b.setPrice(345);
        b.setRentPerDay(345);

        
        Customer c = new Customer();
        //Read values for Customer
        c.setUserId(101);
        c.setEmailId("email");
        c.setPassword("sfg");
        c.setFirstName("dfg");
        c.setCity("city");
        c.setGender("gender");
        c.setPhoneNo("345");
        c.setLastName("dfg");

        Address a = new Address();
        //Read Address details of Customer
        a.setCity("e");
        a.setState("hj");
        a.setZip(3434);
        a.setCountry("gm");
        c.setAddress(a);




        BookRental bookRental = new BookRental();
        //Read book Rental details
        bookRental.setBookId(b.getBookId());
        bookRental.setrentalId(201);
        bookRental.setUserId(c.getUserId());
        bookRental.setQuantity(4);
        bookRental.setStartDate(new Date(1));
        bookRental.setEndDate(new Date(2));
        bookRental.setTotalAmount(200);
        bookRental.setReturnedDate(new Date(4));

        //operations on book rental service
        BookRentalService bookRentalService  = new BookRentalServiceImpl();
        bookRentalService.createBookRental(bookRental);
        bookRentalService.deleteBookRental(101);
        bookRentalService.searchByBookId(201);
        bookRentalService.searchByCustomerId(101);
        bookRentalService.getRental();

        BookRental bookRentalUpdate = new BookRental();
        bookRental.setBookId(b.getBookId());
        bookRental.setrentalId(201);
        bookRental.setUserId(c.getUserId());
        bookRental.setQuantity(4);
        bookRental.setStartDate(new Date(1));
        bookRental.setEndDate(new Date(2));
        bookRental.setTotalAmount(200);
        bookRental.setReturnedDate(new Date(4));

        bookRentalService.updateBookRental(bookRentalUpdate);

        
    }   
}
import java.util.*;;

public class BookRental {
    private int rentalId;
    private int bookId;
    private int userId;
    private int quantity;
    private Date startDate;
    private Date endDate;
    private double totalAmount;
    private Date returnedDate;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setrentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getrentalId() {
        return rentalId;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getUserId() {
        return userId;
    }

}

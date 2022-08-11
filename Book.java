public class Book {
    private int bookId;
    private String title;
    private String description;
    private String author;
    private int availableQuantity;
    private int totalQuantity;
    private double price;
    private double rentPerDay;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }
}

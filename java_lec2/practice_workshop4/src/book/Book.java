package book;

public class Book {
    String bookName;
    int bookPrice;
    double bookDiscountRate;
    
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
	public double getDiscountBookPrice() {
		return bookPrice-((bookPrice*bookDiscountRate)/100);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
	
	
	
}

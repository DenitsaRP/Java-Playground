package softuni.oop.book;

public class GoldenEditionBook extends Book{

	public GoldenEditionBook(String author, String title, double price) throws Exception {
		super(author, title, price);
	}

	@Override
	protected double getPrice() {
		return super.getPrice() + super.getPrice()*0.3;
	}

	
	
	


}
package classes;

public class Movie {
	private String title;
	private Price price;

	public Movie(String newtitle, Price newPrice) {
		title = newtitle;
		price = newPrice;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price newPrice) {
		price = newPrice;
	}

	public String getTitle() {
		return title;
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
}
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
		double charge = 0;
		switch (price) {
		case REGULAR:
			charge += 2;
			if (daysRented > 2)
				charge += (daysRented - 2) * 1.5;
			break;
		case NEW_RELEASE:
			charge += daysRented * 3;
			break;
		case CHILDREN:
			charge += 1.5;
			if (daysRented > 3)
				charge += (daysRented - 3) * 1.5;
			break;
		}
		return charge;
	}
}
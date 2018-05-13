package classes;

public enum Price {
	REGULAR(0), CHILDREN(1), NEW_RELEASE(2);
	private int priceCode;

	Price(int priceCode) {
		this.priceCode = priceCode;
	}

	public int price() {
		return priceCode;
	}

	public double getCharge(int daysRented) {
		double charge = 0;
		switch (this) {
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

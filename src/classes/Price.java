package classes;

public enum Price {
	REGULAR(0),CHILDREN(1),NEW_RELEASE(2);
	private int priceCode;
	
	Price(int priceCode){
		this.priceCode = priceCode;
	}
	
	public int price(){
		return priceCode;
	}
}

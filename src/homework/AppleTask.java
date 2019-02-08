package homework;

public class AppleTask {
	public static void main(String[] args) {
	    int priceForKG = 300 ;
		int appleWeight = 5;
		int price = priceForKG * appleWeight;
		 
		if (price > 500) {
			int discountPercent = price > 1000 ? 75 : 85;
			price = discountPercent * price  / 100;
		} 
		System.out.println(price);
	}
}

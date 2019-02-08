package homework;

public class Cat {
	public double originWeight;
	public double weight;
	public double minWeight;
	public double maxWeight;
	
	Cat(){
		weight = Math.random() * (5000 - 1500) + 1500;
		originWeight = weight;
		minWeight = 1000;
		maxWeight = 9000;
	}
	
	public void food(double amount) {
		weight += amount;
	}
	public void drink(double amount) {
		weight += amount;
	}
	public void meaw() {
		weight -= 10;
		System.out.println("Мяу");
	}
	
	String getStatus() {
		if (weight < minWeight) {
			return "Dead";
		}
		else if (weight > maxWeight) {
			return "Blowed";
		}
		else if (weight > originWeight) {
			return "sleeping";
		}
		else {
			return "Playing";
		}
	}
	
}
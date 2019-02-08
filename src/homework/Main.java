package homework;

public class Main  {

	public static void main(String[] args) {
		Cat barsik = new Cat();
	    barsik.food(1000);
		barsik.drink(600);
		barsik.meaw();
		barsik.getStatus();
		System.out.println("Barsik - "+barsik.getStatus());

		Cat alex = new Cat();
		alex.food(1100);
		alex.drink(400);
		alex.meaw();
		alex.getStatus();
		System.out.println("Alex - "+alex.getStatus());

		Cat felix = new Cat();
		felix.food(3100);
		felix.drink(400);
		felix.meaw();
		felix.getStatus();
		System.out.println("Felix - "+felix.getStatus());

		Cat murka = new Cat();
		murka.food(2100);
		murka.drink(400);
		murka.meaw();
		murka.getStatus();
		System.out.println("Murka - "+murka.getStatus());

		Cat kay = new Cat();
		kay.food(1200);
		kay.drink(400);
		kay.meaw();
		kay.getStatus();
		System.out.println("May - "+kay.getStatus());
		
	}

}

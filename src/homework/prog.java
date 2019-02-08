package homework;

public class prog {

	public static void main(String[] args) {
		
		int r1 = (int)(Math.random() * (10-1)+1);
		int r2 = (int)(Math.random() * (10-1)+1);
		if(r1>r2) {
			int z = r1-r2;
			System.out.println(r1 + ">"+r2+" �� "+z);
		}
		else {
			int z = r2-r1;
			System.out.println(r2 + ">"+r1+" �� "+z);
		}
		
		
	}
		}



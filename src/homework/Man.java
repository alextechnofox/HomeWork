package homework;
public class Man {
	   public String marka;
	   private int price;
		
	   public Man(String m, int p) {
		   marka = m;
		   price = p;
	   }
	   void drive() {
		   System.out.println("���������� "+marka + " ����� "+ price);
	   }
	   
	   
		public static void main(String[] args) {
			for(int i=0;i<10;i++) {
				String name = "����������"+i;
				int price = i + 1200;
				Man car = new Man(name,price);
				car.drive();
			}
			

		}

	}

/*public class Man {
String fio;
	
	
	//����������� ���������� ������������� ��� �������� �������
	public Man(String name,String profes) {
		fio = name;
		showProfession(profes);
		//System.out.println("������� ����������� ������");
	}
	
	void showProfession(String p) {
		System.out.println("������� �� ���� "+fio+" ����� ��������� "+p);
	}
	
	
	public static void main(String[] args) {
			new Man("������","����");//������� ������ ������
			new Man("�������","�������");//������� ������ ������
			
			
			
			

	}

	
	
}*/		
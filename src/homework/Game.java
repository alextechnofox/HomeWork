package homework;

import javax.swing.*;

public class Game {

	public static void main(String[] args) {
		int number = (int)(Math.random() * (10-1)+1);//�����, ������� ����� �������
		for(int i=0;i<5;i++) {
	      String answer = JOptionPane.showInputDialog(null,"������� �����");
	      int x= Integer.parseInt(answer);//������� ������ � ����� 
	      if(x == number) {
	    	  JOptionPane.showMessageDialog(null, "�� ���gff����!");
	    	  break;//��������� ����
	      }
	      
	      if(i==4) {
	    	  JOptionPane.showMessageDialog(null, "���� �������� "+number);
	      }
		}
		
	}

}



	/*public static void main(String[] args) {
		/*int x = 1, y=2,z =0,d=10;
		System.out.println(Math.min(Math.min(x, y), Math.min(z, d)));
		
		
		//������ ����������
		
		int x = (int)(Math.sqrt(9));
		System.out.println(x);
		
		// �������
		
		double res = Math.pow(2, 3);
		
		System.out.println(Math.PI);
		
		//��������� �����
		
		double r = Math.random(); 
		System.out.println(r);//�� 0 �� 1
		int r1 = (int)(Math.random() * (10-1)+1);
		System.out.println(r1);
		if(r1 % 2 == 0) {
			System.out.println(r1 +" ������");
		}
		else {
			System.out.println(r1 +" ��������");
		}
		
		
	}

}*/

package homework;

import javax.swing.*;

public class Table {

	public static void main(String[] args) {
		int v = 0;
		for(int i=0;i<5;i++) {
			int number = (int)(Math.random() * (10-1)+1);
			int number2 = (int)(Math.random() * (10-1)+1);
			String answer = JOptionPane.showInputDialog("������ : " + number + "*" + number2 );
			int x= Integer.parseInt(answer);
			if(x == number * number2) {
				JOptionPane.showMessageDialog (null, "���������� ����� !") ;
			} 
			else {
				JOptionPane.showMessageDialog (null, "������������ ����� ") ;


			} 
			if (x != number * number2) {
				v = v + 0;
			}
			else { 
				v = v + 1; 
			}
		}
		JOptionPane.showMessageDialog (null, "������ : " + v) ; 


	}
}



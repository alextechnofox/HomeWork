package homework;

import javax.swing.*;

public class Casino {

	private static int i;

	public static void main(String[] args) {
		for (i=0;i<1;i++)	{
			int number = (int)(Math.random() * (10-1)+1);
			String summa = JOptionPane.showInputDialog(null,"������� �����");
			String stavka = JOptionPane.showInputDialog(null,"������� ������");
			String chislo = JOptionPane.showInputDialog(null,"������� �����");
			int su = Integer.parseInt(summa); 
			int ch = Integer.parseInt(chislo); 
			int st =Integer.parseInt(stavka);int ostatok = su - st;
			if (ch == number) {
				int priz = su + st;
				JOptionPane.showMessageDialog(null, "�� �������!");
				JOptionPane.showMessageDialog(null, "���� ����� ��������� �� "+st+","+"�����: "+priz);
			} else {
				JOptionPane.showMessageDialog(null, "�� ���������, "+"�������: "+ostatok);
			}
		}
	}
}


		
	

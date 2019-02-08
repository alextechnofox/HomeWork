package homework;

import javax.swing.JOptionPane;

public class homework2 {
	static void t (int x1, int x2, int x3 ) {
		int triangle = x1+x2+x3;
		JOptionPane.showMessageDialog(null, "�������� ������������ "+x1+","+x2+","+x3+
				"="+triangle);	}
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("������� �������� �������� �����"));
		t(x,y,z);
	}

	/*static void � (int x1) {
		int circle = (int) (x1*Math.PI)*(int) (x1*Math.PI);
		JOptionPane.showMessageDialog(null, "������� ����� ��� ������� "+x1+
				"="+circle);
	}
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("������� �������� �������"));
		
		�(x);
	}
	static void p (int x1, int x2) {
		int perimeter = x1/2+x2/2;
		JOptionPane.showMessageDialog(null, "�������� �������������� ��� ����� "+x1+","+x2+
				"="+perimeter);
	}
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		p(x,y);
	}


	static void s (int x1, int x2) {
		int square = x1*x2;
		JOptionPane.showMessageDialog(null, "������� �������������� ��� ����� "+x1+","+x2+
				"="+square);
	}
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("������� �������� ������� �����"));
		s(x,y);
	}*/
}
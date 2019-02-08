package homework;

import java.awt.Container;

import javax.swing.JFrame;

public class Draw {

	public static void main(String[] args) {
		JFrame okno = new JFrame("��� ��������");
		homework panel = new homework();
		Container c = okno.getContentPane();
		c.add(panel);
		okno.setBounds(0,0,1000,1000);
		okno.setVisible(true);

	}

}

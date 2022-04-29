package Java_8;

import java.awt.Container;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class java_8_1 {
	public static void main(String agrs[]){
		JFrame app = new JFrame("Sum");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320,120);
		Container c = app.getContentPane();
		c.setLayout(new GridLayout(1,5));
		
		final JTextField t1=new JTextField();
		JButton b1=new JButton("+");
		final JTextField t2=new JTextField();
		JButton b2=new JButton("=");
		final JTextField t3=new JTextField();
		
		c.add(t1);
		c.add(b1);
		c.add(t2);
		c.add(b2);
		c.add(t3);
		
			
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					double result=Double.parseDouble(t1.getText())
					+Double.parseDouble(t2.getText());
					t3.setText(result+" ");
				
			}
		}
		);
		
	app.setVisible(true);
	}
}

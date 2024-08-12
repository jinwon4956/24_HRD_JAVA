package day5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SwingTest extends JFrame {
	
		
		JButton okBtn;
		
		public SwingTest() {
		super("첫번째 스윙연습");
		//setTitle("타이틀....");
		okBtn = new JButton("ok 버튼");
		MyListener my =new MyListener();
		okBtn.addActionListener(my);
		add(okBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		setSize(500,300);
		setVisible(true);;
		
		
	}
		class MyListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String result = e.getActionCommand();
				
				if(result.equals("Ok")) {
					System.out.println("OK 버튼이 클릭됨");
				}
			}
			
		}

	public static void main(String[] args) {
		new SwingTest();
		

	}

}

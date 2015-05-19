package StudyGraphic;

import javax.swing.*;

public class Frame02 extends JFrame{

	public Frame02(){
		setTitle("title");
		setBounds(75, 75, 1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TabbedPane01 tabbedPane01 = new TabbedPane01();
		JTabbedPane tabbedPane02 = new JTabbedPane();
		tabbedPane02.add("Y", new JPanel());
		
		JPanel panel01 = new JPanel();
		JPanel panel02 = new JPanel();
		
		panel02.add("cou", tabbedPane02);
		panel02.add("cou", new JTabbedPane());
		
		panel01.add(new JButton("click"));
		panel01.add(new JButton("click"));
		
		tabbedPane01.add("01", panel01);
		tabbedPane01.add("02", panel02);
		
		getContentPane().add(tabbedPane01);
		
		setVisible(true);
	}
	
	class TabbedPane01 extends JTabbedPane{
		
	}
	
}

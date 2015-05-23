package StudyGraphic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame01 extends JFrame{

	public Frame01(){
		setTitle("title");
		setBounds(75, 75, 400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TabbedPane01 tabbedpane01 = new TabbedPane01();
		
		TabbedPane01A tabbedPane01a = new TabbedPane01A();
		TabbedPane01B tabbedPane01b = new TabbedPane01B();
		
		TabbedPane01BA tabbedPane01ba = new TabbedPane01BA();
		TabbedPane01BB tabbedPane01bb = new TabbedPane01BB();
		
		Panel01A panel01a = new Panel01A();
		Panel01BA panel01ba = new Panel01BA();
		Panel01BB panel01bb = new Panel01BB();
		
		///////////////////////////////////////////////////////
		tabbedpane01.add("01", tabbedPane01a);
		tabbedpane01.add("02", tabbedPane01b);
		
		tabbedPane01a.add("01a", panel01a);
//		tabbedPane01a.add("01b", tabbedPane01b);
		
		tabbedPane01b.add("02a", panel01ba);
		tabbedPane01b.add("02b", panel01bb);
		panel01bb.setLayout(null);
		panel01bb.add(new JButton("clicked"));
		
		getContentPane().add(tabbedpane01);
		
		setVisible(true);
	}
	
}

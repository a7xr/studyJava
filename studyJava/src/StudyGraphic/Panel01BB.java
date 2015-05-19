package StudyGraphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel01BB extends JPanel implements ActionListener{

	public JButton button;
	
	public Panel01BB () {
		button = new JButton("click");
		button.addActionListener(this);
		setLayout(null);
		add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
	}
}

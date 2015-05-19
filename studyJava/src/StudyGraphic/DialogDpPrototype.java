package StudyGraphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class DialogDpPrototype extends JDialog implements ActionListener{

	JTextField jTextField;
	JButton jButtonGetIndex;
	JButton jButtonPrintAll;
	
	ProtoJouetCache protoJouetCache;
	
	public DialogDpPrototype() {
		// TODO Auto-generated constructor stub
		setTitle("title");
		setBounds(65, 75, 400, 200);
		setLayout(new FlowLayout());
		
		protoJouetCache = new ProtoJouetCache();
		protoJouetCache.loadCache();
		
		jTextField = new JTextField(2);
		add(jTextField);
		
		jButtonGetIndex = new JButton("getIndex");
		jButtonGetIndex.addActionListener(this);
		add(jButtonGetIndex);
		
		jButtonPrintAll = new JButton("printAll");
		add(jButtonPrintAll);
		jButtonPrintAll.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jButtonGetIndex){
			int a = Integer.valueOf(jTextField.getText());
			ProtoJouet jouet = protoJouetCache.getJouet(a);
			System.out.println(jouet);
		}else if(e.getSource() == jButtonPrintAll){
			protoJouetCache.printAllJouet();
		}
	}
	
}

interface ProtoJouet{
	public void speciality();
}

class Car implements ProtoJouet {

	@Override
	public void speciality() {
		// TODO Auto-generated method stub
		System.out.println("I_m a car");
	}
	
	@Override
	public String toString(){
		return "car";
	}
}

class Plane implements ProtoJouet{

	@Override
	public void speciality() {
		// TODO Auto-generated method stub
		System.out.println("I_m a plane");
	}
	
	@Override
	public String toString(){
		return "plane";
	}
	
}

class ProtoJouetCache{
	
	HashMap<Integer, ProtoJouet> jouetMap = new HashMap<>();
	
	public void loadCache(){
		ProtoJouet car01 = new Car();
		ProtoJouet car02 = new Car();

		ProtoJouet plane01 = new Plane();
		ProtoJouet plane02 = new Plane();
		
		jouetMap.put(0, car01);
		jouetMap.put(1, car02);

		jouetMap.put(2, plane01);
		jouetMap.put(3, plane02);
	}
	
	public ProtoJouet getJouet(int index) {
		return jouetMap.get(index);
	}
	
	public void printAllJouet(){
		for (int i = 0; i < jouetMap.size(); i++){
			System.out.println(i+": "+jouetMap.get(i));
		}
	}
	
}
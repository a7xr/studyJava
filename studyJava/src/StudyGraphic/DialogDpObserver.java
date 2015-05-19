package StudyGraphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

enum HexOrOct{hex, oct}

public class DialogDpObserver extends JDialog implements DocumentListener, ActionListener{

	SubjectObserved01 subjectObserved01 ;
	
	JTextField jtextFieldDpObserver;
	
	//constructor
	public DialogDpObserver() {
		// TODO Auto-generated constructor stub
		setModal(true);
		setTitle("title");
		setBounds(75, 175, 400, 200);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		subjectObserved01 = new SubjectObserved01();
		
		OctalObserver octalObserver = new OctalObserver();
		octalObserver.attach(subjectObserved01);
		HexObserver hexObserver = new HexObserver();
		hexObserver.attach(subjectObserved01);
		
		subjectObserved01.attach(octalObserver);
		subjectObserved01.attach(hexObserver);
		
		jtextFieldDpObserver = new JTextField(2);
		jtextFieldDpObserver.getDocument().addDocumentListener(this);
		add(jtextFieldDpObserver);

		setVisible(true);
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		if(jtextFieldDpObserver.getText().length() != 0)
			subjectObserved01.notifyAllObservers(Integer.valueOf(
					jtextFieldDpObserver.getText()));
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		if(jtextFieldDpObserver.getText().length() != 0)
		subjectObserved01.notifyAllObservers(Integer.valueOf(
				jtextFieldDpObserver.getText()));
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

class SubjectObserved01 {
	int state;
	ArrayList<Observer01>observers = new ArrayList<>();
	
	public void attach(Observer01 observer){
		observers.add(observer);
	}
	
	public SubjectObserved01() {
		// TODO Auto-generated constructor stub
	}
	
	public SubjectObserved01(Observer01 observer01){
		attach(observer01);
	}
	
	public void setState(int _state){
		this.state = _state;
		notifyAllObservers(_state);
	}
	
	public void notifyAllObservers(int a){
		for(Observer01 observer01 : observers)
			observer01.update(a);
	}
	
}

abstract class Observer01 {
	SubjectObserved01 subjObserved01;
	public abstract void attach(SubjectObserved01 subjectObserved01);
	public abstract void speciality();
	public abstract void update(int a);
}

class HexObserver extends Observer01 {

	@Override
	public void speciality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int a) {
		// TODO Auto-generated method stub
		System.out.println("hexObserver: "+
				Integer.toHexString(a));
	}

	@Override
	public void attach(SubjectObserved01 _subjectObserved01) {
		// TODO Auto-generated method stub
		this.subjObserved01 = _subjectObserved01;
	}
	
}

class OctalObserver extends Observer01 {

	@Override
	public void speciality() {
		// TODO Auto-generated method stub
		System.out.println("i_m an octal_observer");
	}

	@Override
	public void update(int a) {
		// TODO Auto-generated method stub
		System.out.println("octObserver: "+
				Integer.toOctalString(a));
	}

	@Override
	public void attach(SubjectObserved01 _subjectObserved01) {
		// TODO Auto-generated method stub
		this.subjObserved01 = _subjectObserved01;
	}
	
}
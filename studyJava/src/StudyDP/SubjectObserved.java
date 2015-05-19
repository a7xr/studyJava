package StudyDP;

import java.awt.List;
import java.util.ArrayList;

public class SubjectObserved {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	public int state;

	public SubjectObserved(){
		observers.add(0, new OctalObserver(this));
		observers.add(1, new BinaryObserver(this));
		observers.add(2, new HexObserver(this));
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers(){
		for(Observer obs : observers){
			obs.update();
		}
		System.out.println("here");
	}
	
}

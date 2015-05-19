package StudyDPReview;

import java.awt.List;
import java.util.ArrayList;

public class SubjectObserved02 {

	ArrayList<Observer02> observers = new ArrayList<>();
	private int state;
	
	public void attach(Observer02 observer02){
		observers.add(0, observer02);
	}
	
	public void notifyAllObservers(){
		for(Observer02 obs: observers)
			obs.update();
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	
}

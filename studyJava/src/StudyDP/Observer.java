package StudyDP;

public abstract class Observer {

	protected SubjectObserved subject;
	
	public Observer(SubjectObserved subject){
		this.subject = subject;
	}
	
	public SubjectObserved getSubject() {
		return subject;
	}

	public abstract void update();
	
}

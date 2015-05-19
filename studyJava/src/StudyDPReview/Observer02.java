package StudyDPReview;

public abstract class Observer02 {
	
	protected SubjectObserved02 subjectObserved02;
	
	public Observer02(SubjectObserved02 subjectObserved02){
		this.subjectObserved02 = subjectObserved02;
	}
	
	public abstract void update();

}

package StudyDP;

public class BinaryObserver extends Observer{
	
	public BinaryObserver(SubjectObserved subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("binary: " + Integer.toBinaryString(getSubject().getState()));
	}

}

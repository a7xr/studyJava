package StudyDP;

public class HexObserver extends Observer{

	
	
	public HexObserver(SubjectObserved subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("hex: " + Integer.toHexString(getSubject().getState()));
	}

}

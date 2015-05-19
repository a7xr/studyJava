package StudyDP;

public class OctalObserver extends Observer{

	
	
	public OctalObserver(SubjectObserved subObs) {
		super(subObs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("octal: " + Integer.toOctalString(getSubject().getState()));
	}

}

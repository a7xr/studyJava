package StudyDPReview;

public class OctalObserver02 extends Observer02{

	public OctalObserver02(SubjectObserved02 subjectObserved02) {
		super(subjectObserved02);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("octal: " + Integer.toOctalString(subjectObserved02.getState()));
	}

}

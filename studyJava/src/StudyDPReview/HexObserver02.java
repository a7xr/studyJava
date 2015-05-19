package StudyDPReview;

public class HexObserver02 extends Observer02 {

	public HexObserver02(SubjectObserved02 subjectObserved02) {
		super(subjectObserved02);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("hex: " + Integer.toHexString(subjectObserved02.getState()));
	}

}

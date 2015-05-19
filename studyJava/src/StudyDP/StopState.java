package StudyDP;

public class StopState extends StateDp{
	
	public void doAction(ContextState contextState){
//		super.doAction(contextState);
		
		context.setState(this);
		System.out.println("stopState action");
		
	}

}

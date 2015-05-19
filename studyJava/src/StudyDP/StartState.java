package StudyDP;

public class StartState extends StateDp{

	public void doAction(ContextState contextState){
//		super.doAction(contextState);
		context.setState(this);
		
		System.out.println("doing action in startState");
		
	}
	
	public void setContext(ContextState contextState){
		this.context = contextState;
	}
	
	public String toString(){
		return "start state";
	}
	
}

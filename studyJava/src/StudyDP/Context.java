package StudyDP;

public class Context {

	Strategy strategy;
	
	public int exeStrat(int a, int b){
		return strategy.doOp(a, b);
	}
	
	public Context(Strategy st) {
		strategy = st;
	}
	
}

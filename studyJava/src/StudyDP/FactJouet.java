package StudyDP;

public class FactJouet {

	public JouetFactInterf getjouet(String str){
		
		if (str.equalsIgnoreCase("car"))
			return new CarFact02();
		else if(str.equalsIgnoreCase("plane")){
			return new PlaneFact02();
		}
		
		return null;
	}
	
}

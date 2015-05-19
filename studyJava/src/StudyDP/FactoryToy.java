package StudyDP;

public class FactoryToy {

	public Toy getToy(String str) {
		if(str . equalsIgnoreCase("car")){
			return new Car();
		}else if(str.equalsIgnoreCase("plane")){
			return new Plane();
		}else {
		}
		return null;
	}
	
}

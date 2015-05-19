package StudyDP;

public class Singleton {
	public static Singleton instance = null;
	
	public synchronized static Singleton getInstance(){
		if (instance == null){
			instance = new Singleton();
			return instance;
		}
		else{
			System.out.println("already instanciated");
			return instance;
		}
			
	}
	
	private Singleton(){
		
	}
	
	public void doSth(){
		System.out.println("doing sth");
	}
}

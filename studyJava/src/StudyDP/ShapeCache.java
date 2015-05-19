package StudyDP;

import java.util.Hashtable;

public class ShapeCache {
	public static Hashtable shapeMap = new Hashtable<String, ShapeProtot>();
		
	public static void loadCache(){
		CircleProtot c01 = new CircleProtot();
		CircleProtot c02 = new CircleProtot();
		RectProtot r01 = new RectProtot();
		
		shapeMap.put(1, c01);
		shapeMap.put(2, c02);
		shapeMap.put(3, r01);
		
	}
	
	public static ShapeProtot getShape(int a){
		return (ShapeProtot) shapeMap.get(a);
	}
	
}

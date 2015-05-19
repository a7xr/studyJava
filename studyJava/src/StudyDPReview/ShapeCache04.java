package StudyDPReview;

import java.util.HashMap;

public class ShapeCache04 {

	static HashMap<Integer, ShapeProtot04>shapeMap = new HashMap<>();
	
	public static void loadCache(){
		Circle04 c01 = new Circle04();
		Circle04 c02 = new Circle04();
		Circle04 c03 = new Circle04();
		Rect04 r01 = new Rect04();
		
		shapeMap.put(0, c01);
		shapeMap.put(1, c02);
		shapeMap.put(2, c03);
		shapeMap.put(3, r01);
	}
	
	public static ShapeProtot04 getShape(int a){
		return (ShapeProtot04)shapeMap.get(a);
	}
	
}

package StudyDPReview;

import java.util.Hashtable;

public class ShapeCache03 {

	public static Hashtable<Integer, ShapeProtot03>
		shapetable = new Hashtable<Integer, ShapeProtot03>();
	
	public static void loadCache(){
		CircleProtot03 c01 = new CircleProtot03();
		shapetable.put(ShapeProtot03.getId(), c01);
		
		CircleProtot03 c02 = new CircleProtot03();
		shapetable.put(ShapeProtot03.getId(), c02);
		
		RectProtot03 r01 = new RectProtot03();
		shapetable.put(ShapeProtot03.getId(), r01);
	}
	
	public static ShapeProtot03 getShape(int a) {
		ShapeProtot03 res = (ShapeProtot03)shapetable.get(a);
		return res;
	}
	
}

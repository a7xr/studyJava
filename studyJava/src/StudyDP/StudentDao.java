package StudyDP;

import java.util.ArrayList;

public interface StudentDao {

	ArrayList<Student01>students = new ArrayList<>();
	
	public ArrayList<Student01> getAllStudents();
	
	public void deleteStudent(int rollNb);
	
	public void updateStudent(int rollNb, String name);
	
	public void printAllStudents();
	
	public void addStudents(Student01 ... stds);
	
}

package StudyDP;

import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{

	public ArrayList<Student01> getAllStudents(){
		return students;
	}
	
	public void deleteStudent(int rollNb){
		students.remove(rollNb);
	}
	
	public void updateStudent(int rollNb, String name){
		students.get(rollNb).setName(name);
	}
	
	public void printAllStudents(){
		for (Student01 student : students){
			System.out.println("rollNb: " + student.getRollNo());
			System.out.println("name: " + student.getName());
		}
	}

	@Override
	public void addStudents(Student01... stds) {
		// TODO Auto-generated method stub
		
		for(Student01 student01 : stds){
			students.add(student01);
		}
		
	}
	
}

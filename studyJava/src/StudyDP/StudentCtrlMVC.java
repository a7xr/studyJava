package StudyDP;

public class StudentCtrlMVC {

	StudentModelMVC model;
	StudentViewMVC view;
	
	public void updateView(){
		view.printStudent(model);
	}
	
	public void update(){
		System.out.println("update the db");
	}
	
	public void setStudentName(String nameStudent){
		model.setName(nameStudent);
	}
	
	public StudentCtrlMVC(StudentModelMVC model, StudentViewMVC view) {
		this.model = model;
		this.view = view;
	}
	
	
	public StudentModelMVC getModel() {
		return model;
	}
	public void setModel(StudentModelMVC model) {
		this.model = model;
	}
	public StudentViewMVC getView() {
		return view;
	}
	public void setView(StudentViewMVC view) {
		this.view = view;
	}
	
	
	
}

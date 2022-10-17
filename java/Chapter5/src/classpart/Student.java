package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 자바 컴파일러에서 자동으로 생성됨(디폴트 생성자) public Student(){}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}

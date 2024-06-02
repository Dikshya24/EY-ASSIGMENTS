package coreexcercise4;
import java.util.Date;
import java.util.Arrays;

public class student 
{
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer[] marks;
	private String grade;
	public static Integer admissionCounter;
	private static String schoolName;
	
	
	static {
		schoolName="Hyderbad Public School";
	}
	public student() {
		this.admissionCode=admissionCounter+100;
	}
	
	public student(String studentName,Date birthdate) {
		this();
		this.studentName=studentName;
		this.birthdate=birthdate;
	}
	
	public student(String studentName,Date birthdate,Integer[] marks) {
		this(studentName,birthdate);
		this.marks=marks;
	}
	public Integer getAdmissionCode() {
		return admissionCode;
	}
	public void setAdmissionCode(Integer admissionCode) {
		this.admissionCode = admissionCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}
	public String getGrade() 
	{
		return grade;
	}
	public void setGrade(String grade) {
		int totalmarks=this.marks[0]+this.marks[1]+this.marks[2];
		if(totalmarks>=240 && totalmarks<=300) {
			grade="Excellent";
		}
		if(totalmarks>=180 && totalmarks<=239) {
			grade="Good";
		}
		if(totalmarks>=150 && totalmarks<=179) {
			grade="Average";
		}
		if(totalmarks<150) {
			grade="Fail";
		}
		
		this.grade = grade;
	}
	public static Integer getAdmissionCounter() {
		return admissionCounter;
	}
	public static void setAdmissionCounter(Integer admissionCounter) {
		student.admissionCounter = admissionCounter;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		student.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	
	
	
}	


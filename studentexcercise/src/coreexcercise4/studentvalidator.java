package coreexcercise4;
import java.util.Date;
import java.util.Calendar;

public class studentvalidator {
	public boolean isValidStudentName(student student) {
		return student.getStudentName().matches("[a-zA-z]+");
	}
	public boolean isValidStudentBirthdate(student student) {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR,-5);
		Date fiveYearAgo=calendar.getTime();
		return student.getBirthdate().before(fiveYearAgo);
		
	}
	public boolean isValidStudentMarks(Integer[] marks) {
		if(marks!=null && marks.length==3) {
			for(Integer mark:marks) {
				if(mark<0||mark>100) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public boolean isValidStudent(student student) {
		return isValidStudentName(student) && isValidStudentBirthdate(student) && isValidStudentMarks(student.getMarks());
	}
	

}
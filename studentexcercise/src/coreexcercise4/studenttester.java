package coreexcercise4;

import java.util.Date;


public class studenttester
{
	public static void main(String[]args) {
		student[] student=new student[5];
		student.setAdmissionCounter(10)
		student[0]=new student("Ava"   ,new Date(101,3,20) ,new Integer[] {54,85,92});
		student[0].setGrade(null);
		student[1]=new student("Liam"  ,new Date(102,1,15),new Integer[] {67,91,75});
		student[1].setGrade(null);
		student[2]=new student("Olivia",new Date(105,6,28),new Integer[] {88,76,99});
		student[2].setGrade(null);
		student[3]=new student("Ethan" ,new Date(104,5,11),new Integer[] {95,82,71});
		student[3].setGrade(null);
		student[4]=new student("Rhea"  ,new Date(100,4,6) ,new Integer[] {73,90,67});
		student[4].setGrade(null);
		
		studentservice sc=new studentservice();
		sc.displayallstudents(student);
	}
	
	
}
		
	 

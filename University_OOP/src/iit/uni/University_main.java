package iit.uni;

import iit.uni.model.Student;
import iit.uni.model.Teacher;

public class University_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student();
//		student1.setAge(25);
//		System.out.println(student1.getAge());

		Teacher teacher = new Teacher();
		teacher.setTeacher_name("Shariful Islam");
		System.out.println(teacher.getTeacher_name());
		System.out.println("\n\n\n");
		
		Student s2 = new Student(01,"Shariful",25, true);
		System.out.println(s2.getStudent_id());
		System.out.println(s2.getStudent_name());
		System.out.println(s2.getAge());
		System.out.println(s2.isStatus());
	}

}

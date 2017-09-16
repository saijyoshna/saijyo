public class Main {

	public static void main(String[] args) {
		StudentGroup stg=new StudentGroup(10);
		Date d=new Date(1997,04,03);
		Student s1=new Student(143,"saijyo",d,65.5);
		stg.addFirst(s1);
		System.out.println(stg.getStudent(0).getId());
		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}

package comparatorandcomparable;

 	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	class Student5 implements Comparable<Student5> {
		private int rollno;
		private String name;
		private String  course ;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public Student5(int rollno, String name, String course) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.course = course;
		}
		@Override
		public String toString() {
			return "Student5 [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
		}
		@Override
		public int compareTo(Student5 o) {
			
			return this.name.compareTo(o.name);
		}
		
		
	}  


	public class ComparableSortExample3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Student5> al = new ArrayList<>(Arrays.asList(
					new Student5(1,"Divya","mca"),
	                new Student5(2,"Shivani","msc"),
	                new Student5(3,"Gayatri","mca"),
	                new Student5(4,"Bhavani","mca"),
	                new Student5(5,"Harika","msc")
	            ));
			
			
			Collections.sort(al);//Arrange record in ascending order
	        for (Student5 e : al) {
	        	System.out.println(e);
	        	//System.out.println(e.getName() + " => " + e.getSalary());
	        }

		}

	
}

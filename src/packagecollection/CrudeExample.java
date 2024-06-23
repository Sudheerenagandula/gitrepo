package packagecollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	private String sname;
	private String Dept;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

//	@Override
//	public String toString() {
//		return "Student [sname=" + sname + ", Dept=" + Dept + "]";
//	}

	public Student(String sname, String dept) {
		super();
		this.sname = sname;
		Dept = dept;
	}

}

public class CrudeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Sname");
//		String sname = sc.next();
//		System.out.println("Enter Dept");
//		String dept = sc.next();
		Student s = new Student("Onkar", "Civil");
		arrayList.add(s);
		Student s1 = new Student("Kareem", "CSE");
		arrayList.add(s1);
		Student s2 = new Student("Varad", "Mechanical");
		arrayList.add(s2);
		System.out.println("Data in My ArrayList " + arrayList);
		for (Student st : arrayList) {
			System.out.println("sname :" + st.getSname());
			System.out.println("dept :" + st.getDept());

		}
		arrayList.remove(0);
		System.out.println("After Remove My ArrayList : " + arrayList);
		for (Student st : arrayList) {
			System.out.println("sname :" + st.getSname());
			System.out.println("dept :" + st.getDept());
		}
		Student s3 = new Student("Varad", "Electrical");
		arrayList.set(1, s3);
		System.out.println("After Update My ArrayList : " + arrayList);
		for (Student st : arrayList) {
			System.out.println("sname :" + st.getSname());
			System.out.println("dept :" + st.getDept());
		}
	}

}
package array;

 	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Comparator;

	class Student {
		String sname;
		LocalDate sdob;
		String scourse;

		public Student(String sname, LocalDate sdob, String scourse) {
			super();
			this.sname = sname;
			this.sdob = sdob;
			this.scourse = scourse;
		}

		@Override
		public String toString() {
			return "Student [sname=" + sname + ", sdob=" + sdob + ", scourse=" + scourse + "]";
		}

	}

	class SortByName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.sname.compareTo(o2.sname);
		}
	}

	class SortByDOB implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.sdob.compareTo(o2.sdob);
		}
	}

	public class ComparatorExample {

		public static void main(String[] args) {
			ArrayList<Student> e = new ArrayList<Student>();
			Student s1 = new Student("Gayathri", LocalDate.of(2001, 11, 29), "Java");
			e.add(s1);
			e.add(new Student("Divya", LocalDate.of(1999, 10, 10), "Python"));
			e.add(new Student("Shivani", LocalDate.of(2000, 11, 4), "Python"));
			e.add(new Student("Bhavani", LocalDate.of(2001, 10, 12), "Python"));
			e.add(new Student("Nikky", LocalDate.of(2002, 04, 29), "Python"));
			e.add(new Student("vamshi", LocalDate.of(2003, 06, 20), "Python"));
			System.out.println("Sort by DOB");
			Collections.sort(e, new SortByDOB());
			for (int i = 0; i < e.size(); i++) {
				System.out.println(e.get(i));
			}
			Collections.sort(e, new SortByName());
			System.out.println("Sort by Name");
			for (int i = 0; i < e.size(); i++) {
				System.out.println(e.get(i));
			}
		}

	}


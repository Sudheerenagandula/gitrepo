package Java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


		class Emp {
		int eid;
		String ename;
		String designation;
		int salary;


		public int getEid() {
		return eid;
		}


		public void setEid(int eid) {
		this.eid = eid;
		}


		public String getEname() {
		return ename;
		}


		public void setEname(String ename) {
		this.ename = ename;
		}


		public String getDesignation() {
		return designation;
		}


		public void setDesignation(String designation) {
		this.designation = designation;
		}


		public int getSalary() {
		return salary;
		}


		public void setSalary(int salary) {
		this.salary = salary;
		}


		public Emp(int eid, String ename, String designation, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;


		}


		@Override
		public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary + "]";
		}


		}


		public class StreamAPI {


		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> a1 = new ArrayList<>();
		a1.add(new Emp(1, "Manya", "Manager", 23000));
		a1.add(new Emp(2, "Avinash", "TL", 24000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));


		List<String> list = a1.stream().map(a -> a.toString()).collect(Collectors.toList());
		System.out.println("Emp List : " + list);
		Long countLong = a1.stream().count(); // a1
		System.out.println("Count is : " + countLong); // 5


		Set<String> list1 = a1.stream().map(a -> a.toString()).collect(Collectors.toSet());
		System.out.println("Emp List : " + list1);
		Long countLong1 = list1.stream().count(); // list1
		System.out.println("Count is : " + countLong1); // 4


		Stream<Emp> nameStartWith = a1.stream().filter(a -> a.getEname().contains("M"));
		System.out.println("Name Start With M : " + nameStartWith.collect(Collectors.toList()));


		List<String> nameInUpperCase = a1.stream().map(a -> a.ename.toUpperCase()).collect(Collectors.toList());
		System.out.println("Emp Name in Upper Case : " + nameInUpperCase);
		 Object s = a1.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));

 		System.out.println("Emp maximum salary:" +  s);
		//
		Object s1 = a1.stream().collect(Collectors.minBy(Comparator.comparingInt(a -> a.salary)));
		System.out.println("Emp minimum salary:" + s1);
		//
		double s3 = a1.stream().collect(Collectors.averagingInt(b -> b.salary));
		System.out.println("Emp average salary:" + s3);

		}
}
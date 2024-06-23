package Java8;

 	 

	import java.nio.file.DirectoryStream.Filter;
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;
	import java.util.OptionalInt;
	import java.util.stream.Collectors;

	class Employee {
		 private int id;
		 private String name;
		 private int age;
		 private long salary;
		 private String gender;
		 private String deptName;
		 private String city;
		 private int yearOfJoining;
		public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
				int yearOfJoining) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.gender = gender;
			this.deptName = deptName;
			this.city = city;
			this.yearOfJoining = yearOfJoining;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public long getSalary() {
			return salary;
		}
		public String getGender() {
			return gender;
		}
		public String getDeptName() {
			return deptName;
		}
		public String getCity() {
			return city;
		}
		public int getYearOfJoining() {
			return yearOfJoining;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setYearOfJoining(int yearOfJoining) {
			this.yearOfJoining = yearOfJoining;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
					+ ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
		}
		 
		 
	}

	public class StreamApiEx {

		public static void main(String[] args) {
	        
			List<Employee> empList = new ArrayList<>();
			empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
			empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
			empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
			empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
			empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
			empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
			empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
			empList.add(new Employee(8, "pqr", 22, 145, "M", "IT", "Trivandrum", 2015));
			empList.add(new Employee(9, "stv", 30, 160, "M", "IT", "Blore", 2010));
			
			//1.Grouping Employees by City
			Map<String, List<Employee>> empCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
			System.out.println("Employees Grouping By City : \n"+empCity);
			
		//2: Grouping Employees by Age
	       Map<Integer, List<Employee>> empAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
	       System.out.println("Employees Grouping By Age : \n"+empAge);
	       
	    //3: Finding the Count of Male and Female Employees
	    // Define a map to store the count of male and female employees
	       Map<String, Long> noOfMaleandFemale = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	       System.out.println("Count Of Male and Female Employees : "+noOfMaleandFemale);
	       
	   //    4: Printing Names of All Departments
	    // Print the names of all departments in the organization
	    System.out.println("Names of all departments in the organization ");
	    empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
	    
	  //  5: Printing Employee Details by Age Criteria
	 // Print employee details whose age is greater than 28
	 System.out.println("Employee details whose age is greater than 28");
	 empList.stream().filter(e->e.getAge()>28).forEach(System.out::println);
	 
	// Question 6: Finding Maximum Age of Employee
	//Find maximum age of employee
	 OptionalInt maxAge = empList.stream().mapToInt(Employee::getAge).max();
	//Map employee ages to IntStream
	 if(maxAge.isPresent()) {
		 System.out.println("MAximum age of Employee : "+maxAge.getAsInt());
	 }
	 
	// 8: Printing the Number of Employees in Each Department
	//Print the number of employees in each department
	 
	       Map<String, Long> countByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName ,Collectors.counting()));
	       System.out.println("Number Of Employees In Each Depatment : "+countByDept);
	       for(Map.Entry<String, Long> entry:countByDept.entrySet()) {
	    	   System.out.println(entry.getKey() + " : "+entry.getValue());
	       }
	    //   9: Finding the Oldest Employee
	    // Find the oldest employee
	 
	 Optional<Employee> oldestEmp = empList.stream().max(Comparator.comparing(Employee::getAge));
	 if (oldestEmp.isPresent()) {
		 Employee oldeEmployee = oldestEmp.get();
		System.out.println("Oldest employee details:: \n" +oldeEmployee);
	 }
	 else {
		 System.out.println("No Employee Found In The List");
	 }
	 
	 //10: Finding the Youngest Female Employee
	 Optional<Employee> youngEmp = empList.stream().filter(e->e.getGender().equals("F")).min(Comparator.comparing(Employee::getAge));
	 if (youngEmp.isPresent()) {
		 Employee oldeEmployee = oldestEmp.get();
		System.out.println("Youngest employee details:: \n" +youngEmp);
	 }
	 else {
		 System.out.println("No Employee Found In The List");
	 }
	 
	 
	 
	 
	 
		}

	
}

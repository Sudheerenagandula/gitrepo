package array;

 	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class CompareToExample {
		int empId;
		String ename;
		LocalDate eDOJ;
		String edesig;

		public CompareToExample(int empId, String ename, LocalDate eDOJ, String edesig) {
			super();
			this.empId = empId;
			this.ename = ename;
			this.eDOJ = eDOJ;
			this.edesig = edesig;
		}

		@Override
		public String toString() {
			return "EmployeeData [empId=" + empId + ", ename=" + ename + ", eDOJ=" + eDOJ + ", edesig=" + edesig + "]";
		}
	}

	class EmpSortByName implements Comparator<CompareToExample> {

		@Override
		public int compare(CompareToExample o1, CompareToExample o2) {
			// TODO Auto-generated method stub
			return o1.ename.compareTo(o2.ename);
		}

	}

	class EmpSortByDOJ implements Comparator<CompareToExample> {

		@Override
		public int compare(CompareToExample o1, CompareToExample o2) {
			// TODO Auto-generated method stub
			return o1.eDOJ.compareTo(o2.eDOJ);
		}

	

	 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<CompareToExample> arrayList = new ArrayList<CompareToExample>();
			arrayList.add(new CompareToExample(1, "Kareem", LocalDate.of(2024, 12, 15), "Developer"));
			arrayList.add(new CompareToExample(1, "Mazhar", LocalDate.of(2022, 02, 13), "Developer"));
			arrayList.add(new CompareToExample(1, "Adnan", LocalDate.of(2020, 11, 10), "Developer"));
			arrayList.add(new CompareToExample(1, "Mack", LocalDate.of(2019, 8, 03), "Developer"));
			System.out.println("Sort By Name");
			Collections.sort(arrayList, new EmpSortByName());
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
			System.out.println();
			System.out.println("Employee Sort By Date");
			Collections.sort(arrayList, new EmpSortByDOJ());
			for (int j = 0; j < arrayList.size(); j++) {
				System.out.println(arrayList.get(j));
			}
		}

	}

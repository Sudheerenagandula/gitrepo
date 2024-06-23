package Java8;

import java.util.Optional;

public class Student {
 
 		 
		    public static void main(String[] args) {
		        Optional<Student> student = Optional.ofNullable(getStudentWithName("hamza"));
		        if (student.isPresent()) {
		            System.out.println(student.get().getName());
		        } else {
		            System.out.println("Student  is not present");
		        }
		    }
		   public  static Student  getStudentWithName(String name ){
		        // lets suppose that our database contain only 2 students ahmed and hamza .
		        if (name.equals("hamza") || name.equals("ahmed")) {
		            return new Student(name , 22 , "Morocco");
		        } else {
		            return null ;
		        }
		    }
		

}

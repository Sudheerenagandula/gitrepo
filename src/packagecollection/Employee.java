package packagecollection;
	public class Employee {
	    String name;
	    int id;
	    int Rollno;
	    public Employee() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public Employee(String name, int id, int rollno) {
	        super();
	        this.name = name;
	        this.id = id;
	        Rollno = rollno;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public int getRollno() {
	        return Rollno;
	    }
	    public void setRollno(int rollno) {
	        Rollno = rollno;
	    }
	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", id=" + id + ", Rollno=" + Rollno + "]";
	    }
	    
	    
	    
	}



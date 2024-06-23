package Oops;

 

 
		class Product1{
		    private int pID;
		    private String pName;
		    public int getpID() {
		        return pID;
		    }
		    public void setpID(int pID) {
		        this.pID = pID;
		    }
		    public String getpName() {
		        return pName;
		    }
		    public void setpName(String pName) {
		        this.pName = pName;
		    }
		    public Product1(int pID, String pName) {
		        
		        this.pID = pID;
		        this.pName = pName;
		    }
		    public Product1() {
		        
		    }
		}
		    public class Encapsulation{
		 		    public static void main(String[] args) {
		        Product1 p=new Product1();
		        p.setpID(101);
		        p.setpName("Laptop");
		        System.out.println(p.getpID()+ ": "+p.getpName());
		        Product1 p1=new Product1(102,"Tablet");
		        System.out.println(p1.getpID()+ ": "+p1.getpName());
		    }
		
		}
		



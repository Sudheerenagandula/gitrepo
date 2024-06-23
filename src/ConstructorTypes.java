
public class ConstructorTypes {

	 
		    String name;
		    int age;
		    public ConstructorTypes() {
		        System.out.println("Default Constructor");
		    }
		    void  ConstructorTypes(String nm){
		        name=nm;
		        System.out.println("Parametrized Constructor : " +name);
		    }
		    ConstructorTypes(String nm,int age){
		        name=nm;
		        this.age=age;
		        System.out.println("Parametrized Constructor " +name +":"+this.age);
		    }
		    ConstructorTypes(ConstructorTypes cobj){
		        name=cobj.name;
		        age=cobj.age;
		        System.out.println("copy Constructor " +name +":"+this.age);
		        
		    }
		    
		    public static void main(String[] args) {
		        ConstructorTypes c=new ConstructorTypes();
		        c.ConstructorTypes("Varad");
		        //ConstructorTypes c1=new ConstructorTypes("EduBridge");
		        ConstructorTypes c2=new ConstructorTypes("EduBridge",10);
		        ConstructorTypes c3=new ConstructorTypes(c2);
		    
		
	}

}

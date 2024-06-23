package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Address {
 	    private String street;
	    private String city;
	    private String state;
	    private String pinCode;
	    public Address(String string, String string2, String string3, String string4) {
			super();
			this.street = string;
			this.city = string2;
			this.state = string3;
			this.pinCode = string4;
		}
		@Override
		public java.lang.String toString() {
			return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + pinCode + "]";
		}   
	}
	@SuppressWarnings("serial")
	class Person implements Serializable {
	    private java.lang.String name;
	    private int age;
	    private Address address;//Aggegration-->has Relation
		public Person(java.lang.String string, int age, Address address) {
			super();
			this.name = string;
			this.age = age;
			this.address = address;
		}
		@Override
		public java.lang.String toString() {
			return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
		}  
	
	 
	    public static void main(String[] args) throws ClassNotFoundException, IOException {
	        serializePerson();
	       Person deserializedPerson = deserializePerson();
	       System.out.println("Deserialized Person: " + deserializedPerson);
	    }
	    @SuppressWarnings("resource")
		public static void serializePerson() throws IOException {
	    	FileOutputStream fos=new FileOutputStream("f:/person.txt");
	        ObjectOutputStream oos = new ObjectOutputStream(fos) ;
	        Address address = new Address("Ganga Road", "Shahapur", "Maharashtra", "421601");
	        Person person = new Person("Roshani", 25, address);   
	        oos.writeObject(person);
	            System.out.println("Person object serialized successfully.");
	        }
	        @SuppressWarnings("resource")
			private static Person deserializePerson() throws IOException, ClassNotFoundException {
	        Person p = null;
	        FileInputStream fis=new FileInputStream("f:/person.txt");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	            p = (Person) ois.readObject();
	            System.out.println("Person object deserialized successfully.");     
	        return p;
	    }
	
}

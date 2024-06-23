package Java8;

import java.util.function.BiFunction;

 	    private String name;
	    private int price;
	    public Product() {
	        name="";
	        price=0;
	    }
	    public Product(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    
	    }
	    public class MethodrefeusingConstructor{
	    public static void main(String[] args) {
	        //classname::new
	        System.out.println("Parameterized Constructor");
	        BiFunction<String, Integer, Product> productConstructor = Product::new;
	        Product product = productConstructor.apply("Apple Iphone", 1500);
	        System.out.println(product.getName());
	        System.out.println(product.getPrice());
	        Product p=new Product("Laptop",50000);
	        System.out.println(p.getName());
	        System.out.println(p.getPrice());
}}}

package Java8;

import java.util.function.BiFunction;

 

 
		// TODO Auto-generated method stub
 
		public class Product {
			 
			    private String name;
			    private int price;
			    public Product(String name, int price) {
			        this.name = name;
			        this.price = price;
			    }
				public char[] getPrice() {
					// TODO Auto-generated method stub
					return null;
				}
			    
			    // Getter and setter methods
			}
			public class Main {
			    public static void main(String[] args) {
			        BiFunction<String, Integer, Product> productConstructor = Product::new;
			        Product product = productConstructor.apply("Apple Iphone", 1500);
			        System.out.println(product.getPrice());
			        System.out.println(product.getPrice());
			    }
			

	}



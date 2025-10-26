import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
	
	String name;
	int price;
	
	public Product(String name, int price) {
		super();
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
	
	

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	public static void main(String args)
	{
		List<Product> products =Arrays.asList(new Product("Monitor",5000),
											  new Product("Mouse",400),
											  new Product("Keyboard",600));
		List<Product> sortedproduct = new ArrayList<>();
		
		for(Product prod : products)
		{
			Product prod2 = null;
			if(prod.getPrice()<prod2.getPrice())
			{
				
				sortedproduct.add(prod);
				
				
			}
		}
		System.out.println(sortedproduct);
	}
	

}

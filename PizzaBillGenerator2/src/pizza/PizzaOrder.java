package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
	private List<Pizza> pizzas; 
	
	
	public PizzaOrder() {
		pizzas=new ArrayList<>();
	}
	
	public void addpizza(Pizza pizza) {
		pizzas.add(pizza);	
	}
	
	public void calculateTotal() {
		int total=0;
		System.out.println("----------Pizza Bill----------");
		for(Pizza pizza:pizzas) {
			total +=pizza.getPrice();
			System.out.println(pizza.getType()+" "+pizza.getPrice());
		}
		System.out.println("Total: Rs "+total);
		System.out.println("Thank You..");
	}
	
}

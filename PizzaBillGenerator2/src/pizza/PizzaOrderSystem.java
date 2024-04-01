package pizza;

public class PizzaOrderSystem {

	public static void main(String[] args) {
		//creating pizzas of diff types and size
		Pizza margherita=new Pizza("Margherita",new SmallPizza()); 
		Pizza pepperoni=new Pizza("pepperoni",new MediumPizza());
		Pizza veggieSupreme=new Pizza("veggieSupreme",new LargePizza());
		
		//creating a pizza order and adding pizzas
		PizzaOrder order=new PizzaOrder();
		order.addpizza(margherita);
		order.addpizza(pepperoni);
		order.addpizza(veggieSupreme);
		
		//generate the bill
		order.calculateTotal();
	}

}

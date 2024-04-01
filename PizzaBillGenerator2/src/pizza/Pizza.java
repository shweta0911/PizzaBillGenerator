package pizza;

public class Pizza implements PizzaType{
	private String name;
	private PizzaSize size;
	
	public Pizza(String name,PizzaSize size) { 
		this.name=name;
		this.size=size;
	}
	
	public String getName() {
		return name;
	}
	public PizzaSize getSize() {
		return size;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return name+ "Pizza";
	}
	
	public int getPrice() {
		return size.getPrice();
	}
}

package beans;

public class Order {

	//Initialized variables 
	int id = 0;
	String number="";
	String name = "";
	float price = 0;
	int quantity = 0;
	
	
	//Constructor
	public Order(int id, String number, String name, float price, int quantity) 
	{
		this.id = id;
		this.number = number;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	
	
	//Get and Set Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

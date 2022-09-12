package javaapplication1;

public class Item {
	private String name;
	private int id;
	private String amount;
	public Item(String id, String name, String amount) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "item [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}

package epammaventask;

abstract class giftpack 
{
	abstract void display();
	private int price;
	private int weight;
	public giftpack(int price,int weight)
	{
		this.price=price;
		this.weight=weight;
	}
	public int getPrice()
	{
		return price;
	}
	public int getWeight()
	{
		return weight;
	}
	@Override
	public String toString() {
		return "price :Rs."+this.price+"\nWeight :"+this.weight;
		
	}
	
}

package epammaventask;



public abstract class sweets extends giftpack 
{
	abstract void display();
	private int price;
	private int weight;
	private String sweet_name;
	
	public sweets(String sweet_name,int price,int weight)
	{
		super(price,weight);
		this.sweet_name=sweet_name;
		this.price=price;
		this.weight=weight;
		
	}
	public String getchociName()
	{
		return sweet_name;
	}
	public int getPrice()
	{
		return price;
	}
	public int getWeight()
	{
		return weight;
	}
	public String toString()
	{
		return "sweet name:"+this.sweet_name+"\n price :Rs."+this.price+"\n weight:"+this.weight+"grams";
	}
}

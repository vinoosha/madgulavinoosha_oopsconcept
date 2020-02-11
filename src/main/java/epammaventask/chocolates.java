package epammaventask;


public abstract class chocolates extends giftpack 
{
	abstract void display();
	private int price;
	private int weight;
	private String choci_name;
	
	public chocolates(String choci_name,int price,int weight)
	{
		super(price,weight);
		this.choci_name=choci_name;
		this.price=price;
		this.weight=weight;
		
	}
	public String getchociName()
	{
		return choci_name;
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
		return "chocolate name:"+this.choci_name+"\n price :Rs."+this.price+"\n weight:"+this.weight+"grams";
	}
}

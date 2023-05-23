package Oops.Encapsulation;
//ENCAPSULATION

public class mobile {
	private String brand;
	private String colour;
	private double price;
	private String ram;
	private int pin=1810;
	
	//CONSTRUCTOR
	mobile()
	{
		
	}
	
	mobile(String brand, String colour)
	{
		this.brand=brand;
		this.colour=colour;
	}
	
	mobile(String brand, String colour,double price)
	{
		this(brand,colour);
		this.price=price;
		
	}
	
	mobile(String brand, String colour,double price,String ram)
	{
		this(brand,colour,price);
		this.ram=ram;
	}
	
	public void detailsOfMobile()
	{
		System.out.println("BRAND : "+brand);
		System.out.println("COLOUR : "+colour);
		System.out.println("PRICE : "+price);
		System.out.println("RAM : "+ram);
	}
	
	public String getBrand() //Getter
	{
		return brand;
	}
	
	public String getColour(String brand,int pin) //Getter
	{
		if(this.pin==pin && this.brand==brand)
		
			return "This Colour is Available!";
		else
			return "This Colour is Not Available";
	}
	
	public double getPrice() //Getter
	{

		return price;
	}
	
	public String getRam() //Getter
	{
		
		return ram;
	}
	
	public void setColour(String brand,String OldColour,String NewColour,int pin)
	{
		if(this.pin==pin)
		{
		if(brand=="Redmi"&&this.colour==OldColour)
		{
			this.colour=NewColour;
		}
		}
	}
	
}

package Oops.Encapsulation;
//ENCAPSULATION

public class sim {
	private String serviceProvider;
	private String type;
	private double price;
	private long mblno;
	private int otp=031112;
	
	sim()
	{
		
	}
	
	sim(String serviceProvider, String type)
	{
		this.serviceProvider=serviceProvider;
		this.type=type;
	}
	
	sim(String serviceProvider, String type,double price)
	{
		this(serviceProvider,type);
		this.price=price;
		
	}
	
	sim(String serviceProvider, String type,double price,long mblno)
	{
		this(serviceProvider,type,price);
		this.mblno=mblno;
	}
	
	public void detailsOfSim()
	{
		System.out.println("SERVICE PROVIDER : "+serviceProvider);
		System.out.println("TYPE : "+type);
		System.out.println("PRICE : "+price);
		System.out.println("MOBILE NUMBER : "+mblno);
	}
	
	public String getServiceProvider() //Getter
	{
		
		return serviceProvider;
	}
	
	public String getType(long mblno,int otp) //Getter
	{
		if(this.otp==otp && this.mblno==mblno)
		
			return "Network Type is : "+ type;
		else
			return "Invalid Mobile Number!";
	}
	
	public double getPrice() //Getter
	{

		return price;
	}
	
	public long getMblNo() //Getter
	{
		
		return mblno;
	}
	
	public void setNetworkType(String serviceProvider,String OldType,String NewType,int otp)
	{
		if(this.otp==otp)
		{
		if(serviceProvider=="Airtel"&&this.type==OldType)
		{
			this.type=NewType;
		}
		}
	}
	

}

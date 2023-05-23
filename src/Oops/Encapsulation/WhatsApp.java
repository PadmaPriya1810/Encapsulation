package Oops.Encapsulation;
//ENCAPSULATION

public class WhatsApp 
{
	private long contactno;
	private String username;
	private String status;
	private int password;
	
	WhatsApp()
	{
		System.out.println("Create WhatsApp Account");
	}
	WhatsApp(long contactno,String username)
	{
		this.contactno=contactno;
		this.username=username;
	}
	WhatsApp(long contactno,String username,String status)
	{
		this(contactno,username);
		this.status=status;
	}
	WhatsApp(long contactno,String username,String status,int password)
	{
		this(contactno,username,status);
		this.password=password;
	}
	public void videoCall()
	{
		System.out.println("Video Call is Connecting");
	}
	
	public void voiceCall()
	{
		System.out.println("Voice Call is Connecting");
	}
	
	public void chats()
	{
		System.out.println("Sending & Receiving Messages");
		
	}
	
	public long getCheckContactNumber(int password)
	{
		if(this.password==password) //Use "equals" for String 
		
			return this.contactno;
		
		else
		
		return 0l;
		
	}
		
	public String getCheckUsername(long contactno,int password)
	{
		if(this.contactno==contactno&&this.password==password)
		
			return this.username;
		
		else
		
		return "Invalid Credentials";
	}
		
	
	public String getReadStatus(long contactno)
	{
		if(this.contactno==contactno)
		
			return "Love Urself!";
		
		else
		
		return "Invalid Contact Number!";
		
		}

	public void setChangeContactNumber(long oldContactno,long newContactno, int password)
	{
		if(this.contactno==oldContactno&&this.password==password)
		{
			this.contactno=newContactno;
			System.out.println("Contact Number Changed Successfully!");
		}
		else
			System.out.println("Wrong Credentials!");
	}
	
	public void setChangeUsername(String OldUsername,String NewUsername,int password )
	{
		if(this.username.equals(OldUsername)&&this.password==password)//Use "equals" for String 
		{
			this.username=NewUsername;
			System.out.println("UserName Changed Successfully!");
		}
		else
			System.out.println("Wrong Credentials!");
	}
	
	public void setChangeStatus(String status,long contactno)
	{
		if(this.contactno==contactno)
		{
			this.status=status;
			System.out.println("New Status Updated Successfully!");
		}
		else
			System.out.println("Wrong Contact Number!");
	}
	
	public void setChangePassword(int OldPassword,int NewPassword )
	{
		if(this.password==OldPassword)
		{
			this.password=NewPassword;
			System.out.println("Password Changed Successfully");
		}
		else
			System.out.println("Invalid Password!");
	}
	
	
}

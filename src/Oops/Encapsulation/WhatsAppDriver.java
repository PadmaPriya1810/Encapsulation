package Oops.Encapsulation;
//ENCAPSULATION

import java.util.Scanner;

public class WhatsAppDriver {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args)throws Exception
{
	System.out.println("Enter the Contact Number:");
	long contactno=sc.nextLong();
	
	System.out.println("Enter the UserName:");
	String username=sc.next();//Use nextLine() twice
	
	System.out.println("Enter the Status:");
	String status=sc.next();
	
	System.out.println("Enter the Password:");
	int password=sc.nextInt();
	
	System.out.println("Your WhatsApp Account Created Successfully!");
	
	WhatsApp w=new WhatsApp(contactno,username,status,password);
	
	boolean loop=true;
	do
	{
		
		System.out.println("***Welcome To WhatsApp***");
		Thread.sleep(3000);
		System.out.println("1.Check Contact Number");
		System.out.println("2.Check UserName");
		System.out.println("3.Read Status");
		System.out.println("4.Change Contact Number");
		System.out.println("5.Change UserName");
		System.out.println("6.Change Status");
		System.out.println("7.Change Password");
		System.out.println("8.Exit");
		
		System.out.println("Enter Your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			
			System.out.println("Enter Your Password:");
			int pwd=sc.nextInt();
			
			System.out.println(w.getCheckContactNumber(pwd));
		}
		break;
		case 2:
		{
			System.out.println("Enter Your Contact Number:");
			long cno=sc.nextLong();
			System.out.println("Enter Your Password:");
			int pwd=sc.nextInt();
			
			System.out.println(w.getCheckUsername(cno,pwd));
		}
		break;
		case 3:
		{
			System.out.println("Enter Your Contact Number:");
			long cno=sc.nextLong();
			
			System.out.println(w.getReadStatus(cno));
		}
		break;
		case 4:
		{
			System.out.println("Enter Your Old Contact Number:");
			long oldcno=sc.nextLong();
			System.out.println("Enter Your New Contact Number:");
			long newcno=sc.nextLong();
			System.out.println("Enter Your Password:");
			int pwd=sc.nextInt();
			
			w.setChangeContactNumber(oldcno,newcno,pwd);
		}
		break;
		case 5:
		{
			System.out.println("Enter Your Old UserName:");
			String olduname=sc.next();
			System.out.println("Enter Your New UserName:");
			String newuname=sc.next();
			System.out.println("Enter Your Password:");
			int pwd=sc.nextInt();
			
			w.setChangeUsername(olduname,newuname,pwd);
		}
		break;
		
		case 6:
		{
			System.out.println("Update Your Status:");
			String newstatus=sc.next();
			System.out.println("Enter Your Contact Number:");
			long cno=sc.nextLong();
			w.setChangeStatus(newstatus,cno);
		}
		break;
		case 7:
		{
			
			
			System.out.println("Enter Your Old Password:");
			int oldpwd=sc.nextInt();
			System.out.println("Enter Your New Password:");
			int newpwd=sc.nextInt();
			
			w.setChangePassword(oldpwd,newpwd);
		}
		break;
		case 8:
		{
			loop=false;
			System.out.println("Thank You For Using WhatsApp!");
		}
		break;
		default:
		{
			System.out.println("Invalid Choice. Try Again!");
		}
		}
	}
		while(loop);
}	
}

	
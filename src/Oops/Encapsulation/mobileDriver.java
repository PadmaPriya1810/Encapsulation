package Oops.Encapsulation;
//ENCAPSULATION

public class mobileDriver {
public static void main(String[] args) {
	
	mobile m=new mobile("Redmi","Pink",14999.0,"16GB");
	m.detailsOfMobile();
	System.out.println("************");
	
	System.out.println(m.getColour("Redmi",1819));//Printing getter()
	System.out.println("************");
	
	m.setColour("Redmi","Pink","Blue",1810); //Cannot Print setter()
	m.detailsOfMobile(); //For Checking Updation Calling detailsOfMobile()
	System.out.println("************");
}
}

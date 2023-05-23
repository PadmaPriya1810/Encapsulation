package Oops.Encapsulation;
//ENCAPSULATION

public class simDriver {
	
	public static void main(String[] args) {
		
		sim s=new sim("Airtel","4G",399.0,9876542130l);
		s.detailsOfSim();
		System.out.println("************");
		
		System.out.println(s.getType(9876542130l,031111));//Printing getter()
		System.out.println("************");
		
		s.setNetworkType("Airtel","4G","5G",031112); //Cannot Print setter()
		s.detailsOfSim(); //For Checking Updation Calling detailsOfMobile()
		System.out.println("************");
	}

}

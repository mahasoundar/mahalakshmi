package week1.day1;

public class Mobile1 {

	private void makeCall() {
	     String mobileModel="Redmi";
	     float mobileWeight=17.50f;
	     System.out.println("Redmi");
	     System.out.println("Weight");
}
	
	private void sendMsg() {
		 boolean FullCharged=true;
		 int mobileCost=25000;
		 System.out.println("FullyCharged");
		 System.out.println("MobileCost");
}
	
	public static void main(String[] args) {
		Mobile1 obj=new Mobile1();
		obj.makeCall();
    	obj.sendMsg();
    	System.out.println("This is my Mobile");
	}
	

}

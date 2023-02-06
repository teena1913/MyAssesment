package week1.day1;

public class Mobile {
	String sendSms = "hi";
	String makeCall ="123";
	public void entersendSms() {
		System.out.println("enter the message "+sendSms);
	}
	public void entermakeCall() {
		System.out.println("call "+makeCall);
		
	}

	public static void main(String[] args) {
		Mobile features = new Mobile();
		features.entersendSms();
		features.entermakeCall();

	}

}

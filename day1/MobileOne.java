package week1.day1;

public class MobileOne {
	public void MakeCall() {
		String Mobilemodel="oppo ak 1";
	    float Mobileweight=10.5f;
	    System.out.println("Model of mobile is:"+Mobilemodel);
	    System.out.println("Weigth of mobile is:"+Mobileweight);
	}
	public void Sendmsg() {
		boolean IsFullycharged= true;
		int Mobcost= 10000;
		System.out.println("charged fully:"+IsFullycharged);
		System.out.println("Cost of Mobile is:"+Mobcost);
	}

	public static void main(String[] args) {
		MobileOne choice=new MobileOne();
		choice.MakeCall();
		choice.Sendmsg();
		System.out.println("This is my mobile");
		}

}

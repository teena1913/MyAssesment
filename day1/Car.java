package week1.day1;

public class Car {
	public void applybreak(){
		System.out.println("applied break");
		
	}
	public void soundhorn() {
		System.out.println("sound horn");
	}

	public static void main(String[] args) {
		Car model=new Car();
		model.applybreak();
		model.soundhorn();

	}

}

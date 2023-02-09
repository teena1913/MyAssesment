package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		int sum=8;
		int firstnum=0;
		int secondnum=1;
		for(int i=0;i<6;i++) {
			sum= firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}
		
	}
}

package simpleprogram;

public class Basic19 {
	public static void main(String[]args) {
		int i=2012;
		if(i%4==0&&i%100!=0||i%400==0){
			System.out.println("leap year");
			}else {
				System.out.println("not a leap year");
			}
	}

}

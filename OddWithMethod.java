import java.util.Scanner;
public class OddWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to make this print horiz?
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a city: ");
		String cityIn = keyboard.nextLine();
		Odd(cityIn);

	}
	
	
		public static void Odd(String x){
		for(int i = 0; i < x.length();i = i + 2) {
		 char y = x.charAt(i);
		 System.out.print(y);
		}
		
		
		

}
}
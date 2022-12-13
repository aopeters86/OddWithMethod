import java.util.Scanner;
public class OddWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a city: ");
		String cityIn = keyboard.nextLine();
		
		for(int i = 0; i < cityIn.length();i = i + 2) {
			System.out.print(cityIn.charAt(i));
		}

	}

}

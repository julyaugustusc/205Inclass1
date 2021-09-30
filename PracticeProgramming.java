import java.util.Scanner;
public class PracticeProgramming {
	public static void main(String arg[]) {
		Scanner Scan = new Scanner(System.in);
		int num;
		int evenCount = 0;
		int oddCount = 0;
		while(Scan.hasNextInt()) {
			num = Scan.nextInt();
			if(num % 2 ==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("Even integer count is " + evenCount);
		System.out.println("Odd integer count is " + oddCount);
	}

}

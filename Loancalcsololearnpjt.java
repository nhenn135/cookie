import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		// 
		  for (int x = 1; x <= 3; x++){
            amount = amount * 9 / 10;
        }
                
        System.out.println(amount);
	}
}


//calculation 3 periods. Interest 10% of the remaining loan amount each month. Sololearn project

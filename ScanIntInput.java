package practice;
import java.util.Scanner;

public class ScanIntInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter nums:");
		int n = 6 ;
		int sum = 0;
		int count =0;
		for(int i = 1;i <= n; i++){
			sum += scan.nextInt();
			count++;
		}

		System.out.println(sum/count);
	}

}

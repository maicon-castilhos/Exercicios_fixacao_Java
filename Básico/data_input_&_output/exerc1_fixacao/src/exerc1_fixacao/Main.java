package exerc1_fixacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SOMA1 = sc.nextInt();
		int SOMA2 = sc.nextInt();
		int TOTAL = SOMA1 + SOMA2;
		
		System.out.println("Soma total: " + TOTAL);
		
		sc.close();

	}

}

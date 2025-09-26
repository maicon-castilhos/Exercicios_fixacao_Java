import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberPiece1 = sc.nextInt();
		int quantity1 = sc.nextInt();
		double pricePiece1 = sc.nextDouble();
		int numberPiece2 = sc.nextInt();
		int quantity2 = sc.nextInt();
		double pricePiece2 = sc.nextDouble();
		
		double cost1 = quantity1 * pricePiece1;
		double cost2 = quantity2 * pricePiece2;
		double finalCost = cost1 + cost2;
		
		Locale LocaleBR = Locale.forLanguageTag("pt-BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(LocaleBR);
		
		System.out.println("Valor a pagar " + nf.format(finalCost));	
		//não pode usar printf com nf.format, porque ele converte o número em string na saída
		
		sc.close();
	}

}

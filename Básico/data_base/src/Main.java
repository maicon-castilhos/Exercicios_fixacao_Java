import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Entrada
        String hc = sc.nextLine();		
        int id = sc.nextInt();
        int workHour = sc.nextInt();
        int profitHour = sc.nextInt();
        
        // Cálculo do salário
        double profit = profitHour * workHour;
        
        // Formato moeda BR
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        
        // Saída
        System.out.println("Dados de: " + hc);
        System.out.printf(
            "Matricula: %d, horas trabalhadas: %d, ganho/hr: %d, salário estimado: %s%n",
            id, workHour, profitHour, nf.format(profit)
        );
        
        sc.close();
    }
}

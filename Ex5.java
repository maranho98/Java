import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numero, horas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("N�mero: "+ numero);
		System.out.printf("Sal�rio: U$ %.2f%n", salario);
		
		sc.close();
	}
}
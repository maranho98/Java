import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, R, pi= 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("Resultado: %.4f%n", A);

		sc.close();
	}

}

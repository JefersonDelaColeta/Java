package apllication;

import java.util.Locale;
import java.util.Scanner;
import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Students students = new Students();
		
		System.out.println("Name: ");
		students.name = sc.nextLine();
		
		System.out.println("Nota um: ");
		students.n1 = sc.nextFloat();
		
		System.out.println("Nota dois: ");
		students.n2 = sc.nextFloat();
		
		System.out.println("Nota tres: ");
		students.n3 = sc.nextFloat();
		
		System.out.printf("Final Grade: %.2f", students.notaFinal());
		
		if(students.notaFinal() > 60.0) {
			System.out.println("\nPASS");
		}else {
			System.out.println("\nFAILED");
			System.out.printf("\nMISSING %.2f POINTS", students.missing());
		}
		
		sc.close();
	}

}

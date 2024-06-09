package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Name: ");
		funcionario.name = sc.nextLine();

		System.out.println("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.employee());

		System.out.println();
		System.out.println("Wich percentage to increase salary? ");
		funcionario.percent = sc.nextDouble();

		System.out.println();
		System.out.println("Update data: " + funcionario.name + ", $ " + funcionario.percent());

		sc.close();
	}

}

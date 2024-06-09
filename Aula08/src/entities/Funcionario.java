package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	public double percent;

	public double employee() {
		return grossSalary - tax;
	}

	public double percent() {
		return grossSalary += (grossSalary * percent) / 100 - tax;

	}
}

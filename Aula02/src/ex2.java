import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;
		float a;

		num = sc.nextInt();
		a = num%2;
		
	
		if(a==0){
			System.out.println("O valor é par.");
		}else{
			System.out.println("O valor é impar");
		}


		sc.close();
	}
}
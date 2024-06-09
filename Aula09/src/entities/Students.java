package entities;

public class Students {
	public String name;
	public float n1;
	public float n2;
	public float n3;
	
	public float notaFinal() {
		return n1+n2+n3;
	}
	public float missing() {
		return 60-notaFinal();
	}

}

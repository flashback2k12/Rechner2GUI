package Main;

public class GlobalVariable {

	public static GlobalVariable gloVar = new GlobalVariable();
	
	private double zahl1;

	private double zahl2;

	public double getZahl1() {
		return zahl1;
	}

	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	} 
	
}

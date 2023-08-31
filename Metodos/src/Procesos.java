import javax.swing.JOptionPane;

public class Procesos {
	public void sumar() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
		int resultado = num1 + num2;
		System.out.println("La suma es: "+resultado);
	}
	public void restar(int num7,int num8) {
		int restar = num7 - num8;
		System.out.println("La resta es: "+restar);
	}
	public int multiplicar(int num3, int num4) {
		int multiplicar = num3 * num4;
		System.out.println("La multiplicacion es: "+multiplicar);
		return multiplicar;
	}
	public double dividir(){
		int num5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		int num6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
		double dividir = num5/num6;
		System.out.println("La division es: "+dividir);
		return dividir;
	}
}

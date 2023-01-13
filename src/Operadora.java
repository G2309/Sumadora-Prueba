import java.util.Scanner;
/**
 * Es el main del programa, donde se suman 2 numeros
 */

/**
 * @author gustavo
 *
 */
public class Operadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sumadora sum = new Sumadora();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa un numero para sumar");
		int a = s.nextInt();
		System.out.println("Ingresa un segundo numero para sumar");
		int b = s.nextInt();
		sum.sumar(a,b);
		
	}

}

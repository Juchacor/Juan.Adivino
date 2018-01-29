package juan.adivino;

import java.util.Scanner;

/**
 * La clase JuanAdivino es parte del proyecto colaborativo de la unidad 7: Control de versiones II
 * @author Juan
 * @version 28/01/2018
 */

public class JuanAdivino {
	
		/**
		* 
		* @param args Es el m�todo principal el cual genera un n�mero aleatorio, el cu�l tenemos que adivinarlo.
		*/
	    public static void main(String[] args) {
	    	/**
	    	 * int n ser� el valor inicial de int
	    	 * int x valor que asigna el programa de manera aut�matica
	    	 */
	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        /**
	         * El programa nos ir� pidiendo que introduzcamos un valor x y mediante un if nos compara el valor introdu-
	         * cido con el n�mero aleatorio.
	         */
	        do {
	            System.out.print("\nIntroduce el valor de X: ");
	            n = sc.nextInt();
	            if (n > x) {
	                System.out.print("Te pasaste Amigo");
	            } else if (n < x){
	                System.out.print("Casi cerca ...");
	            }
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	        sc.close();
	    }
}

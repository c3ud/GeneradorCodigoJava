package Musica;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author VELOZA
 * @see Para este ejercicio utilizar� tres pricipios como son el principio de
 *      responsabilidad �nica, Dise�o por contrato haciendo y abierto/cerrado.
 * 
 */
public class Parranda {
	static int numRamdom_banda;
	static int numRamdom_musicos;
	static Guitarra guitarra = new Guitarra();
	static Triple cord�fono = new Triple();
	static Trompeta melodia = new Trompeta();
	static Maracas percuci�n = new Maracas();
	static Violin armon�a = new Violin();
	static String[] banda;
	static Scanner intro = new Scanner(System.in);

	public static void main(String[] arg) throws IOException {
		double continuar = 1;
		boolean opcion = true;

		/**
		 * creo objetos.
		 */

		while (opcion == true) {

			String nueva_guitarra = guitarra.getLlamar_guitarra();
			String nuevo_triple = cord�fono.getLlamar_triple();
			String nueva_trompeta = melodia.getLlamar_trompeta();
			String nueva_maracas = percuci�n.getLlamar_maracas();
			String nueva_violon = armon�a.getLlamar_violin();

			banda = new String[] { nueva_guitarra, nuevo_triple,
					nueva_trompeta, nueva_maracas, nueva_violon };
			numRamdom_banda = (int) Math.floor(Math.random() * 15);
			int i = 0;

			while (i <= numRamdom_banda) {
				numRamdom_musicos = (int) Math.floor(Math.random() * 4);
				System.out.println("llego un m�sico " + " el toca: "
						+ banda[numRamdom_musicos]);
				i++;
			}
			System.out.println("");
			System.out.println("la banda esta completa y somos: "
					+ (numRamdom_banda + 1));
			System.out.println("");
			System.out.println("\t1.- Tocar");
			System.out.println("\t2.- Afinar");
			int menu = intro.nextInt();
			afinar afinando = new afinar();
			Tocar tocando = new Tocar(afinando);
			switch (menu) {
			case 1:
				tocando.isValidar_Tocar();
				break;
			case 2:
				afinando.setValidar_afinacion(true);
				tocando.isValidar_Tocar();
				break;

			default:
				break;
			}
			// retorno al inicio o termina programa.
			System.out.println("\t.-�Desea continuar?");
			continuar = intro.nextInt();
			if (continuar == 0) {
				opcion = false;
			}
		}
	}

}

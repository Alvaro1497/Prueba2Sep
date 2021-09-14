package pruebados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int Z = 0;
		int N = 123;
		int q = 1000;

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese clave");
		N = sc.nextInt();
		do {

			if (N == 123) {
				System.out.println(" 1) Realizar transferencia");
				System.out.println(" 2) Consultar transacciones");
				System.out.println(" 3) Salir");
				Z = sc.nextInt();
				if (Z == 1) {
					System.out.println("ingrese la cuenta de destino ");
					Z = sc.nextInt();
					System.out.println("monto a transferir.");
					Z = sc.nextInt();
					int R = q - Z;
					System.out.println("Su nuevo saldo es: " + R);

				}
				if (Z == 2) {
					System.out.println("En este momento se están procesando las transacciones, intente más tarde ");
					System.out.println("PRECIONE 3 PARA SALIR");
					Z = sc.nextInt();
				}

			} else {
				System.out.println("ingrese clave");
				N = sc.nextInt();
			}

		} while (Z != 3);

	}

}

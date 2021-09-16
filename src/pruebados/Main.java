package pruebados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String claveIngresada;
		int Z = 0;

		int q = 1000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese clave");
		claveIngresada = sc.nextLine();

		do {

			if (claveIngresada.equals("85DB")) {
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
				claveIngresada = sc.nextLine();
			}

		} while (Z != 3);

	}

}

import java.util.Random;
import java.util.Scanner;

public class juego21 {
	public static void main(String[] args) throws InterruptedException {
		Scanner leer = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Bienvenido \n ¿Quieres jugar? (S/N)");
		String opc = leer.nextLine();
		String r = null;
		if (opc.equals("S")) {

			int cc1 = rnd.nextInt(11) + 1;
			
			System.out.println("Mis cartas son " + cc1);
			Thread.sleep(2000);
			if (cc1 == 11) {
				int opcc = rnd.nextInt(2) + 1;
				if (opcc == 2) {
					cc1 = 1;
					System.out.println("Tomare esta A como un 1");

				} else {

					cc1 = 11;
					System.out.println("Tomare esta A como un 11");
				}
			}
			int cu1 = rnd.nextInt(11) + 1;
			int cu2 = rnd.nextInt(11) + 1;
			int ct = 0;
			System.out.println("Tus cartas son " + cu1 + " y " + cu2);
			if (cu1 == 11 || cu2 == 11) {
				System.out.println("Que valor tendra el A");
				int opc1 = leer.nextInt();
				while (opc1 != 11 & opc1 != 1) {
					System.out.println("Ingresar 11 o 1");
					opc1 = leer.nextInt();
				}
				if (opc1 == 11) {
					if (cu1 == 11 & cu2 != 11) {

						ct = cu2 + 11;
						System.out.println("La suma de sus cartas actuales es " + ct);

					} else if (cu1 != 11 & cu2 == 11) {
						ct = cu1 + 11;
						System.out.println("La suma de sus cartas actuales es " + ct);
					}

					// Aqui me quede lol
				} else if (opc1 == 1) {
					if (cu1 == 11 & cu2 != 11) {
						ct = cu2 + 1;
						System.out.println("La suma de sus cartas actuales es " + ct);

					} else if (cu1 != 11 & cu2 == 11) {
						ct = cu1 + 1;
						System.out.println("La suma de sus cartas actules es " + ct);
					}

				}
			}
			System.out.println("Quieres otra carta (S/N)");
			r = leer.nextLine();
			while (r.equals("S")) {

			}

		}
	}
}
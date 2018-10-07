import java.util.Scanner;
import java.util.Random;

public class conecta3 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner leer = new Scanner(System.in);
		int uf = 0;
		int cf = 0;
		String[][] espacio = { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };
		int c = 0, c1 = 0;
		for (c = 0; c <= 2; c++) {
			for (c1 = 0; c1 <= 2; c1++) {
				System.out.print(espacio[c][c1] + " ");

			}
			System.out.println();

		}

		System.out.println("Seleccione un cuadrante ((1,2,3),(4,5,6),(7,8,9))");

		int opc = leer.nextInt();

		if (opc == 1) {
			espacio[0][0] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 2) {
			espacio[0][1] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 3) {
			espacio[0][2] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 4) {
			espacio[1][0] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 5) {
			espacio[1][1] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 6) {
			espacio[1][2] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 7) {
			espacio[2][0] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 8) {
			espacio[2][1] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		} else if (opc == 9) {
			espacio[2][2] = "x";
			for (c = 0; c <= 2; c++) {
				for (c1 = 0; c1 <= 2; c1++) {
					System.out.print(espacio[c][c1] + " ");

				}
				System.out.println();

			}
		}
		System.out.println("Ahora es turno de la computadora");
		int co = 0;
		int a=0;
		while (a<1) {
			co = rnd.nextInt(9) + 1;
			int m=0;
			while ( m < 1) {
				if (co == 1 & co != opc) {
					espacio[0][0] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;
				} else if (co == 2 & co != opc) {
					espacio[0][1] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				}

				else if (co == 3 & co != opc) {
					espacio[0][1] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;					
					a=a+1;


				} else if (co == 4 & co != opc) {
					espacio[1][0] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				} else if (co == 5 & co != opc) {
					espacio[1][1] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				} else if (co == 6 & co != opc) {
					espacio[1][2] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				} else if (co == 7 & co != opc) {
					espacio[2][0] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				} else if (co == 8 & co != opc) {
					espacio[2][1] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				} else if (co == 9 & co != opc) {
					espacio[2][2] = "o";

					for (c = 0; c <= 2; c++) {
						for (c1 = 0; c1 <= 2; c1++) {
							System.out.print(espacio[c][c1] + " ");

						}
						System.out.println();

					}
					m++;
					a=a+1;

				}
			}

		}
	}

}

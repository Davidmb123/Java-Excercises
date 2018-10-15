
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class dados {
	public static void main(String[] args) throws InterruptedException {
		JOptionPane ven = new JOptionPane();
		Random rnd = new Random();

		Scanner leer = new Scanner(System.in);
		int dialogresu = JOptionPane.showConfirmDialog(null, "Bienvenido ¿Quieres jugar?");
		if (dialogresu == 0) {
			logic obj = new logic();
			logic objc = new logic();

			do {
				if (dialogresu == 0) {
					obj.dados1();
					System.out.println("Desea seguir jugando?");
					dialogresu = JOptionPane.showConfirmDialog(null, "Seguir jugando?");
					 if (dialogresu==1){
						JOptionPane.showMessageDialog(ven, "Okei u.u");
						
					}
	
					 
					 
				}
			} while (dialogresu == 0);
			
		}else {
					JOptionPane.showMessageDialog(ven, "Okei u.u");
					
				}
		}
	}


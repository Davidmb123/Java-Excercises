import java.util.Random;
import java.util.Scanner;
public class logic {

	
	
	public void dados1() throws InterruptedException {
		Scanner leer=new Scanner(System.in);

		Random rnd=new Random();
		
		System.out.println("Presione Enter");
		String key=leer.nextLine();
		if(key.isEmpty()) {
			int dado1=rnd.nextInt(6)+1;
			int dado2=rnd.nextInt(6)+1;
			Thread.sleep(1000);
			System.out.println("Sus dados son "+dado1+" y "+dado2);
			Thread.sleep(1000);
			int dadoa1=rnd.nextInt(6)+1;
			int dadoa2=rnd.nextInt(6)+1;
			Thread.sleep(1000);
			System.out.println("Mis dados son "+dadoa1+" y "+dadoa2);
			Thread.sleep(1000);
			int dadot=dado1+dado2;
			int dadota=dadoa1+dadoa2;
			if(dadot>dadota) {
				System.out.println("Usted gano con "+dadot+" puntos");
				
			}else if(dadot<dadota) {
				System.out.println("Usted perdio, yo gane con "+dadota+" puntos");
				
			}else if(dadot==dadota) {
				System.out.println("Empate");
			}
		}
		
		
		
	}

		
		
		
	

	
	

	
}

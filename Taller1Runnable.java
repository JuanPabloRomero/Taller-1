import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller1Runnable implements Runnable{

	private static int limiteSuperior;
	public Taller1Runnable(int arg) {
		try {
			for(int i = arg; i <= limiteSuperior; i+=2)
			{
				System.out.println(i);
				Thread.sleep(50);
			}
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
	public void run() {
		
	}
	
	
	public static void main (String [ ] args) throws IOException
	{
    
		System.out.println("Indique el limite superior deseado");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		limiteSuperior = Integer.parseInt(reader.readLine());
		System.out.println("El limite superior es: " + limiteSuperior);
		Thread t2 = new Thread(new Taller1Runnable(2));
		Thread t1 = new Thread(new Taller1Runnable(1));
		t2.start();
		t1.start();
		
    
	}
	
}

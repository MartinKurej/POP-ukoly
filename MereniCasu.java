import java.lang.*;
 public class MereniCasu {
 public static void main(String[] args)
 {    
    long startTime = System.nanoTime(); 
	int i;
	System.out.println ("Prvních 10 čísel je:");
	for (i=1;i<=10;i++)
	{      
		System.out.println (i);
	}
		long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Odhadovaný čas (v nanosekundách) k získání prvních 10ti přirozených čísel: "+estimatedTime);
  }
}
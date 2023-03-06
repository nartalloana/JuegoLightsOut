import java.util.Scanner;

	public class LightsOut {
		 public int size;
		 public boolean[][] lights;
		 private Scanner scanner = new Scanner(System.in);
	    
	    public void jugar() {
	    	System.out.println("Introduzca la dimensión del tablero: ");
	    	size=scanner.nextInt();
	    	lights = new boolean[size][size];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                lights[i][j] = false;
	            }
	        }
        }
    }
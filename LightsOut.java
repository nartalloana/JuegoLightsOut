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

			while (true) {
	            System.out.println();
	            imprimirTablero();

	            System.out.print("Introduzca fila y columna: ");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();
	            permuta(row, col);

	            if (seAcabo()) {
	                System.out.println("FINOOO CHAVAL!!!");
	                break;
	            }
	        }
        }
			private void permuta(int row, int col) {
	        if (row >= 0 && row < size && col >= 0 && col < size) {
	            lights[row][col] = !lights[row][col];
	            if (row > 0) {
	                lights[row - 1][col] = !lights[row - 1][col];
	            }
	            if (row < size - 1) {
	                lights[row + 1][col] = !lights[row + 1][col];
	            }
	            if (col > 0) {
	                lights[row][col - 1] = !lights[row][col - 1];
	            }
	            if (col < size - 1) {
	                lights[row][col + 1] = !lights[row][col + 1];
	            }
	        }
	    }

		private boolean seAcabo() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (lights[i][j]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

    }
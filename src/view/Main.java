package view;

import controller.ThreadID;
import controller.ThreadMatriz;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String menu = """
				1 - Executar 5 threads
				2 - Acumular valores da matriz
				9 - Finalizar
				""";

		int opc = 0;
		while(opc != 9) {
			System.out.println(menu);
			opc = scan.nextInt();
			
			switch (opc) {
				case 1://Exercício 1
					for (int i = 0; i < 5; i++) {
						Thread tid = new ThreadID();
						tid.start();
					}
					break;
				case 2://Exercício 2
					int[][] mat = new int[3][5];
					Random r = new Random();
					
					for (int x = 0; x < 3; x++) {
						for(int y = 0; y < 5; y ++) {
							mat[x][y] = r.nextInt(1,200);							
						}
					}

					for(int i = 0; i < 3; i++) {
						Thread tSum = new ThreadMatriz(mat[i], i+1);
						tSum.start();
					}
					break;
				case 9:
					System.out.println("Finalizando");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}
		scan.close();
	}
}
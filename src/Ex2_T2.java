import java.util.Random;
import java.util.Scanner;

//Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
//valores inteiros aleatórios (gerados a partir da classe Random) e, em seguida, faça a impressão dos 
//elementos no formato de uma tabela (impressão como apresentado durante as aulas). Após a 
//impressão o seu programa deverá trocar os elementos armazenados no triângulo superior da matriz 
//com os elementos armazenados no triângulo inferior. Imprima novamente a matriz no vídeo para 
//conferência. Veja o exemplo abaixo indicando como a troca dos elementos deverá ser realizada. ]

public class Ex2_T2 {

	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		int aux;
		
		gerar(matriz);
		invertido(matriz, aux = 0);
		
		
	
		}

	
	public static int[][] gerar (int[][] matriz){
		Random gerador = new Random();
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				matriz[i][j] = gerador.nextInt(20);
				System.out.print(matriz[i][j] + "\t");
				
				}
			System.out.println();
			}
			System.out.println();
			return matriz;
		}
	public static void invertido (int matriz [][], int aux) {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				if(i>j){
					aux = matriz[i][j];
					matriz[i][j] = matriz[j][i];
					matriz[j][i] = aux;
					System.out.print(matriz[i][j]+"\t");
				}
				
				else {
					System.out.print(matriz[j][i]+"\t");
				}
			}
			System.out.println();
		}
		
		
	}
}
	
	
	



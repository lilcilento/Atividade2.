import java.util.Scanner;

public class Ex1_T2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a;
		int c;
		
		System.out.println("Dimensões da Matriz: ");
		a = tec.nextInt();	
		System.out.println("Dimensões da Matriz: ");
		c = tec.nextInt();
		
		int b;
		int aux = 0;
		int[][] x = gerar(a,c);
		imprimir(x, a, c);
		check(x, a, c);
				
		}

	public static int[][] gerar (int a, int c){
		Scanner tec = new Scanner(System.in);
		int[][] x = new int [a][c];
		for(int i = 0; i < a; i++){
			for(int j = 0; j < c; j++){
				System.out.println("Informe valores da matriz: ");
				x[i][j] = tec.nextInt();
			}
		}
		return x;
	}
	
	public static void imprimir (int x[][], int a, int c) {
		for(int i = 0; i < a; i++){
			for(int j = 0; j < a; j++){
				System.out.print(x[i][j] + "\t");

	}
			System.out.println();
		}
				
		}

	public static void check(int x[][], int a, int c) {
		int aux = 0, b;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		b = tec.nextInt();
		for(int i = 0; i < a; i++){
			for(int j = 0; j < a; j++){
			if(x[i][j] == b) {
				System.out.println("Valor está na cordenada: " + "Linha: " + i + "Coluna: " + j);
				aux++;		
			}
			}
	}
			if(aux == 0) {
				System.out.println("X não se encontra na matriz");
				
			}
	}
		
	}
	



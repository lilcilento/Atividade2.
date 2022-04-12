import java.util.*;

public class Ex3_T2 {
	//Escreva um programa em Java para fazer a corre��o de uma prova contendo 10 
	//quest�es de m�ltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o n�mero de alunos 
	//dever� ser informado pelo usu�rio da aplica��o). O programa dever� gerar as respostas dos alunos 
	//de forma aleat�ria e as respostas dever�o ser impressas no v�deo no formato de uma tabela 
	//(conforme apresentado durante as aulas). Em seguida, o programa dever� ler o gabarito da prova 
	//(a entrada dever� ser informada pelo usu�rio da aplica��o). O seu programa dever� emitir um relat�rio 
	//contendo a nota de cada aluno e a sua situa��o (aprovado ou reprovado) considerando 
	//que a nota para aprova��o dever� ser maior ou igual a 7. 

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int aux, nr;
		String [] gabarito = new String[10];
		String [] respostas = new String[10];
		
		System.out.println("Quantidade de Alunos: ");
		nr = key.nextInt();
		
		gab(gabarito);
		corrigir(gabarito, respostas, nr);	
	}

	public static void gab (String[] gabarito) {
		Scanner key = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Resposta da Quest�o " + (i + 1) + " ?");
			gabarito[i]=key.next();
		}
	}
	public static void corrigir (String[] gabarito, String[] respostas, int nr) {
		Scanner key = new Scanner (System.in);
		int aux, nota = 0;
		Random y = new Random();
		
		for (int i = 0;i < nr; i++) {
			for (int j = 0; j< 10; j++) {
				aux = y.nextInt(5);
				if (aux == 0) {
					respostas[j] = "a";
				}
				if ( aux == 1) {
					respostas[j] = "b";
				}
				if ( aux == 2) {
					respostas[j] = "c";
				}
				if ( aux == 3) {
					respostas[j] = "d";
				}
				if ( aux == 4) {
					respostas[j] = "e";
				}
				System.out.print(respostas[j]+ "\t");
			}
			System.out.println();
			
			for (int j =0; j< gabarito.length; j++) {
				if(respostas[j].equals(gabarito[j])) {
					nota++;
				}
			}
			System.out.println();
			
			if (nota >= 7) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado!");
			}
			nota = 0; 
		}
	}

}

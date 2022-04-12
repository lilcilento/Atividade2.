import java.util.*;

public class Ex3_T2 {
	//Escreva um programa em Java para fazer a correção de uma prova contendo 10 
	//questões de múltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o número de alunos 
	//deverá ser informado pelo usuário da aplicação). O programa deverá gerar as respostas dos alunos 
	//de forma aleatória e as respostas deverão ser impressas no vídeo no formato de uma tabela 
	//(conforme apresentado durante as aulas). Em seguida, o programa deverá ler o gabarito da prova 
	//(a entrada deverá ser informada pelo usuário da aplicação). O seu programa deverá emitir um relatório 
	//contendo a nota de cada aluno e a sua situação (aprovado ou reprovado) considerando 
	//que a nota para aprovação deverá ser maior ou igual a 7. 

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
			System.out.println("Resposta da Questão " + (i + 1) + " ?");
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

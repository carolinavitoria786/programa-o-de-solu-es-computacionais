package Main;

	import java.util.Scanner;

	public class PesquisaSequencial {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] vetor = new int[10];

	        // Leitura dos números
	        System.out.println("Digite 10 números:");
	        for (int i = 0; i < 10; i++) {
	            vetor[i] = scanner.nextInt();
	        }

	        while (true) {
	            System.out.println("\nEscolha o algoritmo de busca:");
	            System.out.println("1. Sequencial");
	            System.out.println("2. Sequencial com Sentinela");
	            System.out.println("0. Sair");

	            int escolha = scanner.nextInt();

	            if (escolha == 0) {
	                System.out.println("Saindo do programa.");
	                break;
	            }

	            System.out.print("Digite o número a ser pesquisado: ");
	            int numeroPesquisado = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    pesquisaSequencial(vetor, numeroPesquisado);
	                    break;
	                case 2:
	                    pesquisaSequencialComSentinela(vetor, numeroPesquisado);
	                    break;
	                default:
	                    System.out.println("Escolha inválida.");
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    // Algoritmo de busca sequencial
	    private static void pesquisaSequencial(int[] vetor, int numeroPesquisado) {
	        int comparacoes = 0;
	        for (int i = 0; i < vetor.length; i++) {
	            comparacoes++;
	            if (vetor[i] == numeroPesquisado) {
	                System.out.println("Número encontrado na posição " + i);
	                System.out.println("Número de comparações: " + comparacoes);
	                return;
	            }
	        }
	        System.out.println("Número não encontrado");
	        System.out.println("Número de comparações: " + comparacoes);
	    }

	    // Algoritmo de busca sequencial com sentinela
	    private static void pesquisaSequencialComSentinela(int[] vetor, int numeroPesquisado) {
	        int comparacoes = 0;

	        // Adiciona um sentinela no final do vetor
	        int tamanho = vetor.length;
	        int sentinela = vetor[tamanho - 1];
	        vetor[tamanho - 1] = numeroPesquisado;

	        int i = 0;
	        while (vetor[i] != numeroPesquisado) {
	            comparacoes++;
	            i++;
	        }

	        // Restaura o valor original na última posição
	        vetor[tamanho - 1] = sentinela;

	        if (i < tamanho - 1) {
	            System.out.println("Número encontrado na posição " + i);
	            System.out.println("Número de comparações: " + comparacoes);
	        } else {
	            System.out.println("Número não encontrado");
	            System.out.println("Número de comparações: " + comparacoes);
	        }
	    }
	}

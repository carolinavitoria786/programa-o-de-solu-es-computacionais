package Main;

import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        // Leitura dos números (ordenados)
        System.out.println("Digite 10 números ordenados:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nEscolha o número a ser pesquisado (ou 0 para sair):");
            int numeroPesquisado = scanner.nextInt();

            if (numeroPesquisado == 0) {
                System.out.println("Saindo do programa.");
                break;
            }

            int comparacoes = pesquisaBinaria(vetor, numeroPesquisado);

            if (comparacoes != -1) {
                System.out.println("Número encontrado na posição " + comparacoes);
                System.out.println("Número de comparações: " + comparacoes);
            } else {
                System.out.println("Número não encontrado");
            }
        }

        scanner.close();
    }

    // Algoritmo de busca binária
    private static int pesquisaBinaria(int[] vetor, int numeroPesquisado) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int comparacoes = 0;

        while (inicio <= fim) {
            comparacoes++;

            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numeroPesquisado) {
                return meio; // Número encontrado
            } else if (vetor[meio] < numeroPesquisado) {
                inicio = meio + 1; // Pesquisa na metade superior
            } else {
                fim = meio - 1; // Pesquisa na metade inferior
            }
        }

        return -1; // Número não encontrado
    }
}


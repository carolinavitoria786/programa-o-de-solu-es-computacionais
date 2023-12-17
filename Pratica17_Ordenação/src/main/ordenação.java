package main;

	import java.util.Arrays;
	import java.util.Scanner;

	class ordenacao {
	   
	    static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	  
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    
	                    minIndex = j;
	                }
	            }
	           
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }
   
	    static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	}

	public class ordenação {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        do {
	            System.out.println("Escolha o método de ordenação:");
	            System.out.println("1. Bubble Sort");
	            System.out.println("2. Selection Sort");
	            System.out.println("3. Insertion Sort");
	            System.out.println("0. Sair");

	            int choice = scanner.nextInt();

	            if (choice == 0) {
	                System.out.println("Programa encerrado.");
	                break;
	            }

	            int[] vetor = new int[10];
	            System.out.println("Informe 10 números para serem ordenados:");
	            for (int i = 0; i < 10; i++) {
	                vetor[i] = scanner.nextInt();
	            }

	            switch (choice) {
	                case 1:
	                    ordenacao.bubbleSort(vetor);
	                    break;
	                case 2:
	                    ordenacao.selectionSort(vetor);
	                    break;
	                case 3:
	                    ordenacao.insertionSort(vetor);
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    continue;
	            }

	            System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

	            System.out.println("Deseja ordenar outro vetor? (1 para sim, 0 para não)");
	        } while (scanner.nextInt() == 1);

	        scanner.close();
	    }
	}


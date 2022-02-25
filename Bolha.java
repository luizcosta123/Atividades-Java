//Nome: Luiz Afonso Silva Costa.

import java.util.Scanner;

public class Bolha {
	
	public int vetor[];
	public int Tamanho;
	
	Scanner sc = new Scanner(System.in);
	
	public void RecebeVetor() {
		
		System.out.println("Digite o tamanho do vetor: ");
		Tamanho = sc.nextInt();
		vetor = new int [Tamanho];
		
		System.out.println("Digite o seu vetor: ");
		
		for (int i = 0; i < Tamanho; i++) {
			
		System.out.println("[" + i + "] = ");
		vetor[i] = sc.nextInt();
			
		}
		
	}
	
	public void BubbleSort(int aux) {
		
		for (int i = Tamanho - 1; i > 0; i--) { // Tamanho = N ou n;
			
			for(int j = 0; j < i; j++) {
				
				if(vetor[j] > vetor[j+1]) {
					
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
					
				}
				
			}
			
		}
		
	}
	
	public void BubbleSort2(int aux, int troca) {
		
		for (int i = Tamanho - 1; i > 0; i--) { // Tamanho = N ou n;
			troca = 0;
			
			for(int j = 0; j < i; j++) {
				
				if(vetor[j] > vetor[j+1]) {
					
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
				troca = 1;
					
				}
				
			if (troca == 0) break;
				
			}
			
		}
		
	}
	
	public void Imprime() {
		
		for (int i = 0; i < Tamanho; i ++) {
			
			System.out.print(vetor[i] + "\t");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Bolha B = new Bolha();
		
		B.RecebeVetor();
		
		System.out.println("");
		
		System.out.println("Método BubbleSort1:\n");
		B.BubbleSort(0);
		B.Imprime();
		
		System.out.println("\n");
		
		System.out.println("Método BubbleSort2:\n");
		B.BubbleSort2(0, 0);
		B.Imprime();
		
	}
	
}

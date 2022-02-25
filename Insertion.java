import java.util.Scanner;

public class Insertion {
			
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
			
			public void InsertionSort() {
				
				int i, chave, j;
				
				for(i = 1; i < Tamanho; i++) {
					
					chave = vetor[i];
					j = i - 1;
					
					while ((j >= 0) && (vetor[j] > chave)) {
						
						vetor[j + 1] = vetor[j];
						j--;
						
					}
					
					vetor[j + 1] = chave;
					
				}
				
			}
			
			public void Imprime() {
				
				for (int i = 0; i < Tamanho; i ++) {
					
					System.out.print(vetor[i] + "\t");
					
				}
				
			}
			
			public static void main(String[] args) {
				
				
				Insertion I = new Insertion();
				
				I.RecebeVetor();
				
				System.out.println("");
				
				System.out.println("Método Insertion Sort:\n");
				I.InsertionSort();
				I.Imprime();
				
			}
	
}

import java.util.Scanner;

public class Selection {
		
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
		
		public void SelectionSortDecrescente() {
			
			int i, j, i_maior, min;
			
			for(i = 0; i < Tamanho - 1; i++) {
			i_maior = i;
			
				for(j = i + 1; j < Tamanho; j++)  
					
					if(vetor[j] > vetor[i_maior]) 
					i_maior = j;
					
					min = vetor[i_maior];
					vetor[i_maior] = vetor[i];
					vetor[i] = min;
					
			}
			
		}
		
		public void Imprime() {
			
			for (int i = 0; i < Tamanho; i ++) {
				
				System.out.print(vetor[i] + "\t");
				
			}
			
		}
		
		public static void main(String[] args) {
			
			
			Selection S = new Selection();
			
			S.RecebeVetor();
			
			System.out.println("");
			
			System.out.println("Método Selection Sort (Decrescente):\n");
			S.SelectionSortDecrescente();
			S.Imprime();
			
		}
	
}

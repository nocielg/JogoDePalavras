import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	
	//Lendo palavras em arquivos 
		public String lendoArquivo(){
		//String vet[] = new String[10];
		// usar array list em vez de vetor acims
			
		// Fazendo a instância do ArrayList que vai receber as linhas lidas do arquivo
		ArrayList arraylist = new ArrayList();
		int i = 0;
		// Fazendo a leitura do arquivo que armazenará a lista de palavras
		try {
			FileReader arq = new FileReader("/home/gleisson/workspace/jogodepalavras/files.txt");
			BufferedReader lerArq = new BufferedReader(arq);
	 
			String linha = lerArq.readLine();
			// lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {
				//System.out.printf("%s\n", linha);
				linha = lerArq.readLine(); // lê da segunda até a última linha
				//O arraylist recebe todas as linhas lidas do arquivo
				//vet[i] = linha;
				arraylist.add(linha);
				//i++;
			}
	 
			arq.close();
	    	} 
			catch (IOException e) {
				System.err.printf("Erro na abertura do arquivo: %s.\n",
						e.getMessage());
				
			}
		
			
			finally{
				//Gerando um número aleatório para retornar uma dada palavra entre 1 a 10 aleatoriamente
				int num = 1;
				Random randomico = new Random();
				/*for (int j = 1; j<11; j++){
					randomico.nextInt(11);
				}*/
				num = randomico.nextInt(21);
				if(num != 0){
					return arraylist.get(num).toString();
				}
				else{
					return arraylist.get(5).toString();
				}
				
				    
				
				}
			}
		
		}




   



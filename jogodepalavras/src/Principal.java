import java.util.Random;
import java.util.Scanner;


public class Principal {

	private static Object instancia;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implementar
		// criar 2 métodos: embaralhar e verificar resultado
		Scanner in = new Scanner(System.in);
		
		
		//Criando a instância da Fabrica de Mecânica do jogo
		FabricaMecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo();
				
		//Fazendo a instância da mecânica do jogo e acessando o método que realiza a mecânica do jogo.
		while ((MecanicaDoJogo1.contador < 11) || (MecanicaDoJogo2.pontuacao < 16)){
			MecanicaDoJogo instancia = (MecanicaDoJogo) mecanicaDoJogo.retornaMecanicaDoJogoAleatoriamente();
			instancia.embaralha();
			System.out.println("Qual é a palavra?");
			String palavra = in.nextLine();
			((MecanicaDoJogo) instancia).realizaMecanicaDoJogo(palavra);
		}
		
		
		/*BancoDePalavras banco  = new BancoDePalavras();
		
		String var;
				 
		var = banco.lendoArquivo();
		System.out.println(var);
		*/
		
		
		//testando embaralhador
		/*
		Embaralhador1 emb = new Embaralhador1();
		String var = emb.retornaPalavra();
		System.out.println(var);

		
		String var1 = emb.embaralhaPalavras();
		System.out.println(var1);
		
		//Embaralhador2
		Embaralhador2 embre = new Embaralhador2();
		String var2 = emb.retornaPalavra();
		System.out.println(var2);
		
		String var3 = emb.embaralhaPalavras();
		System.out.println(var3);
		*/
		
		//testando nova fabrica embaralhador
		/*
		FabricaEmbaralhadores emb = new FabricaEmbaralhadores();
		Embaralhador teste = (Embaralhador) emb.retornaEmbaralhadorAleatoriamente();
		System.out.println(teste.retornaPalavra());
		System.out.println(teste.embaralhaPalavras());
		*/
		
		/*
		//testando escolhendo embaralhador
		FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
		int var = fabrica.retornaEmbaralhadorAleatoriamente();
		System.out.println(var);
		*/
		
		
		//testando fábrica de mecanica do jogo
		/*
		 FabricaMecanicaDoJogo mecanica = new FabricaMecanicaDoJogo();
		 MecanicaDoJogo teste = (MecanicaDoJogo) mecanica.retornaMecanicaDoJogoAleatoriamente();
		 teste.realizaMecanicaDoJogo("televisao");
		 */
	}

}

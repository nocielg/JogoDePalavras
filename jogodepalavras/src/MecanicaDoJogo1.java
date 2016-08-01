import java.util.*;

public class MecanicaDoJogo1 implements MecanicaDoJogo {

double pontuacao = 0;

public static int contador = 0;
String palavraOriginal = "";
String embaralhaPalavra = "";

	
	
	//Método que define a mecânica do jogo
	/* O jogador poderá jogar 10 rodadas. Quando ele acertar a palavra receberá um ponto, e quando errar receberá menos um ponto. No fim do jgoo o jogador receberá
	 * a sua pontuação*/

	@Override
	public double realizaMecanicaDoJogo(String palavraDigitada) {
		
		
		if (contador < 11){
					
			if (palavraDigitada.equals(palavraOriginal)){
					System.out.println("Você acertou");
					pontuacao++;
					contador++;
			}
			else{
					System.out.println("Você errou");
					pontuacao--;
					contador++;
			}
		}
		else{
			System.out.println("O jogo terminou");
		}
					
		return pontuacao;
				
	}

	@Override
	public void embaralha() {
		// TODO Auto-generated method stub
		FabricaEmbaralhadores emb = new FabricaEmbaralhadores();
		Embaralhador embaralhando = (Embaralhador) emb.retornaEmbaralhadorAleatoriamente();
		palavraOriginal = embaralhando.retornaPalavra();
		embaralhaPalavra  = embaralhando.embaralhaPalavras();
		System.out.println("A palavra que você terá que advinhar é:" + embaralhaPalavra);
		
		
	}

}


public class MecanicaDoJogo2 implements MecanicaDoJogo{

public static double pontuacao = 0;
String palavraOriginal = "";
String embaralhaPalavra = "";


	@Override
	public void embaralha() {
	// TODO Auto-generated method stub
		FabricaEmbaralhadores emb = new FabricaEmbaralhadores();
		Embaralhador embaralhando = (Embaralhador) emb.retornaEmbaralhadorAleatoriamente();				
		palavraOriginal = embaralhando.retornaPalavra();
		embaralhaPalavra  = embaralhando.embaralhaPalavras();
		System.out.println("A palavra que você terá que advinhar é:" + embaralhaPalavra);
		
	}	
	
	//Método que define a mecânica do jogo
	/* Quando o jogador acertar a palavra receberá um ponto, e quando errar receberá zero pontos. No fim do jogo o jogador receberá
	 * a sua pontuação. O jogo continuará até o jogador acertar 15 palavras.*/

	@Override
	public double realizaMecanicaDoJogo(String palavraDigitada) {
		
		
		if (pontuacao < 16){
			
			
			if (palavraDigitada.equals(palavraOriginal)){
				System.out.println("Você acertou.");
				pontuacao++;
			}
			else{
				System.out.println("Você errou.");
				pontuacao = pontuacao;
			
			}
		}
		else{
			System.out.println("O jogo terminou");
		}
			
		return pontuacao;
	}


}

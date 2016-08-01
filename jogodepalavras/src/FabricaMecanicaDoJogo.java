import java.util.Random;


public class FabricaMecanicaDoJogo {
	
	//Escolhendo a mecanica do jogo aleatoriamente.
		public Object retornaMecanicaDoJogoAleatoriamente(){
		int retornoEmbaralhador = 1;
		Random randomico = new Random();
		
			retornoEmbaralhador = randomico.nextInt(3);
			if (retornoEmbaralhador != 0 && retornoEmbaralhador == 1){
				
				return new MecanicaDoJogo1();
			}
			else{
				
				return new MecanicaDoJogo2();
			}
		}
	
}

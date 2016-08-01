import java.util.Random;


public class FabricaEmbaralhadores {

	//Escolhendo o embaralhador aleatoriamente.
	public Object retornaEmbaralhadorAleatoriamente(){
	int retornoEmbaralhador = 1;
	Random randomico = new Random();
	
		retornoEmbaralhador = randomico.nextInt(3);
		if (retornoEmbaralhador != 0 && retornoEmbaralhador == 1){
			
			return new Embaralhador1();
		}
		else{
			
			return new Embaralhador2();
		}
	}
}

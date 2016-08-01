import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Embaralhador2 implements Embaralhador {

	String palavra;
		
	@Override
	public String retornaPalavra() {
		// Acessando o método que lerá o arquivo e retornará uma palavra,randomicamente, do mesmo
				BancoDePalavras banco = new BancoDePalavras();
				String var = banco.lendoArquivo();
		palavra = var;
		return var;
	}

	@Override
	public String embaralhaPalavras() {
		//Embaralhando usando expressão regular		
		List<String> letters = Arrays.asList(palavra.split(""));
		Collections.shuffle(letters);
		StringBuilder t = new StringBuilder(palavra.length());
		for (String k : letters) {
			t.append(k);
		}
		return t.toString();
		
	}



	
}
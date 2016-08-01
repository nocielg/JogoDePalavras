

public class Embaralhador1 implements Embaralhador{
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
	public String embaralhaPalavras(){
		
		//Invertendo a string por meio do StringBuffer
		StringBuffer varInvertida = new StringBuffer(palavra);
		varInvertida.reverse();
		return varInvertida.toString();
	}
}


import static org.junit.Assert.*;
import org.junit.Test;

public class testeEmbaralhamento {

	@Test
	public void test() {
		
		//testando embaralhador1
		Embaralhador1 emb = new Embaralhador1();
		String palavra = emb.retornaPalavra();
		String palavraEmbaralhada = emb.embaralhaPalavras(); 
		assertFalse(palavra, palavraEmbaralhada);
		
		//testando embaralhando2
		Embaralhador2 emb1 = new Embaralhador2();
		String palavra1 = emb1.retornaPalavra();
		String palavraEmbaralhada1 = emb1.embaralhaPalavras(); 
		assertFalse(palavra1, palavraEmbaralhada1);
	}

	private void assertFalse(String palavra, String palavraEmbaralhada) {
		// TODO Auto-generated method stub
		
	}

}

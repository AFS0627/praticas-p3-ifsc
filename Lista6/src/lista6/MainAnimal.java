package lista6;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.setCor("branco");
		gato.setNumPatas(4);
		gato.setRaca("persa");
		gato.setComprimento(47f);
		gato.setNome("Branquinho");
		gato.setEcosistema("Casa");
		
		
	Cachorro cachorro = new Cachorro();
	
	cachorro.setCor("preto");
	cachorro.setNumPatas(4);
	cachorro.setRaca("pastor");
	cachorro.setNome("Cacau");
	cachorro.setEcosistema("Casa");
	cachorro.setComprimento(48f);
	
	System.out.println("CACHORRO:");
	System.out.println("nome: "+ cachorro.getNome());
	System.out.println("raça: "+ cachorro.getRaca());
	System.out.println("numero de patas: "+ cachorro.getNumPatas());
	System.out.println("Cor: "+ cachorro.getCor());
	System.out.println("Comprimento: "+ cachorro.getComprimento());
	System.out.println("Ecosistema: "+ cachorro.getEcosistema());
	cachorro.late();
	cachorro.caminha();
	
	System.out.println("\nGATO:");
	System.out.println("nome: "+ gato.getNome());
	System.out.println("raça: "+ gato.getRaca());
	System.out.println("numero de patas: "+ gato.getNumPatas());
	System.out.println("Cor: "+ gato.getCor());
	System.out.println("Comprimento: "+ gato.getComprimento());
	System.out.println("Ecosistema: "+ gato.getEcosistema());
	gato.mia();
	cachorro.caminha();
	}

}

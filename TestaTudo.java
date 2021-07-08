package br.com.generation.plataforma0707pt2;

public class TestaTudo {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		PreguiÁa preg = new PreguiÁa();
		
		
		dog.setNome("Lupi");
		cav.setNome("Ihi");
		preg.setNome("Sonin");
		
		dog.setIdade(10);
		cav.setIdade(12);
		preg.setIdade(4);
		
		dog.setCorre("Corre dez metros");
		dog.setSom("au au au");
		
		cav.setCorre("Corre cinquenta quilometros");
		cav.setSom("Iiiihihihihi");
		
		preg.setMovimento("Subiu na arvore");
		preg.setSom("„„„„„„„us");
		
		System.out.println("====Animais====");
		System.out.println(preg.getNome());
		System.out.println(preg.getIdade());
		System.out.println(preg.getSom());
		System.out.println(preg.getMovimento());
		System.out.println();
		System.out.println(cav.getNome());
		System.out.println(cav.getIdade());
		System.out.println(cav.getCorre());
		System.out.println(cav.getSom());
		System.out.println();
		System.out.println(dog.getNome());
		System.out.println(dog.getIdade());
		System.out.println(dog.getCorre());
		System.out.println(dog.getSom());
	}

}

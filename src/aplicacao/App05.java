package aplicacao;

import entidades.Cliente;

public class App05 {

	public static void main(String[] args) {
		
		Cliente c1= new Cliente("Maria", "maria@gmail.com");
		Cliente c2= new Cliente("Maria", "maria@gmail.com");
		
		String s1= "Teste";
		String s2= "Teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);

	}

}

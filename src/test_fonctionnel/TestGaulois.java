package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois(8,"Astérix");
		System.out.println(asterix.getName());
		asterix.parler("Bonjour à tous ");
		Romain minus = new Romain(6,"Minus");
		minus.parler("UN GAU... UN GAUGAU...");
		/*for(int i = 0;i<2;i++)
		{
			minus.recevoirCoup(3);
		}*/
		for(int i = 0;i<3;i++)
		{
			asterix.frapper(minus)
		}
	}
}

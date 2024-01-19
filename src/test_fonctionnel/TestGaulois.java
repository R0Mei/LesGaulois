package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois(8,"Astérix");
		System.out.println(asterix.getName());
	}
}

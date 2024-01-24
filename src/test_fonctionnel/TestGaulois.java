package test_fonctionnel;

import personnages.*;
import sites.*;

public class TestGaulois 
{
	public static void main(String[] args) 
	{
		Soldat minus = new Soldat(2,"Minus",Grade.SOLDAT);
		Camp camp = new Camp(minus);
		
		Gaulois vercingetorix = new Gaulois(5,"Vercingétorix");
		Village village = new Village(vercingetorix);
		
		Gaulois agecanonix = new Gaulois(1,"Agecanonix");
		Gaulois assurancetourix = new Gaulois(2,"Assurancetourix");
		Gaulois asterix = new Gaulois(5,"Astérix");
		Gaulois obelix = new Gaulois(5,"Ostérix");
		Gaulois prolix = new Gaulois(5,"Astérix");
		
		Soldat brutus = new Soldat(5,"Brutus",Grade.CENTURION);
		Soldat milexcus = new Soldat(2,"Milexcus",Grade.SOLDAT);
		Soldat tullius = new Soldat(2,"Tullius Octopus",Grade.OPTIO);
		
		camp.ajouterSoldat(Soldat soldat);
		
		/*
		Gaulois asterix = new Gaulois(8,"Astérix");
		asterix.parler("Bonjour à  tous ");
		
		minus.parler("UN GAU... UN GAUGAU...");
		for(int i = 0;i<2;i++)
		{
			minus.recevoirCoup(3);
		}
		for(int i = 0;i<2	;i++)
		{
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		asterix.frapper(minus);
		*/
	}
}

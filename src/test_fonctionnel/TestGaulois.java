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
		
		System.out.println(""); 
		Gaulois agecanonix = new Gaulois(1,"Agecanonix");
		Gaulois assurancetourix = new Gaulois(2,"Assurancetourix");
		Gaulois asterix = new Gaulois(5,"Astérix");
		Gaulois obelix = new Gaulois(5,"Obélix");
		Gaulois prolix = new Gaulois(5,"Prolix");
		Gaulois abrara = new Gaulois(5,"Abraracourcix");
		
		Soldat brutus = new Soldat(5,"Brutus",Grade.CENTURION);
		Soldat milexcus = new Soldat(2,"Milexcus",Grade.SOLDAT);
		Soldat tullius = new Soldat(2,"Tullius Octopus",Grade.TESSERARIUS);
		Soldat ballon = new Soldat(3,"Ballondebaudrus",Grade.OPTIO);
		Soldat briseradius = new Soldat(4,"Briseradius",Grade.SOLDAT);
		Soldat chorus = new Soldat(4 ,"Chorus",Grade.CENTURION);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballon);
		System.out.println("");
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		village.afficherVillageois();
		camp.afficherCamp();
		
		village.changerChef(abrara);
		
		System.out.println("");
		System.out.println("AFFICHAGE ATTENDU :");
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
		System.out.println("");
		Druide panoramix = new Druide(1,"Panoramix");
		panoramix.fabricationPotion(3);
		
		asterix.glouglou(panoramix);
		obelix.glouglou(panoramix);
		assurancetourix.glouglou(panoramix);
		abrara.glouglou(panoramix);
		agecanonix.glouglou(panoramix);
		asterix.parler("Bonjour à  tous ");
		System.out.println(""); 
		minus.parler("UN GAU... UN GAUGAU...");
		for(int i = 0;i<2	;i++)
		{
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}

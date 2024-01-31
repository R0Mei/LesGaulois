package sites;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;


public class Village {
	public Gaulois chef;
	
	public Gaulois[] gaulois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		gaulois = new Gaulois[4];
		System.out.println("Le "+chef.donnerAuteur()+" "+chef.getName()+" : \" Je suis un grand guerrier et je vais créer mon village \".");
	}
	public String getChef()
	{
		return chef.getName();
	}
	public void ajouterVillageois(Gaulois villageois)
	{
		for(int i = 0;i<4;i++)
		{
			if(gaulois[i]==null)
			{
				gaulois[i]=villageois;
				System.out.println("Le "+chef.getName()+" : \" Bienvenue "+villageois.getName()+" ! \".");
				return;
			}
		}
		System.out.println("Le "+chef.getName()+" :  Désolé "+villageois.getName()+" mon village est déjà bien rempli.");
	}
	public void afficherVillageois() {
		System.out.println("");
		System.out.println("AFFICHAGE ATTENDU :");
		System.out.println("Le village de "+chef.donnerAuteur()+" est habité par : ");
		for(int i = 0; i<4;i++) {
			if(gaulois[i]==null) {
				break;
			}
			System.out.println("- "+gaulois[i].getName());
			
		}
	}
	public void changerChef(Gaulois villageois) {
		System.out.println("");
		System.out.println("AFFICHAGE ATTENDU :");
		System.out.println("Le gaulois "+chef.getName()+" : \" Je laisse mon grand bouclier au grand "+villageois.getName()+" \".");
		chef=villageois;
		System.out.println("Le gaulois "+chef.getName()+" : \" Merci ! \".");
	}
}

package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp 
{
	public Soldat commandant;
	public Soldat[] soldats;
	
	public Camp(Soldat commandant) 
	{
		this.commandant = commandant;
		soldats = new Soldat[3];
		System.out.println("Le "+commandant.donnerAuteur()+" "+commandant.getName()+" : \" Je suis en charge de créer un nouveau camp romain. \".");
	}
	public String getCommandant()
	{
		return commandant.getName();
	}
	public void ajouterSoldat(Soldat soldat)
	{
		for(int i = 0;i<3;i++)
		{
			if(soldats[i]==null)
			{
				soldats[i]=soldat;
				System.out.println("Le "+soldat.donnerAuteur()+" "+soldat.getName()+" : \" Je mets mon épée au service de Rome dans le camp dirigé par "+commandant.getName()+". \".");
				return;
			}
		}
		System.out.println("Le "+commandant.getName()+" : \" Désolé "+soldat.getName()+" notre camp est complet ! \".");
	}
	public void afficherCamp() {	
		System.out.println("");
		System.out.println("AFFICHAGE ATTENDU :");
		System.out.println("Le camp dirigé par "+commandant.getName()+" contient les soldats : ");
		for(int i = 0; i<3;i++) {
			if(soldats[i]==null) {
				break;
			}
			System.out.println("- "+soldats[i].getName());
			
		}
	}
	public void changerCommandant(Soldat soldat) {
		if(soldat.grade==Grade.CENTURION) {
			commandant=soldat;
			System.out.println("Le romain "+commandant.getName()+" : \" Moi "+commandant.getName()+ " je prends la direction du camp romain.\".");
		}
		else {
			System.out.println("Le romain "+soldat.getName()+" : \" Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.\".");
		}
	}
}

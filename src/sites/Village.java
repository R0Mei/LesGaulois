package sites;

import personnages.Gaulois;


public class Village {
	private Gaulois chef;
	
	private Gaulois[] gaulois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		gaulois = new Gaulois[80];
		System.out.println("Le "+chef.donnerAuteur()+" "+chef.getName()+" : \" Je suis un grand guerrier et je vais cr�er mon village \".");
	}
	public String getChef()
	{
		return chef.getName();
	}
	public void ajouterVillageois(Gaulois villageois)
	{
		for(int i = 0;i<80;i++)
		{
			if(gaulois[i]==null)
			{
				gaulois[i]=villageois;
				System.out.println("Le "+chef.getName()+" : \" Bienvenue "+villageois.getName()+" ! \".");
				break;
			}
		}
		System.out.println("Le "+chef.getName()+" :  D�sol� "+villageois.getName()+" mon village est d�j� bien rempli.");
	}
}

package sites;

import personnages.Soldat;

public class Camp 
{
	private Soldat commandant;
	
	private Soldat[] soldats;
	
	public Camp(Soldat commandant) 
	{
		this.commandant = commandant;
		soldats = new Soldat[80];
		System.out.println("Le "+commandant.donnerAuteur()+" "+commandant.getName()+" : \" Je suis en charge de cr�er un nouveau camp romain. \".");
	}
	public String getCommandant()
	{
		return commandant.getName();
	}
	public void ajouterSoldat(Soldat soldat)
	{
		for(int i = 0;i<80;i++)
		{
			if(soldats[i]==null)
			{
				soldats[i]=soldat;
				System.out.println("Le "+soldat.donnerAuteur()+" "+soldat.getName()+" : \" Je mets mon �p�e au service de Rome dans le camp dirig� par "+commandant.getName()+". \".");
				break;
			}
		}
	}
}

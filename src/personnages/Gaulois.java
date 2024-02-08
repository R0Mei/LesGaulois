package personnages;

public class Gaulois extends Personnages
{
	public Gaulois(int force, String name) 
	{
		super(force, name);
	}

	public String donnerAuteur()
	{
		return ("gaulois");
	}
	public void glouglou( Druide druide) {
		if("Ob�lix".equals(this.getName()))
		{
			System.out.println("Le gaulois "+druide.getName()+" : \"Non, Ob�lix Non !... Tu est assez gros comme �a ! \".");
		}
		else
		{
			this.potion = druide.getPotion();
			if(potion==1) {
				System.out.println("Le gaulois "+druide.getName()+" : \" D�sol� "+this.getName()+" il n'y a plus une seule goutte de potion.\".");	
			}
			else
			{
				System.out.println("Le gaulois "+druide.getName()+" : \"Tiens "+this.getName()+" un peu de potion magique. \".");
			}
		}
	}
	public void frapper(Personnages adversaire)
	{

		System.out.println("Le "+donnerAuteur()+" "+getName()+" envoie un grand coup d'une puissance de "+(this.force*this.potion)/3+" dans la machoire de "+adversaire.getName()+".");
		newForce = this.force*this.potion;
		
		adversaire.recevoirCoup(newForce/3);
		if(this.potion>1) {
			this.potion-=0.5;
		}
	}
}

package personnages;

public abstract class Personnages {
	private String nom;
	protected int force;
	protected int potion;
	protected int newForce;
	protected int[] equipement = new int[3];
	protected Personnages(int force, String name) 
	{
		this.force = force;
		this.nom = name;
		potion = 1;
		for(int i = 0;i<equipement.length;i++) {
			equipement[i]=0;
		}
	}
	
	public String getName()
	{
		return(nom);
	}
	public void parler(String phrase) 
	{
		System.out.println("Le "+donnerAuteur()+" "+getName()+" : \""+ phrase+"\".");
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnages adversaire)
	{

		System.out.println("Le "+donnerAuteur()+" "+getName()+" envoie un grand coup d'une puissance de "+this.force*this.potion/3+" dans la machoire de "+adversaire.getName()+".");
		newForce = this.force*this.potion;
		
		adversaire.recevoirCoup(newForce/3);
		if(this.potion>1) {
			this.potion-=0.5;
		}
	}
	public void recevoirCoup(int forceCoup)
	{
		force -= forceCoup;
		if(force<=0) {
			force=0;
			parler("J'abandonne... ");
		}
		else
		{
			parler("Aie ! ");
		}
		
	}
}

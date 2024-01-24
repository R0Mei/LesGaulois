package personnages;

public abstract class Personnages {
	private String nom;
	private int force;
	
	protected Personnages(int force, String name) 
	{
		this.force = force;
		this.nom = name;
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

		System.out.println("Le "+donnerAuteur()+" "+getName()+" envoie un grand coup dans la machoire de "+adversaire.getName()+".");
		adversaire.recevoirCoup(force/3);
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

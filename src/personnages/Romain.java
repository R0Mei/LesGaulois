package personnages;

public class Romain 
{
	private int force;
	private String name; 
	public Romain(int force, String name) 
	{
		this.force = force;
		this.name = name;
	}
	public String getName()
	{
		return(name);
	}
	public void parler(String phrase) 
	{
		System.out.println("Le romain "+name+" : \""+ phrase+"\".");
	}
	public void recevoirCoup(int forceG)
	{
		force -= forceG;
		if(force<0) {
			force=0;
		}
		if(force==0) {
			System.out.println("J'abandonne... ");
		}
		else
		{
			System.out.println("Aïe ! ");
		}
		
	}
}

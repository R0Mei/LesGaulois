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
}

package personnages;

public class Romain extends Personnages
{
	public Romain(int force, String name) {
		super(force, name);
	}

	public String donnerAuteur()
	{
		return ("romain");
	}
	public void equipement() {
		
	}
	public void frapper(Personnages adversaire)
	{

		System.out.println("Le "+donnerAuteur()+" "+getName()+" envoie un grand coup d'une puissance de "+this.force/3+" dans la machoire de "+adversaire.getName()+".");
		adversaire.recevoirCoup(this.force/3);
	}
}
